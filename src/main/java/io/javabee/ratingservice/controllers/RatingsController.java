package io.javabee.ratingservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabee.ratingservice.dto.RatingResource;
import io.javabee.ratingservice.service.RatingService;

@RestController
@RequestMapping("/api/v1/rating")
public class RatingsController {

    RatingService ratingService;

    RatingsController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<RatingResource> getRating(@PathVariable Long id) {
        return new ResponseEntity<>(ratingService.getRatingById(id), HttpStatus.OK);
    }

}
