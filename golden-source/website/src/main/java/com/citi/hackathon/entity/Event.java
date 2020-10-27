package com.citi.hackathon.entity;

import javax.persistence.Id;

public class Event {
	@Id
	private String id;
	private String Name;
	private String Type;
	private String date_creation;
	private String date_updated;
	private String status;
	private String region;
	private String business;
	private String silo;
	private String riskType;
	private String category;
	private String checker;
	
	@Override
	public String toString() {
		return "Event{" +
							 "id='" + id + '\'' +
							 ", Name='" + Name + '\'' +
							 ", Type='" + Type + '\'' +
							 ", date_creation='" + date_creation + '\'' +
							 ", date_updated='" + date_updated + '\'' +
							 ", status='" + status + '\'' +
							 ", region='" + region + '\'' +
							 ", business='" + business + '\'' +
							 ", silo='" + silo + '\'' +
							 ", riskType='" + riskType + '\'' +
							 ", category='" + category + '\'' +
							 ", checker='" + checker + '\'' +
							 '}';
	}
	
	public Event(String id, String name, String type, String date_creation, String date_updated, String status, String region, String business, String silo, String riskType, String category, String checker) {
		this.id = id;
		Name = name;
		Type = type;
		this.date_creation = date_creation;
		this.date_updated = date_updated;
		this.status = status;
		this.region = region;
		this.business = business;
		this.silo = silo;
		this.riskType = riskType;
		this.category = category;
		this.checker = checker;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public String getType() {
		return Type;
	}
	
	public void setType(String type) {
		Type = type;
	}
	
	public String getDate_creation() {
		return date_creation;
	}
	
	public void setDate_creation(String date_creation) {
		this.date_creation = date_creation;
	}
	
	public String getDate_updated() {
		return date_updated;
	}
	
	public void setDate_updated(String date_updated) {
		this.date_updated = date_updated;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getRegion() {
		return region;
	}
	
	public void setRegion(String region) {
		this.region = region;
	}
	
	public String getBusiness() {
		return business;
	}
	
	public void setBusiness(String business) {
		this.business = business;
	}
	
	public String getSilo() {
		return silo;
	}
	
	public void setSilo(String silo) {
		this.silo = silo;
	}
	
	public String getRiskType() {
		return riskType;
	}
	
	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getChecker() {
		return checker;
	}
	
	public void setChecker(String checker) {
		this.checker = checker;
	}
}
