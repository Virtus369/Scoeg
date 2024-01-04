package com.virtus.demoBootstrap.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;
import com.virtus.demoBootstrap.entity.newsEntity;
import com.virtus.demoBootstrap.services.newsService;

@Controller
public class newsController {

  @Autowired
  private newsService newsService;

//  @GetMapping("/newsService")
//  public ModelAndView findAllNews() { 
//    List<newsEntity> newsItems = newsService.findAllNews();
//    ModelAndView mav = new ModelAndView("newsPage");
//    mav.addObject("newsItems",newsItems);
//    return mav;
//  }
  
    @PostMapping("/newsService")
    public String addNewsService() {
    try {
      System.err.println("AddNewsService");
    } catch (Exception e) {
      return e.getMessage();
    }
    return "newsPage";
    }
}

