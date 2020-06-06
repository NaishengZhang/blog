package edu.nyu.blog.po;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_blog")
@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Blog {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;
    private String firstPicture;
    private String flag;
    private Integer views;
    private boolean appreciation;
    private boolean shareStatement;
    private boolean commentabled;
    private boolean published;
    private boolean recommend;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;


}
