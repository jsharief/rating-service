package io.javabee.ratingservice.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import io.javabee.ratingservice.dao.RatingsDao;
import io.javabee.ratingservice.dto.RatingDTO;
import io.javabee.ratingservice.dto.RatingResource;
import io.javabee.ratingservice.entities.Rating;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RatingServiceImpl implements RatingService {

    RatingsDao ratingsDao;

    public RatingServiceImpl(RatingsDao ratingsDao) {
        this.ratingsDao = ratingsDao;
    }

    @Override
    public RatingResource getRatingById(Long id) {

        log.info(" Here is the Id  ", id);

        Optional<Rating> optional = ratingsDao.findRatingById(id);

        RatingResource ratingResponse = new RatingResource();
        if (optional.isPresent()) {

            log.info("Hello is present ");

            Rating rating = optional.get();

            RatingDTO ratingDTO = new RatingDTO(rating.getAccountId(), rating.getRating(), 3, rating.getProductId());

            ratingResponse.getRatings().add(ratingDTO);

        }

        return ratingResponse;
    }

}
