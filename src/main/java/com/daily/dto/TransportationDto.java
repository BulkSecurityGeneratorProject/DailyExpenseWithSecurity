package com.daily.dto;

import java.io.Serializable;

public class TransportationDto implements Serializable{
	
	private static final long serialVersionUID = 5795492772785736408L;
	/**
	 * 
	 */
	private String date;
	private String description;
	private String category;
	private String expense;
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getExpense() {
		return expense;
	}
	public void setExpense(String expense) {
		this.expense = expense;
	}
	
}
