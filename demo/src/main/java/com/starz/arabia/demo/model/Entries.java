package com.starz.arabia.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Entries {
	
	@JsonProperty("$xmlns")
	private Xmlns xmlns;
	
	private Integer startIndex;
	
	private Integer itemsPerPage;
	
	private Integer entryCount;
	
	private String title;
	
	@JsonProperty("entries")
	private List<Entry> entriesMovies;
	
	
	public Integer getStartIndex() {
		return startIndex;
	}


	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}


	public Xmlns getXmlns() {
		return xmlns;
	}


	public void setXmlns(Xmlns xmlns) {
		this.xmlns = xmlns;
	}


	public Integer getItemsPerPage() {
		return itemsPerPage;
	}


	public void setItemsPerPage(Integer itemsPerPage) {
		this.itemsPerPage = itemsPerPage;
	}


	public Integer getEntryCount() {
		return entryCount;
	}


	public void setEntryCount(Integer entryCount) {
		this.entryCount = entryCount;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public List<Entry> getEntriesMovies() {
		return entriesMovies;
	}


	public void setEntriesMovies(List<Entry> entriesMovies) {
		this.entriesMovies = entriesMovies;
	}

	


	public Entries() {
		super();
	}
	
	
}
