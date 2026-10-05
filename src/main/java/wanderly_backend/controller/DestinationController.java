package wanderly_backend.controller;

import wanderly_backend.model.Destination;
import wanderly_backend.repository.DestinationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/destinations")
@CrossOrigin(origins = "http://localhost:5173")
public class DestinationController {

    private final DestinationRepository destinationRepository;

    public DestinationController(DestinationRepository destinationRepository) {
        this.destinationRepository = destinationRepository;
    }

    @GetMapping
    public List<Destination> getAllDestinations() {
        return destinationRepository.findAll();
    }

    @GetMapping("/{id}")
    public Destination getDestinationById(@PathVariable Long id) {
        return destinationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Destination not found"));
    }

    @PostMapping
    public Destination createDestination(@RequestBody Destination destination) {
        return destinationRepository.save(destination);
    }

    @DeleteMapping("/{id}")
    public void deleteDestination(@PathVariable Long id) {
        destinationRepository.deleteById(id);
    }
}