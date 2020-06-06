package edu.nyu.blog.po;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_comment")
@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Comment {
    @Id
    @GeneratedValue
    private Long id;
    private String nickname;
    private String email;
    private String content;
    private String avatar;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
}
