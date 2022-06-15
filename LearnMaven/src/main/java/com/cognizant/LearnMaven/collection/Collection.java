package com.cognizant.LearnMaven.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection {

	private List<String> laptop;
	private Set<String> Mobile;
	private Map<Integer, String> country;
	@Override
	public String toString() {
		return "Collection [laptop=" + laptop + ", Mobile=" + Mobile + ", country=" + country + "]";
	}
	public Collection(List<String> laptop, Set<String> mobile, Map<Integer, String> country) {
		super();
		this.laptop = laptop;
		Mobile = mobile;
		this.country = country;
	}
	public Collection() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<String> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<String> laptop) {
		this.laptop = laptop;
	}
	public Set<String> getMobile() {
		return Mobile;
	}
	public void setMobile(Set<String> mobile) {
		Mobile = mobile;
	}
	public Map<Integer, String> getCountry() {
		return country;
	}
	public void setCountry(Map<Integer, String> country) {
		this.country = country;
	}
	
	
}
