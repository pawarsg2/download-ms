package com.microservices.download.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.microservices.download.dto.Comments;
import com.microservices.download.repository.CommentsRepository;
@Component
public class CommentsService {

	@Autowired
	private CommentsRepository commentsRepository;
	
    public Optional < Comments > findById(Long id) {
        return commentsRepository.findById(id);
    }
}
