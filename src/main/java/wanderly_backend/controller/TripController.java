package wanderly_backend.controller;

import wanderly_backend.model.Trip;
import wanderly_backend.repository.TripRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trips")
@CrossOrigin(origins = "http://localhost:5173")
public class TripController {

    private final TripRepository tripRepository;

    public TripController(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    @GetMapping
    public List<Trip> getTrips(@RequestParam String clientId) {
        return tripRepository.findByClientIdOrderByCreatedAtDesc(clientId);
    }

    @PostMapping
    public ResponseEntity<?> saveTrip(@RequestBody Trip trip) {
        if (trip.getClientId() == null || trip.getClientId().isBlank()) {
            return ResponseEntity.badRequest().body("clientId is required");
        }
        if (trip.getDestination() == null || trip.getDestination().isBlank()) {
            return ResponseEntity.badRequest().body("destination is required");
        }
        trip.setId(null);
        return ResponseEntity.ok(tripRepository.save(trip));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTrip(
            @PathVariable Long id,
            @RequestParam String clientId) {

        return tripRepository.findById(id)
                .filter(trip -> clientId.equals(trip.getClientId()))
                .map(trip -> {
                    tripRepository.delete(trip);
                    return ResponseEntity.ok().body("Trip deleted successfully");
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
