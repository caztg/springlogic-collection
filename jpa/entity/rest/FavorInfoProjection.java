package cn.springlogic.collection.jpa.entity.rest;

import cn.springlogic.blog.jpa.entity.rest.UserProjection;
import cn.springlogic.collection.jpa.entity.Favor;
import cn.springlogic.social.jpa.entity.Publication;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

/**
 * Created by admin on 2017/5/2.
 */
@Projection(name = "favorinfo", types = {Favor.class})
public interface FavorInfoProjection {

    int getId();

    Date getCreateTime();

    UserProjection getUser();

}
