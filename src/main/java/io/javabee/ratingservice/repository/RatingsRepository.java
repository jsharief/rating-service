package io.javabee.ratingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.javabee.ratingservice.entities.Rating;

@Repository
public interface RatingsRepository extends JpaRepository<Rating, Long> {

}
