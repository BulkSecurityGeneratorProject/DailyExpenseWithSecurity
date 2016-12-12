package com.daily.domain;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "miscellaneous")
public class Miscellaneous implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4398738839894550978L;

	@Id
	private String date;
	
	@NotNull
	private String description;
	
	@NotNull
	private String category;
	
	@NotNull
	private String expense;
	
	@NotNull
	private String email;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExpense() {
		return expense;
	}

	public void setExpense(String expense) {
		this.expense = expense;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
