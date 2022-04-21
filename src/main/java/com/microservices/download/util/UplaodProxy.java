package com.microservices.download.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.download.dto.Song;



@FeignClient(name="upload-ms")
public interface UplaodProxy {
	
	@GetMapping("/album/song/{id}")
	public Song retrieveSongsById(@PathVariable long id);
	
}
