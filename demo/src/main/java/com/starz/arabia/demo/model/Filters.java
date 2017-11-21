package com.starz.arabia.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Filters {

	@JsonProperty("filters")
	private List<Filter> filters;

	public Filters(List<Filter> filters) {
		super();
		this.filters = filters;
	}

	public Filters() {
		super();
	}

	public List<Filter> getFilters() {
		return filters;
	}

	public void setFilters(List<Filter> filters) {
		this.filters = filters;
	}
		
}
