package edu.nyu.blog.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class BlogQuery {

    private String title;
    private Long typeId;
    private boolean recommend;

}
