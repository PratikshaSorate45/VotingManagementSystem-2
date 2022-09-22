import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
//import { Schedule } from '../schedule';
//import { ScheduleService } from '../Schedule-Service/schedule.service';
import { Vote } from '../vote';
import { VoteService } from '../VoteService/vote.service';

@Component({
  selector: 'app-vote-list',
  templateUrl: './vote-list.component.html',
  styleUrls: ['./vote-list.component.css']
})
export class VoteListComponent implements OnInit {

  constructor(
    
    private voteService: VoteService,
    private router: Router
    // private readService:UploadFileService
  ) {}

  vote: Vote[] = [];
  nameSearch: string = '';
  voteInformation:any[]=[]

  ngOnInit(): void {
    console.log("ngOnInit26")
    this.getVotesList();console.log("hi")
  }

 
  private getVotesList() {
    //var voteInformation[]=[];
    console.log("getVoteList32")
    this.voteService.getVotesList().subscribe((data) => {
      //this.voteInformation
      console.log("nikhil",data)
      this.vote = data;
      //data.map((item,index)=>{
        //this.voteInformation.push({voteId:index,voteInformation:item})
        



      //})
      //this.vote=this.voteInformation
      //this.vote=voteInformation;
      //console.log("nutan45",this.voteInformation)
      // this.router.navigate(['uploadedvotelist']);
    });
  }
  //voting(){

    //this.router.navigate(['']);

 // }
  


}