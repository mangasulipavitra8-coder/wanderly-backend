package wanderly_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "destinations")
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String country;
    private String category;
    private Double rating;
    private Integer reviews;
    private String image;

    @Column(length = 1000)
    private String description;

    private String bestTime;
    private String budget;

    public Destination() {
    }

    public Destination(String name, String country, String category,
                        Double rating, Integer reviews, String image,
                        String description, String bestTime, String budget) {
        this.name = name;
        this.country = country;
        this.category = category;
        this.rating = rating;
        this.reviews = reviews;
        this.image = image;
        this.description = description;
        this.bestTime = bestTime;
        this.budget = budget;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getCategory() {
        return category;
    }

    public Double getRating() {
        return rating;
    }

    public Integer getReviews() {
        return reviews;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getBestTime() {
        return bestTime;
    }

    public String getBudget() {
        return budget;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setReviews(Integer reviews) {
        this.reviews = reviews;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBestTime(String bestTime) {
        this.bestTime = bestTime;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }
}