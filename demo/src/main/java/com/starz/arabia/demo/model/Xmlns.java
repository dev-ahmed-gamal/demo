package com.starz.arabia.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Xmlns {
	
	private String peg;

	public String getPeg() {
		return peg;
	}

	public void setPeg(String peg) {
		this.peg = peg;
	}

	public Xmlns() {
		super();
	}
	
	
}
