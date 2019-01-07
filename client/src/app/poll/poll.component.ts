import { Component, OnInit, Input } from '@angular/core';
import { Question } from '../vote-question/question.model';

@Component({
  selector: 'app-poll',
  templateUrl: './poll.component.html',
  styleUrls: ['./poll.component.css']
})
export class PollComponent implements OnInit {
  isVoted : boolean = false;
  @Input('question') question : Question;

  constructor() {
   }

  ngOnInit() {
  }

  toggleVoted() {
    this.isVoted = !this.isVoted;
    console.log("voted");
    // call the PUT api here and update the question member variable
  }

}
