package com.deidaraxc4.wouldyourather.service.impl;

import com.deidaraxc4.wouldyourather.model.WyrQuestion;
import com.deidaraxc4.wouldyourather.repository.WyrRepository;
import com.deidaraxc4.wouldyourather.service.WyrService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WyrServiceImpl implements WyrService {
    
    @Autowired
    private WyrRepository repository;

    @Override
    public List<WyrQuestion> findAll() {
	List<WyrQuestion> wyrQuestions = (List<WyrQuestion>) repository.findAll();
	return wyrQuestions;
    }
     
}