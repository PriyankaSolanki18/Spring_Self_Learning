package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class DaalBati {
	private String katori;

	public String getKatori() {
		return katori;
	}

	public void setKatori(String katori) {
		this.katori = katori;
	}

	public DaalBati() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DaalBati [katori=" + katori + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("starting method of DaalBati....");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("ending method DaalBati....");
	}
	
	
}
