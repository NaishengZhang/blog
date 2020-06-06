package edu.nyu.blog.po;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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
}
