import { Component, OnInit } from '@angular/core';
import { Question } from './question.model';

@Component({
  selector: 'app-vote-question',
  templateUrl: './vote-question.component.html',
  styleUrls: ['./vote-question.component.css']
})
export class VoteQuestionComponent implements OnInit {
  myArray : Question[];
  bob : Question;
  joe : Question;

  constructor() {
    this.bob = new Question;
    this.bob.choice_a_text = "picklesa";
    this.bob.choice_b_text = "lemons leo";
    this.bob.choice_a_votes = 23;
    this.bob.choice_b_votes = 12;
    this.joe = new Question;
    this.joe.choice_a_text = "ruffles";
    this.joe.choice_b_text = "pineapple leo";
    this.joe.choice_a_votes = 15;
    this.joe.choice_b_votes = 2;
    this.myArray = [];
    this.myArray.push(this.bob,this.joe)
   }

  ngOnInit() {
    // call the GET all api here and in the response loop thru it and create new Question obj
    // and push it into myArray

    // this.myArray = [
    //   {choice_a_text:"ayo",choice_b_text:"sup",choice_a_votes:2,choice_b_votes:4},
    //   {choice_a_text:"xyz",choice_b_text:"abc",choice_a_votes:24,choice_b_votes:6}
    // ]
  }

}
