package com.jobiak.mvcforms.model;
//JPA-> is a standard and specification for developing ORM framework
//ORM-Object relation mapping 
//bean in jsp,model in spring,Entity in 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="userdata")
@AllArgsConstructor
@ToString
public class User {

	@Id //Id means primary key
	@Setter
	@Getter
	private Long userId;
	@Setter
	@Getter
	private String name;
	@Setter
	@Getter
	private String email;
	@Setter
	@Getter
	private Long mobile;
	/*
	 * public User() { super(); // TODO Auto-generated constructor stub } public
	 * User(Long userId, String name, String email, Long mobile) { super();
	 * this.userId = userId; this.name = name; this.email = email; this.mobile =
	 * mobile; } public Long getUserId() { return userId; } public void
	 * setUserId(Long userId) { this.userId = userId; } public String getName() {
	 * return name; } public void setName(String name) { this.name = name; } public
	 * String getEmail() { return email; } public void setEmail(String email) {
	 * this.email = email; } public Long getMobile() { return mobile; } public void
	 * setMobile(Long mobile) { this.mobile = mobile; }
	 */
}