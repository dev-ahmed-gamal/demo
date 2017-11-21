package com.starz.arabia.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Thumb {

	private String url;
	
	private Integer width;
	
	private Integer height;
	
	private String title;
	
	private List<String> assetTypes;
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public Integer getWidth() {
		return width;
	}
	
	public void setWidth(Integer width) {
		this.width = width;
	}
	
	public Integer getHeight() {
		return height;
	}
	
	public void setHeight(Integer height) {
		this.height = height;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public List<String> getAssetTypes() {
		return assetTypes;
	}
	
	public void setAssetTypes(List<String> assetTypes) {
		this.assetTypes = assetTypes;
	}
}
