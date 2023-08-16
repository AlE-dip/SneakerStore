package com.ale.sneakerstoreapi.controller;

import com.ale.sneakerstoreapi.entity.User;
import com.ale.sneakerstoreapi.mapper.input.ReviewInput;
import com.ale.sneakerstoreapi.mapper.view.SuccessResponse;
import com.ale.sneakerstoreapi.mapper.view.preview.ReviewView;
import com.ale.sneakerstoreapi.service.ReviewService;
import com.ale.sneakerstoreapi.util.MessageContent;
import jakarta.annotation.security.RolesAllowed;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RolesAllowed({User.Role.Fields.ADMIN,User.Role.Fields.CUSTOMER})
@RequestMapping("review")
public class ReviewController {
    private static ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        ReviewController.reviewService = reviewService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    private SuccessResponse addReview(@RequestParam Map<String, String> body) {
        Long id = reviewService.addReview(body);
        return SuccessResponse.builder()
                .id(id)
                .message(MessageContent.EXECUTE_SUCCESS)
                .build();
    }

    @GetMapping("/search-like")
    @ResponseStatus(HttpStatus.OK)
    private List<ReviewView> addReview(String keyword) {
        return reviewService.searchLike(keyword);
    }
}
