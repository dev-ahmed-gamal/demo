package com.starz.arabia.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Filter {
	
	private String filter;

	@JsonProperty("level")
	private List<String> level;
	
	public Filter() {
		super();
	}

	public Filter(String parent, String filterField, String filter, String levelField, List<String> level) {
		super();
		this.filter = filter;
		this.level = level;
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public List<String> getLevel() {
		return level;
	}

	public void setLevel(List<String> level) {
		this.level = level;
	}	
}
