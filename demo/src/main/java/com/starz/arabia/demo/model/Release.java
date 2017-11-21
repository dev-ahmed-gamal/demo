package com.starz.arabia.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Release {

	private String pid;
	
	private String url;
	
	private String restrictionId;
    
	public String getPid() {
		return pid;
	}
	
	public void setPid(String pid) {
		this.pid = pid;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getRestrictionId() {
		return restrictionId;
	}
	
	public void setRestrictionId(String restrictionId) {
		this.restrictionId = restrictionId;
	}
}
