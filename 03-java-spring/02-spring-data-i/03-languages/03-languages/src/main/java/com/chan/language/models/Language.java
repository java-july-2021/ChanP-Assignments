package com.chan.language.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="language")
public class Language {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Size(min=2, max=20)
	private String name;
	@Size(min=2, max=20)
	private String creator;
	@NotNull
	private Float currentversion;
	
	public Language() {

	}

	public Language(String name, String creator, Float currentversion) {
		this.name = name;
		this.creator = creator;
		this.currentversion = currentversion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Float getCurrentversion() {
		return currentversion;
	}

	public void setCurrentversion(Float currentversion) {
		this.currentversion = currentversion;
	}
	
}
