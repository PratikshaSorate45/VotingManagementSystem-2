package com.votingManagementSystem.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.votingManagementSystem.entity.VoteEntity;
import com.votingManagementSystem.exception.VoteNotFoundException;
import com.votingManagementSystem.serviceImpl.VoteService;
@RestController
@RequestMapping("v1")
@CrossOrigin(origins = {"http://localhost:4200"},
allowedHeaders = "*") // prep-work 2> @RestController
public class VoteController {
	
	@Autowired
	private VoteService voteService;


	@PostMapping("vote")
	public VoteEntity addVoteEntity(@RequestBody VoteEntity voteEntity) {
		return this.voteService.addVote(voteEntity);
	}
	@PutMapping("vote")
	public VoteEntity updatedVoteEntity(@RequestBody VoteEntity voteEntity)
			throws VoteNotFoundException {
		return this.voteService.updateVote(voteEntity);
		
	}
	@DeleteMapping("vote/{Id}")
	public String deleteVote(@PathVariable("Id") Integer Id)
			throws VoteNotFoundException {
		return this.voteService.deleteVote(Id);
	}
	@GetMapping("vote/{Id}")
	public VoteEntity getVoteEntityById(@PathVariable("Id") Integer Id)
			throws VoteNotFoundException {
		return this.voteService.getVoteById(Id);
	}
	@GetMapping("vote")
	public List<VoteEntity> getAllVotes() {
		return this.voteService.getAllVotes();

	}

	

}
