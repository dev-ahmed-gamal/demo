package com.starz.arabia.demo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Entry implements Serializable{
	

	private static final long serialVersionUID = 1L;

	private String id;
	
	private String guid;
	
	private Date updated;
	
	private String title ;
	
	private String description;
	
	private Date added;
	
	private Boolean approved;

	@JsonProperty("credits")
	private List<Credit> credits;


	@JsonProperty("peg$ExclusiveFrench")
	private String exclusiveFrench;
	
	@JsonProperty("peg$arAgeRating")
	private Integer arAgeRating;
	
	@JsonProperty("peg$arContentRating")
	private String arContentRating;
	
	@JsonProperty("peg$availableInSection")
	private String availableInSection;
	
	@JsonProperty("peg$contentClassification")
	private String contentClassification;
	
	@JsonProperty("peg$contractName")
	private String contractName;
	
	@JsonProperty("peg$countryOfOrigin")
	private String countryOfOrigin;
	
	@JsonProperty("peg$priorityLevel")
	private String priorityLevel;
	
	@JsonProperty("peg$priorityLevelActionandAdventure")
	private String priorityLevelActionandAdventure;
	
	@JsonProperty("peg$priorityLevelArabic")
	private String priorityLevelArabic;
    
	@JsonProperty("peg$priorityLevelChildrenandFamily")
	private String priorityLevelChildrenandFamily;
    
	@JsonProperty("peg$priorityLevelComedy")
	private String priorityLevelComedy;
    
	@JsonProperty("peg$priorityLevelDisney")
	private String priorityLevelDisney;
    
	@JsonProperty("peg$priorityLevelDisneyKids")
	private String priorityLevelDisneyKids;
    
	@JsonProperty("peg$priorityLevelDrama")
	private String priorityLevelDrama;
    
	@JsonProperty("peg$priorityLevelKids")
	private String priorityLevelKids;
    
	@JsonProperty("peg$priorityLevelKidsAction")
	private String priorityLevelKidsAction;
    
	@JsonProperty("peg$priorityLevelKidsFunandAdventure")
	private String priorityLevelKidsFunandAdventure;
    
	@JsonProperty("peg$priorityLevelKidsMagicandDreams")
	private String priorityLevelKidsMagicandDreams;
    
	@JsonProperty("peg$priorityLevelKidsPreschool")
	private String priorityLevelKidsPreschool;
    
	@JsonProperty("peg$priorityLevelRomance")
	private String priorityLevelRomance;
    
	@JsonProperty("peg$priorityLevelThriller")
	private String priorityLevelThriller;
    
	@JsonProperty("peg$productCode")
	private String productCode;
    
	@JsonProperty("peg$programMediaAvailability")
	private String programMediaAvailability;
    
	@JsonProperty("peg$testDefaultValue")
	private String testDefaultValue;
	
	private String displayGenre;
    
	private String editorialRating;
    
    @JsonProperty("imageMediaIds")
    private List<ImageMediaId> imageMediaIds;
    
    private Boolean isAdult;
    
    private List<String> languages;
    
    private String longDescription;
    
    @JsonProperty("longDescriptionLocalized")
    private LongDescriptionLocalized longDescriptionLocalized;
    
    private String programType;
    
    private List<String> ratings;
    
    private String seriesEpisodeNumber;
    
    private String seriesId;
    
    private String shortDescription;
    
    @JsonProperty("shortDescriptionLocalized")
    private LongDescriptionLocalized shortDescriptionLocalized;
    
    private List<String> tagIds;
    
    @JsonProperty("tags")
    private List<Tag> tags;
    
    @JsonProperty("thumbnails")
    private Thumbnail thumbnail;
    
    @JsonProperty("titleLocalized")
    private LongDescriptionLocalized titleLocalized;
    
    private String tvSeasonEpisodeNumber;
    
    private String tvSeasonId;
    
    private String tvSeasonNumber;
    
    private Integer year;
    
    @JsonProperty("media")
    private List<Media> medias;
    
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

	public Entry() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getAdded() {
		return added;
	}

	public void setAdded(Date added) {
		this.added = added;
	}

	public Boolean getApproved() {
		return approved;
	}

	public void setApproved(Boolean approved) {
		this.approved = approved;
	}

	public List<Credit> getCredits() {
		return credits;
	}


	public void setCredits(List<Credit> credits) {
		this.credits = credits;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public String getExclusiveFrench() {
		return exclusiveFrench;
	}

	public void setExclusiveFrench(String exclusiveFrench) {
		this.exclusiveFrench = exclusiveFrench;
	}

	public Integer getArAgeRating() {
		return arAgeRating;
	}

	public void setArAgeRating(Integer arAgeRating) {
		this.arAgeRating = arAgeRating;
	}

	public String getArContentRating() {
		return arContentRating;
	}

	public void setArContentRating(String arContentRating) {
		this.arContentRating = arContentRating;
	}

	public String getAvailableInSection() {
		return availableInSection;
	}

	public void setAvailableInSection(String availableInSection) {
		this.availableInSection = availableInSection;
	}

	public String getContentClassification() {
		return contentClassification;
	}

	public void setContentClassification(String contentClassification) {
		this.contentClassification = contentClassification;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getPriorityLevel() {
		return priorityLevel;
	}

	public void setPriorityLevel(String priorityLevel) {
		this.priorityLevel = priorityLevel;
	}

	public String getPriorityLevelActionandAdventure() {
		return priorityLevelActionandAdventure;
	}

	public void setPriorityLevelActionandAdventure(String priorityLevelActionandAdventure) {
		this.priorityLevelActionandAdventure = priorityLevelActionandAdventure;
	}

	public String getPriorityLevelArabic() {
		return priorityLevelArabic;
	}

	public void setPriorityLevelArabic(String priorityLevelArabic) {
		this.priorityLevelArabic = priorityLevelArabic;
	}

	public String getPriorityLevelChildrenandFamily() {
		return priorityLevelChildrenandFamily;
	}

	public void setPriorityLevelChildrenandFamily(String priorityLevelChildrenandFamily) {
		this.priorityLevelChildrenandFamily = priorityLevelChildrenandFamily;
	}

	public String getPriorityLevelComedy() {
		return priorityLevelComedy;
	}

	public void setPriorityLevelComedy(String priorityLevelComedy) {
		this.priorityLevelComedy = priorityLevelComedy;
	}

	public String getPriorityLevelDisney() {
		return priorityLevelDisney;
	}

	public void setPriorityLevelDisney(String priorityLevelDisney) {
		this.priorityLevelDisney = priorityLevelDisney;
	}

	public String getPriorityLevelDisneyKids() {
		return priorityLevelDisneyKids;
	}

	public void setPriorityLevelDisneyKids(String priorityLevelDisneyKids) {
		this.priorityLevelDisneyKids = priorityLevelDisneyKids;
	}

	public String getPriorityLevelDrama() {
		return priorityLevelDrama;
	}

	public void setPriorityLevelDrama(String priorityLevelDrama) {
		this.priorityLevelDrama = priorityLevelDrama;
	}

	public String getPriorityLevelKids() {
		return priorityLevelKids;
	}

	public void setPriorityLevelKids(String priorityLevelKids) {
		this.priorityLevelKids = priorityLevelKids;
	}

	public String getPriorityLevelKidsAction() {
		return priorityLevelKidsAction;
	}

	public void setPriorityLevelKidsAction(String priorityLevelKidsAction) {
		this.priorityLevelKidsAction = priorityLevelKidsAction;
	}

	public String getPriorityLevelKidsFunandAdventure() {
		return priorityLevelKidsFunandAdventure;
	}

	public void setPriorityLevelKidsFunandAdventure(String priorityLevelKidsFunandAdventure) {
		this.priorityLevelKidsFunandAdventure = priorityLevelKidsFunandAdventure;
	}

	public String getPriorityLevelKidsMagicandDreams() {
		return priorityLevelKidsMagicandDreams;
	}

	public void setPriorityLevelKidsMagicandDreams(String priorityLevelKidsMagicandDreams) {
		this.priorityLevelKidsMagicandDreams = priorityLevelKidsMagicandDreams;
	}

	public String getPriorityLevelKidsPreschool() {
		return priorityLevelKidsPreschool;
	}

	public void setPriorityLevelKidsPreschool(String priorityLevelKidsPreschool) {
		this.priorityLevelKidsPreschool = priorityLevelKidsPreschool;
	}

	public String getPriorityLevelRomance() {
		return priorityLevelRomance;
	}

	public void setPriorityLevelRomance(String priorityLevelRomance) {
		this.priorityLevelRomance = priorityLevelRomance;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProgramMediaAvailability() {
		return programMediaAvailability;
	}

	public void setProgramMediaAvailability(String programMediaAvailability) {
		this.programMediaAvailability = programMediaAvailability;
	}

	public String getTestDefaultValue() {
		return testDefaultValue;
	}

	public void setTestDefaultValue(String testDefaultValue) {
		this.testDefaultValue = testDefaultValue;
	}

	public String getPriorityLevelThriller() {
		return priorityLevelThriller;
	}

	public void setPriorityLevelThriller(String priorityLevelThriller) {
		this.priorityLevelThriller = priorityLevelThriller;
	}

	public String getDisplayGenre() {
		return displayGenre;
	}

	public void setDisplayGenre(String displayGenre) {
		this.displayGenre = displayGenre;
	}

	public String getEditorialRating() {
		return editorialRating;
	}

	public void setEditorialRating(String editorialRating) {
		this.editorialRating = editorialRating;
	}

	public List<ImageMediaId> getImageMediaIds() {
		return imageMediaIds;
	}

	public void setImageMediaIds(List<ImageMediaId> imageMediaIds) {
		this.imageMediaIds = imageMediaIds;
	}

	public Boolean getIsAdult() {
		return isAdult;
	}

	public void setIsAdult(Boolean isAdult) {
		this.isAdult = isAdult;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public LongDescriptionLocalized getLongDescriptionLocalized() {
		return longDescriptionLocalized;
	}

	public void setLongDescriptionLocalized(LongDescriptionLocalized longDescriptionLocalized) {
		this.longDescriptionLocalized = longDescriptionLocalized;
	}

	public String getProgramType() {
		return programType;
	}

	public void setProgramType(String programType) {
		this.programType = programType;
	}

	public List<String> getRatings() {
		return ratings;
	}

	public void setRatings(List<String> ratings) {
		this.ratings = ratings;
	}

	public String getSeriesEpisodeNumber() {
		return seriesEpisodeNumber;
	}

	public void setSeriesEpisodeNumber(String seriesEpisodeNumber) {
		this.seriesEpisodeNumber = seriesEpisodeNumber;
	}

	public String getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(String seriesId) {
		this.seriesId = seriesId;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public LongDescriptionLocalized getShortDescriptionLocalized() {
		return shortDescriptionLocalized;
	}

	public void setShortDescriptionLocalized(LongDescriptionLocalized shortDescriptionLocalized) {
		this.shortDescriptionLocalized = shortDescriptionLocalized;
	}

	public List<String> getTagIds() {
		return tagIds;
	}

	public void setTagIds(List<String> tagIds) {
		this.tagIds = tagIds;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public Thumbnail getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(Thumbnail thumbnail) {
		this.thumbnail = thumbnail;
	}

	public LongDescriptionLocalized getTitleLocalized() {
		return titleLocalized;
	}

	public void setTitleLocalized(LongDescriptionLocalized titleLocalized) {
		this.titleLocalized = titleLocalized;
	}

	public String getTvSeasonEpisodeNumber() {
		return tvSeasonEpisodeNumber;
	}

	public void setTvSeasonEpisodeNumber(String tvSeasonEpisodeNumber) {
		this.tvSeasonEpisodeNumber = tvSeasonEpisodeNumber;
	}

	public String getTvSeasonId() {
		return tvSeasonId;
	}

	public void setTvSeasonId(String tvSeasonId) {
		this.tvSeasonId = tvSeasonId;
	}

	public String getTvSeasonNumber() {
		return tvSeasonNumber;
	}

	public void setTvSeasonNumber(String tvSeasonNumber) {
		this.tvSeasonNumber = tvSeasonNumber;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public List<Media> getMedias() {
		return medias;
	}

	public void setMedias(List<Media> medias) {
		this.medias = medias;
	}


	
	
	
}
