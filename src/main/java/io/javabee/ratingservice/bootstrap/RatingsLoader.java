package io.javabee.ratingservice.bootstrap;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import io.javabee.ratingservice.entities.Rating;
import io.javabee.ratingservice.repository.RatingsRepository;

@Component
public class RatingsLoader implements CommandLineRunner {

    @Autowired
    RatingsRepository ratingsRepository;

    @Override
    public void run(String... args) throws Exception {
        loadRatings();
    }

    public void loadRatings() {

        Rating rating1 = new Rating(1L, 1L, 3.3);
        Rating rating2 = new Rating(2L, 1L, 4.3);
        Rating rating3 = new Rating(3L, 1L, 2.3);
        Rating rating4 = new Rating(4L, 1L, 1.3);

        List<Rating> ratings = new ArrayList<>();
        ratings.add(rating1);
        ratings.add(rating2);
        ratings.add(rating3);
        ratings.add(rating4);
        ratingsRepository.saveAll(ratings);

    }

}
