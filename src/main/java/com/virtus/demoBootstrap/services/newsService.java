package com.virtus.demoBootstrap.services;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.virtus.demoBootstrap.entity.newsEntity;
import com.virtus.demoBootstrap.repository.newsRepository;

@Service
public class newsService {

  private static final Logger logger = LoggerFactory.getLogger(newsService.class);

  @Autowired
  private newsRepository newsRepository;

  public List<newsEntity> findAllNews() {
    try {
      List<newsEntity> allNews = new ArrayList<newsEntity>();
      logger.info("Found {} news entries.", allNews.size());
      allNews = newsRepository.findAll();
      return allNews;
    } catch (Exception e) {
      logger.error("Error occurred while fetching news entries.", e);
      throw new RuntimeException("Failed to retrieve news entries.", e);
    }
  }
}
