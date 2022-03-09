package com.travel.fox.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long num;
	private String name;
	private String firstname;
	private String email;

	@OneToMany(cascade = { CascadeType.REMOVE }, fetch = FetchType.EAGER, mappedBy = "customer")
	private List<Message> messages = new ArrayList<Message>();

	public Customer() {

	}

	public Customer(Long num, String name, String firstname, String email, List<Message> messages) {
		super();
		this.num = num;
		this.name = name;
		this.firstname = firstname;
		this.messages = messages;
		this.email = email;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public void addMessage(Message m) {
		messages.add(m);
		m.setCustomer(this);
	}

	@Override
	public String toString() {
		return "Customer [num=" + num + ", name=" + name + ", firstname=" + firstname + ", messages=" + messages + "]";
	}

}