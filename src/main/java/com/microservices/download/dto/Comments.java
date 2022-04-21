package com.microservices.download.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "user_comments")
public class Comments { 

	@Id
	private Long id;

	@Column(name = "user_id")
	private String userId;

	@Column(name = "comment_text")
	private String comment;

}
