package cn.springlogic.collection.jpa.entity.rest;

import cn.springlogic.blog.jpa.entity.rest.UserProjection;
import org.springframework.data.rest.core.config.Projection;

import java.util.Collection;
import java.util.Date;

/**
 * Created by admin on 2017/5/2.
 */
@Projection(name = "collectioninfo", types = {Collection.class})
public interface CollectionInfoProjection {

    int getId();

    Date getCreateTime();

    UserProjection getUser();

}
