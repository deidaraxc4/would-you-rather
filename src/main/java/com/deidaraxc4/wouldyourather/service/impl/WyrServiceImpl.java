package com.deidaraxc4.wouldyourather.service.impl;

import com.deidaraxc4.wouldyourather.model.WyrQuestion;
import com.deidaraxc4.wouldyourather.repository.WyrRepository;
import com.deidaraxc4.wouldyourather.service.WyrService;
import com.deidaraxc4.wouldyourather.exception.ResourceNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.Exception;

@Service
public class WyrServiceImpl implements WyrService {
    
    @Autowired
    private WyrRepository repository;

    @Override
    public List<WyrQuestion> findAll() {
	List<WyrQuestion> wyrQuestions = (List<WyrQuestion>) repository.findAll();
	return wyrQuestions;
    }

    @Override
    public WyrQuestion findById(Long id) {
	return repository.findById(id)
	    .map(wyrQuestion -> {
		    return wyrQuestion;
		}).orElseThrow(() -> new ResourceNotFoundException("Question not found with id "+id));
    }

    @Override
    public void deleteById(Long id) {
	repository.deleteById(id);
    }

    @Override
    public WyrQuestion save(WyrQuestion wyrQuestion) {
	return repository.save(wyrQuestion);
    }

    @Override
    public WyrQuestion vote(WyrQuestion wyrQuestion, int id) {
	WyrQuestion wyr = wyrQuestion;
	if(id==0) {
	    wyr.setChoice_a_votes(wyr.getChoice_a_votes()+1);
	    save(wyr);
	    return wyr;
	} else if(id==1) {
	    wyr.setChoice_b_votes(wyr.getChoice_b_votes()+1);
	    save(wyr);
	    return wyr;
	} else {
	    // throw exception
	    return new WyrQuestion();
	}
    }

     
}
