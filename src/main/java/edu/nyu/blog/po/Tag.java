package edu.nyu.blog.po;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "t_tag")
@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Tag {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "tags")
    private List<Blog> blogs = new ArrayList<>();

}
