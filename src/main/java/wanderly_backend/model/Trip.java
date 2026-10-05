package wanderly_backend.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "saved_trips")
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String clientId;

    @Column(nullable = false, length = 100)
    private String destination;

    private Integer days;
    private Integer travelers;

    @Column(length = 100)
    private String budget;

    private Double totalBudget;

    @Column(columnDefinition = "TEXT")
    private String itineraryJson;

    @Column(columnDefinition = "TEXT")
    private String aiPlan;

    private LocalDateTime createdAt;

    @PrePersist
    public void onCreate() {
        if (createdAt == null) {
            createdAt = LocalDateTime.now();
        }
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getClientId() { return clientId; }
    public void setClientId(String clientId) { this.clientId = clientId; }
    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }
    public Integer getDays() { return days; }
    public void setDays(Integer days) { this.days = days; }
    public Integer getTravelers() { return travelers; }
    public void setTravelers(Integer travelers) { this.travelers = travelers; }
    public String getBudget() { return budget; }
    public void setBudget(String budget) { this.budget = budget; }
    public Double getTotalBudget() { return totalBudget; }
    public void setTotalBudget(Double totalBudget) { this.totalBudget = totalBudget; }
    public String getItineraryJson() { return itineraryJson; }
    public void setItineraryJson(String itineraryJson) { this.itineraryJson = itineraryJson; }
    public String getAiPlan() { return aiPlan; }
    public void setAiPlan(String aiPlan) { this.aiPlan = aiPlan; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
