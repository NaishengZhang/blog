package edu.nyu.blog.po;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    @ManyToOne
    private Blog blog;

    @OneToMany(mappedBy = "parentComment")
    private List<Comment> replyComments = new ArrayList<>(); //child
    @ManyToOne
    private Comment parentComment; //相连的parent
}
