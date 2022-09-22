package com.votingManagementSystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.votingManagementSystem.entity.VoteDTO;
import com.votingManagementSystem.entity.VoteEntity;
import com.votingManagementSystem.exception.VoteNotFoundException;
import com.votingManagementSystem.serviceImpl.VoteService;

@SpringBootTest
class VotingManagementSystem1ApplicationTests {
	@Autowired
    private VoteService voteService;

	@Test
	void addVoteTest() {
        VoteEntity vote = new VoteEntity(11, "pratiksha", "BJP");
        VoteEntity testVote = this.voteService.addVote(vote);
        assertNotNull(testVote);// it should return newly added vote object
        // remove test data
    }
	@Test
	void updateVoteTest2() {
		VoteEntity vote=new VoteEntity(1,"Nikhil",null);
		try {
			VoteEntity updateVote = this.voteService.updateVote(vote);
			assertEquals("Nikhil",updateVote.getVoterName());
			
			
			
		}catch(VoteNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	

}
