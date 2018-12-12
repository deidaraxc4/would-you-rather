package com.deidaraxc4.wouldyourather.repository;

import com.deidaraxc4.wouldyourather.model.WyrQuestion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WyrRepository extends CrudRepository<WyrQuestion,Long> {
    
}
