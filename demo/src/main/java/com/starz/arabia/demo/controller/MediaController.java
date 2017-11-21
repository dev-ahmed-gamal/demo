package com.starz.arabia.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.starz.arabia.demo.model.Media;
import com.starz.arabia.demo.service.MediaService;
import com.starz.arabia.demo.validation.annotation.ValidFiltter;




@RestController
@Validated
public class MediaController {
	
	@Autowired
	private MediaService mediaService;

	
	@RequestMapping(value = "/media", method = RequestMethod.GET)	
	public List<Media> getAllMovies(@ValidFiltter @RequestParam(value = "filter", required = false) String filter,
			 @RequestParam(value = "level", required = false)  String level) {
		
		return mediaService.getMedias(filter,level);
		   
	   }
	   
}
