package io.javabee.ratingservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class RatingDTO {

    private Long accountId;

    private double rating;

    private int ratingCount;

    private Long productId;

}
