package com.starz.arabia.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageMediaId {

	
	private String mediaId;
	private String isPrimary;
	private String imageType;
	
	
	public String getMediaId() {
		return mediaId;
	}
	
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	
	public String getIsPrimary() {
		return isPrimary;
	}
	
	public void setIsPrimary(String isPrimary) {
		this.isPrimary = isPrimary;
	}
	
	public String getImageType() {
		return imageType;
	}
	
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	
}
