import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-create-question',
  templateUrl: './create-question.component.html',
  styleUrls: ['./create-question.component.css']
})
export class CreateQuestionComponent implements OnInit {
  isSubmitted : boolean = false;

  constructor(private http: HttpClient) { }

  ngOnInit() {
  }

  submit(value: any, form: NgForm) {
    console.log(value);
    this.isSubmitted = !this.isSubmitted;
    this.http.post('http://localhost:7050/api/questions',value)
    .subscribe((response) => {
      console.log(response);
    });
    form.resetForm();
  }

}
