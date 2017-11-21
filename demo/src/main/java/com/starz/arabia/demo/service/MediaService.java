package com.starz.arabia.demo.service;

import java.util.List;

import com.starz.arabia.demo.model.Entry;
import com.starz.arabia.demo.model.Media;

public interface MediaService {


	public List<Media> getMedias(String filter, String queryLevel);
}
