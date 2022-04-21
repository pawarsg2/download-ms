package com.microservices.download.controller;



import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.download.dto.Comments;
import com.microservices.download.service.CommentsService;

@RestController
public class CommentsController {
	private Logger logger = LoggerFactory.getLogger(CommentsController.class);
	
	@Autowired
	private CommentsService commentsService;
	@GetMapping("/comment/{id}")
	public Comments retrieveCommentsByID(
			@PathVariable Long id) {
		
		logger.info("retrieveSongByID");
		Optional<Comments> comment = commentsService.findById(id);
		Comments c = comment.get();
		
		return c;
				
	}

}
