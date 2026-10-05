package wanderly_backend.repository;

import wanderly_backend.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TripRepository extends JpaRepository<Trip, Long> {
    List<Trip> findByClientIdOrderByCreatedAtDesc(String clientId);
}
