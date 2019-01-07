import { Component, OnInit } from '@angular/core';
import { Question } from './question.model';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-vote-question',
  templateUrl: './vote-question.component.html',
  styleUrls: ['./vote-question.component.css']
})
export class VoteQuestionComponent implements OnInit {
  questionArray : Question[];

  constructor(private http : HttpClient) {
   }

  ngOnInit() {
    // call the GET all api here and in the response loop thru it and create new Question obj
    // and push it into questionArray
    this.http.get<Array<Question>>('http://localhost:7050/api/questions')
    .subscribe((response) => {
      this.questionArray = response;
      console.log(this.questionArray)
    });

  }

}
