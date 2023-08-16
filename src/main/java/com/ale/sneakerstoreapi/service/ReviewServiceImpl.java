package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.entity.Review;
import com.ale.sneakerstoreapi.mapper.input.ReviewInput;
import com.ale.sneakerstoreapi.mapper.map.ReviewMapper;
import com.ale.sneakerstoreapi.mapper.view.preview.ReviewView;
import com.ale.sneakerstoreapi.repository.ReviewRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    private final ReviewMapper reviewMapper = ReviewMapper.getInstance();
    private ReviewRepository reviewRepository;
    private UserService userService;
    private ModelMapper mapper;


    @Override
    public Long addReview(Map<String, String> paramMap) {
        Review review = new Review();
        review.setTitle(paramMap.get("title"));
        review.setContent(paramMap.get("content"));
        review.setUser(userService.findById(UUID.fromString(paramMap.get("uuid"))));
        reviewRepository.save(review);
        return review.getId();
    }

    @Override
    public List<ReviewView> searchLike(String keyword) {
        List<Review> reviews = reviewRepository.searchKeyword(keyword);
        return reviews.stream()
                .map(review -> mapper.map(review, ReviewView.class))
                .toList();
    }
}
