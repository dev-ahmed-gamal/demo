package com.starz.arabia.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.starz.arabia.demo.data.DataCollection;
import com.starz.arabia.demo.model.Media;

@Service
public class MediaServiceImpl implements MediaService {

	private static final String CENESORED =  "censored";
	private static final String UNCENESORED =  "uncensored";
	
	@Override
	public List<Media> getMedias(String filter, String queryLevel) {
		List<Media> medias = new ArrayList<>();
		
		if(filter != null && !filter.isEmpty()) { //filter is censoring

			if(queryLevel.equalsIgnoreCase(CENESORED)) {

				DataCollection.entries.stream().filter(entry->{
					return entry.getContentClassification().equalsIgnoreCase(CENESORED);
				}).forEach(ent ->{
					 ent.getMedias().stream().forEach(media->{
						 if(media.getGuid().endsWith("C")) {
							 medias.add(media);
						 }
					});
				});
				
			}else if(queryLevel.equalsIgnoreCase(UNCENESORED)) {

				   DataCollection.entries.stream().filter(entry->{
						return entry.getContentClassification().equalsIgnoreCase(CENESORED);
					}).forEach(ent ->{
						 ent.getMedias().stream().forEach(media->{
							 if(!media.getGuid().endsWith("C")) {
								 medias.add(media);
							 }
						});
					});
			}
			
	}else if(queryLevel==null) {
		return medias;
	}else if(queryLevel.equalsIgnoreCase(UNCENESORED)||queryLevel.isEmpty()) {
		  DataCollection.entries.stream().forEach(ent->medias.add(ent.getMedias().get(0)));
	}
		return medias;

  }
}
