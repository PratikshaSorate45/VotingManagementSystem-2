import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './Home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { AddVoteComponent } from './add-vote/add-vote.component';
import { VoteListComponent } from './vote-list/vote-list.component';


const routes: Routes = [
  {path: ' ', component:HomeComponent},
  // {path: 'navbar', component:NavbarComponent},
  {path: 'home', component:HomeComponent},
  {path: 'about', component:AboutComponent},
  {path: 'contact', component:ContactComponent},
  {path: 'addvote', component:AddVoteComponent},
  {path: 'votelist', component:VoteListComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
