package edu.nyu.blog.po;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name = "t_user")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private String email;
    private String avatar;
    private Integer type;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;
}
