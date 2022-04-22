package com.microservices.download.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.microservices.download.dto.Song;
import com.microservices.download.exception.SongNotFoundException;
import com.microservices.download.repository.SongRespository;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class SongService {
	
	@Autowired
	private SongRespository songRepo;
	private Logger logger = LoggerFactory.getLogger(SongService.class);
	
    public Song getSong(long id) {
        Optional<Song> s = songRepo.findById(id);
       Song s1 = s.get();
       return s1;
               // .orElseThrow(() -> new SongNotFoundException("File not found with id " + id));
    }


}
