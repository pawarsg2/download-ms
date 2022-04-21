package com.microservices.download.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.download.dto.Song;
import com.microservices.download.util.UplaodProxy;





@RestController
public class SongController {
	
	private Logger logger = LoggerFactory.getLogger(SongController.class);
	
	@Autowired
	private UplaodProxy uplaodProxy;
	
	
	@GetMapping("/album/song/{id}")
	public Song retrieveSong(@PathVariable long id ) {	
		logger.info("retrieveSongByID");
		 Song song = uplaodProxy.retrieveSongsById(id);
		 return song;
	}
	

	

}
