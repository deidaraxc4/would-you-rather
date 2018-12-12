package com.deidaraxc4.wouldyourather.service;

import com.deidaraxc4.wouldyourather.model.WyrQuestion;
import java.util.List;

public interface WyrService {

    List<WyrQuestion> findAll();
    
    WyrQuestion findById(Long id);
    
    void deleteById(Long id);
    
    WyrQuestion save(WyrQuestion wyrQuestion);

    /**
     * Vote on existing WyrQuestion
     * @param wyrQuestion the WyrQuestion being voted on
     * @param id 0 to indicate voting for choice a, 1 to indicate voting for choice b, else throw exception
     */
    WyrQuestion vote(WyrQuestion wyrQuestion, int id);

}
