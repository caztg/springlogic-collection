package cn.springlogic.collection.jpa.entity;

import cn.springlogic.user.jpa.entity.User;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by admin on 2017/4/25.
 */
@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Favor {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "create_time", nullable = false)
    @CreationTimestamp
    private Date createTime;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

}
