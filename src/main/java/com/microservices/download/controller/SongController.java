package com.microservices.download.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.microservices.download.dto.Song;
import com.microservices.download.service.SongService;
import com.microservices.download.util.UplaodProxy;

/**
 * @author pawar
 *
 */
@RestController
public class SongController {

	private Logger logger = LoggerFactory.getLogger(SongController.class);

	@Autowired
	private UplaodProxy uplaodProxy;

	@Autowired
	private SongService songService;

	/**
	 * @param id
	 * @return
	 */
	@GetMapping("/album/song/{id}")
	public Song retrieveSong(@PathVariable long id) {
		logger.info("retrieveSongByID");
		Song song = uplaodProxy.retrieveSongsById(id);
		return song;
	}

	@GetMapping("/album/song/{id}/download")
	public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable long id) {
		// Load file from database
		Song song = songService.getSong(id);

		return ResponseEntity.ok().contentType(MediaType.parseMediaType(song.getFileType()))
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + song.getTitle() + "\"")
				.body(new ByteArrayResource(song.getByteData()));
	}

}
