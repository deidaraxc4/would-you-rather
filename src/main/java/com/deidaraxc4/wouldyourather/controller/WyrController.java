package com.deidaraxc4.wouldyourather.controller;

import com.deidaraxc4.wouldyourather.model.WyrQuestion;
import com.deidaraxc4.wouldyourather.service.WyrService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class WyrController {
    
    @Autowired
    WyrService wyrService;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/questions", method = RequestMethod.GET)
    public List<WyrQuestion> findAllWyrQuestions() {
	List<WyrQuestion> wyrQuestions = (List<WyrQuestion>) wyrService.findAll();

	return wyrQuestions;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/question/{questionId}", method = RequestMethod.GET)
    public WyrQuestion findOneWyrQuestion(@PathVariable Long questionId) {
	return wyrService.findById(questionId);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/questions", method = RequestMethod.POST)
    public WyrQuestion createWyrQuestion(@RequestBody WyrQuestion wyrQuestion) {
	return wyrService.save(wyrQuestion);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "question/{questionId}", method = RequestMethod.DELETE)
    public void deleteWyrQuestionById(@PathVariable Long questionId) {
	wyrService.deleteById(questionId);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "question/{questionId}", method = RequestMethod.PUT)
    public WyrQuestion voteWyrQuestion(@PathVariable Long questionId, @RequestParam(name="id",required=true) int id) {
	return wyrService.vote(wyrService.findById(questionId),id);
    }

}
