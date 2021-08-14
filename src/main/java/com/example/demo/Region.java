package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="regions")
public class Region {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int region_id;

	private String regionName;
	
	public Region() {}
	public Region(int regionId, String regionName) {
		this.region_id = regionId;
		this.setRegionName(regionName);
	}
	@Override
	public String toString() {
		return "Region [region_id=" + region_id + ", regionName=" + regionName + "]";
	}

	public int getRegionId() {
		return region_id;
	}

	public void setRegionId(int regionId) {
		this.region_id = regionId;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

}
