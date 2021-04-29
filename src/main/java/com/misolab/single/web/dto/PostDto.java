package com.misolab.single.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PostDto {
    String title;
    String subtitle;
    String writer;
    String updated;
    String link;
    String content;
    String background;
}
