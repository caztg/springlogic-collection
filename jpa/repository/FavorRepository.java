package cn.springlogic.collection.jpa.repository;

import cn.springlogic.collection.jpa.entity.Favor;
import cn.springlogic.collection.jpa.entity.rest.FavorInfoProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by admin on 2017/4/25.
 */
@RepositoryRestResource(path = "collection:favor", excerptProjection = FavorInfoProjection.class)
public interface FavorRepository extends JpaRepository<Favor, Integer> {

}
