import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-poll',
  templateUrl: './poll.component.html',
  styleUrls: ['./poll.component.css']
})
export class PollComponent implements OnInit {
  isVoted : boolean = false;

  constructor() { }

  ngOnInit() {
  }

  toggleVoted() {
    this.isVoted = !this.isVoted;
    console.log("voted");
  }

}
