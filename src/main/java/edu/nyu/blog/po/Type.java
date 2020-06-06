package edu.nyu.blog.po;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "t_type")
@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Type {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany(mappedBy = "type")
    private List<Blog> blogs = new ArrayList<>();
}
