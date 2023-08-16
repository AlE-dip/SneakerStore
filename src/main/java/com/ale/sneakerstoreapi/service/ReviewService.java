package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.mapper.input.ReviewInput;
import com.ale.sneakerstoreapi.mapper.view.preview.ReviewView;
import org.springframework.util.MultiValueMap;

import java.util.List;
import java.util.Map;

public interface ReviewService {
    Long addReview(Map<String, String> body);


    List<ReviewView> searchLike(String keyword);
}
