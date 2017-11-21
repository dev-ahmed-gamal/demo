package com.starz.arabia.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Content {
	
	private Integer bitrate;
	
	private Double duration;
	
	private String format;
	
	private Integer height;
	
	private String language ;
	
	private Integer width;
	
	private String  id;
	
	private String guid;
    
	@JsonProperty("assetTypeIds")
    private List<String> assetTypeIds;
    
	@JsonProperty("assetTypes")
    private List<String> assetTypes;
    
	private String downloadUrl;
    
	@JsonProperty("releases")
    private List<Release> releases;
    
	private String serverId;
    
	private String streamingUrl;
    
	private String protectionScheme;
	
	public Integer getBitrate() {
		return bitrate;
	}
	
	public void setBitrate(Integer bitrate) {
		this.bitrate = bitrate;
	}
	
	public Double getDuration() {
		return duration;
	}
	
	public void setDuration(Double duration) {
		this.duration = duration;
	}
	
	public String getFormat() {
		return format;
	}
	
	public void setFormat(String format) {
		this.format = format;
	}
	
	public Integer getHeight() {
		return height;
	}
	
	public void setHeight(Integer height) {
		this.height = height;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public Integer getWidth() {
		return width;
	}
	
	public void setWidth(Integer width) {
		this.width = width;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getGuid() {
		return guid;
	}
	
	public void setGuid(String guid) {
		this.guid = guid;
	}
	
	public List<String> getAssetTypeIds() {
		return assetTypeIds;
	}
	
	public void setAssetTypeIds(List<String> assetTypeIds) {
		this.assetTypeIds = assetTypeIds;
	}
	
	public List<String> getAssetTypes() {
		return assetTypes;
	}
	
	public void setAssetTypes(List<String> assetTypes) {
		this.assetTypes = assetTypes;
	}
	
	public String getDownloadUrl() {
		return downloadUrl;
	}
	
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	
	public List<Release> getReleases() {
		return releases;
	}
	
	public void setReleases(List<Release> releases) {
		this.releases = releases;
	}
	
	public String getServerId() {
		return serverId;
	}
	
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	
	public String getStreamingUrl() {
		return streamingUrl;
	}
	
	public void setStreamingUrl(String streamingUrl) {
		this.streamingUrl = streamingUrl;
	}
	
	public String getProtectionScheme() {
		return protectionScheme;
	}
	
	public void setProtectionScheme(String protectionScheme) {
		this.protectionScheme = protectionScheme;
	}
}
