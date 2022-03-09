package com.travel.fox.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long num;
	@Column(columnDefinition = "text")
	private String message;

	@ManyToOne
	Customer customer;

	public Message() {

	}

	public Message(Long num, String message, Customer customer) {
		super();
		this.num = num;
		this.message = message;
		this.customer = customer;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Message [num=" + num + ", message=" + message + ", customer=" + customer + "]";
	}

}
