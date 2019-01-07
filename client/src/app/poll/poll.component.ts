import { Component, OnInit, Input } from '@angular/core';
import { Question } from '../vote-question/question.model';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-poll',
  templateUrl: './poll.component.html',
  styleUrls: ['./poll.component.css']
})
export class PollComponent implements OnInit {
  isVoted : boolean = false;
  @Input('question') question : Question;

  constructor(private http : HttpClient) {
   }

  ngOnInit() {
  }

  toggleVotedA() {
    this.isVoted = !this.isVoted;
    this.http.put<Question>('http://localhost:7050/api/question/'+this.question.id+'?id=0',null)
    .subscribe((response) => {
      this.question = response;
    });
  }

  toggleVotedB() {
    this.isVoted = !this.isVoted;
    this.http.put<Question>('http://localhost:7050/api/question/'+this.question.id+'?id=1',null)
    .subscribe((response) => {
      this.question = response;
    });
  }

}
