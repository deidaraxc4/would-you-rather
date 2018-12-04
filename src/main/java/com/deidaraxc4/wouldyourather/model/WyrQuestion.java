package com.deidaraxc4.wouldyourather.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "WYR_QUESTION")
@Getter @Setter @ToString
public class WyrQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String choice_a_text;
    private String choice_b_text;
    private int choice_a_votes;
    private int choice_b_votes;

    public WyrQuestion() {

    }

    public WyrQuestion(Long id, String choice_a_text,
		       String choice_b_text,
		       int choice_a_votes,
		       int choice_b_votes) {
	this.id = id;
	this.choice_a_text = choice_a_text;
	this.choice_b_text = choice_b_text;
	this.choice_a_votes = choice_a_votes;
	this.choice_b_votes = choice_b_votes;
    }
    
}