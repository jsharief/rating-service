package io.javabee.ratingservice.dao;

import java.util.Optional;

import io.javabee.ratingservice.entities.Rating;

public interface RatingsDao {

    public Optional<Rating> findRatingById(Long ratingsId);
}