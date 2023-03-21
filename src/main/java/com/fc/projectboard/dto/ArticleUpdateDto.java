package com.fc.projectboard.dto;

import java.io.Serializable;

/**
 * A DTO for the {@link com.fc.projectboard.domain.Article} entity
 */

public record ArticleUpdateDto(String title, String content, String hashtag) implements Serializable {
    public static ArticleUpdateDto of(String title, String content, String hashtag){
        return new ArticleUpdateDto(title, content, hashtag);
    }
}
