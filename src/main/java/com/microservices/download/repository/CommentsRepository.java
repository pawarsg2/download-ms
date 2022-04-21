package com.microservices.download.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.download.dto.Comments;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long> {
	


}
