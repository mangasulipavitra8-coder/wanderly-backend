package wanderly_backend.config;

import wanderly_backend.model.Destination;
import wanderly_backend.repository.DestinationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner loadDestinations(DestinationRepository repository) {

        return args -> {

            if (repository.count() == 0) {

                repository.save(new Destination(
                        "Goa",
                        "India",
                        "Beach",
                        4.8,
                        1250,
                        "https://images.unsplash.com/photo-1512343879784-a960bf40e7f2?auto=format&fit=crop&w=1000&q=85",
                        "Beautiful beaches, nightlife, Portuguese heritage and relaxing coastal experiences.",
                        "November - February",
                        "₹8,000 - ₹20,000"
                ));

                repository.save(new Destination(
                        "Manali",
                        "India",
                        "Mountain",
                        4.7,
                        980,
                        "https://images.unsplash.com/photo-1626621341517-bbf3d9990a23?auto=format&fit=crop&w=1000&q=85",
                        "A scenic Himalayan destination known for mountains, valleys, adventure activities and snow.",
                        "October - February",
                        "₹10,000 - ₹25,000"
                ));

                repository.save(new Destination(
                        "Kerala",
                        "India",
                        "Nature",
                        4.8,
                        1100,
                        "https://images.unsplash.com/photo-1593693397690-362cb9666fc2?auto=format&fit=crop&w=1000&q=85",
                        "Explore backwaters, beaches, greenery, hill stations and traditional Kerala experiences.",
                        "September - March",
                        "₹9,000 - ₹22,000"
                ));

                repository.save(new Destination(
                        "Jaipur",
                        "India",
                        "Culture",
                        4.6,
                        870,
                        "https://images.unsplash.com/photo-1477587458883-47145ed94245?auto=format&fit=crop&w=1000&q=85",
                        "Discover royal palaces, forts, colorful markets and the rich culture of Rajasthan.",
                        "October - March",
                        "₹7,000 - ₹18,000"
                ));

                repository.save(new Destination(
                        "Munnar",
                        "India",
                        "Nature",
                        4.7,
                        760,
                        "https://images.unsplash.com/photo-1602216056096-3b40cc0c9944?auto=format&fit=crop&w=1000&q=85",
                        "A peaceful hill destination surrounded by tea plantations, misty mountains and waterfalls.",
                        "September - May",
                        "₹6,000 - ₹15,000"
                ));
            }
        };
    }
}