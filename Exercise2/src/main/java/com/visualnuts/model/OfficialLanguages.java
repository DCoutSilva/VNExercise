package com.visualnuts.model;

import java.util.List;

public class OfficialLanguages {

	private String country;
	
	private List<String> languages;

	public OfficialLanguages(String country, List<String> languages) {
		super();
		this.country = country;
		this.languages = languages;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}


	
}
