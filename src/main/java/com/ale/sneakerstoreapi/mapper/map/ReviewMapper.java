package com.ale.sneakerstoreapi.mapper.map;

import com.ale.sneakerstoreapi.entity.Review;
import com.ale.sneakerstoreapi.mapper.input.ReviewInput;
import org.modelmapper.ModelMapper;

public interface ReviewMapper {

    static ReviewMapper getInstance() {
        return new ReviewMapper() {};
    }

    default Review toPreview(ReviewInput reviewInput, ModelMapper mapper) {
        Review review = mapper.map(reviewInput, Review.class);
        return review;
    }
}
