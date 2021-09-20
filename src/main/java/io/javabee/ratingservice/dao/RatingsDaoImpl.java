package io.javabee.ratingservice.dao;

import java.util.Optional;

import org.springframework.stereotype.Component;

import io.javabee.ratingservice.entities.Rating;
import io.javabee.ratingservice.repository.RatingsRepository;

@Component
public class RatingsDaoImpl implements RatingsDao {

    RatingsRepository ratingsRepository;

    public RatingsDaoImpl(RatingsRepository ratingsRepository) {
        this.ratingsRepository = ratingsRepository;
    }

    @Override
    public Optional<Rating> findRatingById(Long ratingsId) {

        return ratingsRepository.findById(ratingsId);
    }

}
