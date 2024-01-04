package com.virtus.demoBootstrap.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.virtus.demoBootstrap.entity.newsEntity;

@Repository
public interface newsRepository extends JpaRepository<newsEntity, Long> {
  
//  List<newsEntity> findAll();
}
