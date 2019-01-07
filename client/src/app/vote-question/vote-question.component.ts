import { Component, OnInit } from '@angular/core';
import { Question } from './question.model';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-vote-question',
  templateUrl: './vote-question.component.html',
  styleUrls: ['./vote-question.component.css']
})
export class VoteQuestionComponent implements OnInit {
  myArray : Question[];
  questionArray : Question[];
  bob : Question;
  joe : Question;

  constructor(private http : HttpClient) {
    this.bob = new Question;
    this.bob.choice_a_text = "picklesa";
    this.bob.choice_b_text = "lemons leo";
    this.bob.choice_a_votes = 23;
    this.bob.choice_b_votes = 12;
    // this.joe = new Question;
    // this.joe.choice_a_text = "ruffles";
    // this.joe.choice_b_text = "pineapple leo";
    // this.joe.choice_a_votes = 15;
    // this.joe.choice_b_votes = 2;
    this.myArray = [];
    this.myArray.push(this.bob)
   }

  ngOnInit() {
    // call the GET all api here and in the response loop thru it and create new Question obj
    // and push it into myArray
    this.http.get<Array<Question>>('http://localhost:7050/api/questions')
    .subscribe((response) => {
      this.questionArray = response;
      console.log(this.questionArray);
      this.joe = this.questionArray[0];
    });


    // this.myArray = [
    //   {choice_a_text:"ayo",choice_b_text:"sup",choice_a_votes:2,choice_b_votes:4},
    //   {choice_a_text:"xyz",choice_b_text:"abc",choice_a_votes:24,choice_b_votes:6}
    // ]
  }

}
