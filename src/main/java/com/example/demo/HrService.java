package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HrService {
	@Autowired
	RegionRepository regionRepository;
	@Autowired
    CountryRepository countryRepository;
		public  List<Region> getAllRegion()
		{
			return (List<Region>) (regionRepository.findAll());
			
		}
		public  Region getRegionById(int id)
		{
			 return regionRepository.findById(id).orElse(null);
			
		}
		
		
		
		public  Country getContryById(String id)
		{
			 return countryRepository.findById(id).orElse(null);
			
		}
		public  Region addOrUpdateRegion(Region region)
		{return regionRepository.save(region);}
		
		
		public  Region deleteRegion(int id) throws Exception
		{
			Region deleteRegion=null;
			try {
				deleteRegion=regionRepository.findById(id).orElse(null);
				if(deleteRegion==null)
				{throw new Exception("Region not available"); }
				else {
					regionRepository.deleteById(id);
				}
			}
			catch(Exception E)
			{
				throw E;
			}
			return deleteRegion;
			
		}
		
		public  List<Country> getAllCountry()
		{   
			return (List<Country>) (countryRepository.findAll());
			
		}
		
		public  Country addOrUpdateCountry(Country country)
		{return countryRepository.save(country);}

	}


