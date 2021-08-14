package com.example.demo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="countries")
public class Country {
	@Id
	@Column(length=2)
	private String countryId;
	private String countryName;
	@ManyToOne(targetEntity=Region.class,cascade=CascadeType.ALL)
	@JoinColumn(name="region_id")
	private Region region;
	
	public Country() {
		 super();
	}
	

	public Country(String countryId, String countryName,Region region) {
		
		this.countryName = countryName;
		this.countryId = countryId;
		this.region=region;

	}
		
	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + ", region=" + region + "]";
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	
}
