package edu.nyu.blog.po;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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

}
