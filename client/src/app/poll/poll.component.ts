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
  // @Input('choice_a') choice_a_text : string = "test a";
  // @Input('choice_b') choice_b_text: string = "test b";
  // choice_a_votes: number = 1;
  // choice_b_votes: number = 3;

  constructor() {
    // delete this later you would get from vote question component
    // this.question = new Question();
    // this.question.choice_a_text = "pickles";
    // this.question.choice_b_text = "lemons";
    // this.question.choice_a_votes = 23;
    // this.question.choice_b_votes = 12;
   }

  ngOnInit() {
  }

  toggleVoted() {
    this.isVoted = !this.isVoted;
    console.log("voted");
  }

}
