package com.microservices.download.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.download.dto.Song;


@Repository
public interface SongRespository extends JpaRepository<Song, Long> {

}
