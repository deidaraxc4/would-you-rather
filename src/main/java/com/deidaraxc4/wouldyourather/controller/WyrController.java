package com.deidaraxc4.wouldyourather.controller;

import com.deidaraxc4.wouldyourather.model.WyrQuestion;
import com.deidaraxc4.wouldyourather.service.WyrService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class WyrController {
    
    @Autowired
    WyrService wyrService;

    @RequestMapping(value = "/questions", method = RequestMethod.GET)
    public List<WyrQuestion> findWyrQuestions() {
	List<WyrQuestion> wyrQuestions = (List<WyrQuestion>) wyrService.findAll();

	return wyrQuestions;
    }

}