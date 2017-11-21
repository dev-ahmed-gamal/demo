package com.starz.arabia.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Thumbnail {

    @JsonProperty("thumb-615x1536")
    private Thumb thumb615x1536;
    
    @JsonProperty("thumb-613x1536")
    private Thumb thumb613x1536;
    
    @JsonProperty("thumb-677x474")
    private Thumb thumb677x474;
    
    @JsonProperty("thumb-614x1536")
    private Thumb thumb614x1536;
	
    public Thumb getThumb615x1536() {
		return thumb615x1536;
	}
	
    public void setThumb615x1536(Thumb thumb615x1536) {
		this.thumb615x1536 = thumb615x1536;
	}
	
    public Thumb getThumb613x1536() {
		return thumb613x1536;
	}
	
    public void setThumb613x1536(Thumb thumb613x1536) {
		this.thumb613x1536 = thumb613x1536;
	}
	
    public Thumb getThumb614x1536() {
		return thumb614x1536;
	}
	
    public void setThumb614x1536(Thumb thumb614x1536) {
		this.thumb614x1536 = thumb614x1536;
	}
	
    public Thumb getThumb677x474() {
		return thumb677x474;
	}
	
    public void setThumb677x474(Thumb thumb677x474) {
		this.thumb677x474 = thumb677x474;
	}
}
