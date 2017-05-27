package cn.springlogic.collection.jpa.repository;

import cn.springlogic.collection.jpa.entity.Collection;
import cn.springlogic.collection.jpa.entity.rest.CollectionInfoProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by admin on 2017/4/25.
 */
@RepositoryRestResource(path = "collection:collection", excerptProjection = CollectionInfoProjection.class)
public interface CollectionRepository extends JpaRepository<Collection, Integer> {

}
