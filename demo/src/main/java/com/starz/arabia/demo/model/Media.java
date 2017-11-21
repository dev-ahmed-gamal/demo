package com.starz.arabia.demo.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Media {
	
	private String id;
	
	private String title;
	
	private String guid ;
	
	private String ownerId ;
	
	private Date availableDate;
	
	private Date expirationDate;
    
	@JsonProperty("ratings")
    private List<String> rating;
    
	@JsonProperty("content")
    private List<Content> contents;
    
    private String restrictionId;
    
    private String availabilityState;
	
    public String getId() {
		return id;
	}
    
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getGuid() {
		return guid;
	}
	
	public void setGuid(String guid) {
		this.guid = guid;
	}
	
	public String getOwnerId() {
		return ownerId;
	}
	
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	
	public Date getAvailableDate() {
		return availableDate;
	}
	
	public void setAvailableDate(Date availableDate) {
		this.availableDate = availableDate;
	}
	
	public Date getExpirationDate() {
		return expirationDate;
	}
	
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	public List<String> getRating() {
		return rating;
	}
	
	public void setRating(List<String> rating) {
		this.rating = rating;
	}
	
	public List<Content> getContents() {
		return contents;
	}
	
	public void setContents(List<Content> contents) {
		this.contents = contents;
	}
	
	public String getRestrictionId() {
		return restrictionId;
	}
	
	public void setRestrictionId(String restrictionId) {
		this.restrictionId = restrictionId;
	}
	
	public String getAvailabilityState() {
		return availabilityState;
	}
	
	public void setAvailabilityState(String availabilityState) {
		this.availabilityState = availabilityState;
	}
}
