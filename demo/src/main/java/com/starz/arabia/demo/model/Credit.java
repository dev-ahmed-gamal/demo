package com.starz.arabia.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Credit {

	private String characterName;
	
	private String creditType;
	
	private Boolean isInactive;

	private Integer order;
	
	private String personId;
	
	private String personName;
	
	public String getCharacterName() {
		return characterName;
	}
	
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	
	public String getCreditType() {
		return creditType;
	}
	
	public void setCreditType(String creditType) {
		this.creditType = creditType;
	}
	
	public Boolean getIsInactive() {
		return isInactive;
	}
	
	public void setIsInactive(Boolean isInactive) {
		this.isInactive = isInactive;
	}
	
	public Integer getOrder() {
		return order;
	}
	
	public void setOrder(Integer order) {
		this.order = order;
	}
	
	public String getPersonId() {
		return personId;
	}
	
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	
	public String getPersonName() {
		return personName;
	}
	
	public void setPersonName(String personName) {
		this.personName = personName;
	}
}
