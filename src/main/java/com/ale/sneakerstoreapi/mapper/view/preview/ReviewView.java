package com.ale.sneakerstoreapi.mapper.view.preview;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReviewView {
    private Long id;
    private String title;
    private String content;
}
