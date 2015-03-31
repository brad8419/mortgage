package com.mercury.demand.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="PERSON")
public class Person {
	private int person_id;
	private String username;
	private String password;
	private String email;
	private int authority;

	// Constructors
		/** default constructor */
	    public Person() {}

		// Property accessors
		@Id
		@GeneratedValue(generator="increment")
		@GenericGenerator(name="increment", strategy="increment")
		@Column(name="ID", nullable = false)
		public int getPerson_id() {
			return person_id;
		}

		public void setPerson_id(int person_id) {
			this.person_id = person_id;
		}
	    @Column
		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}
	    @Column
		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
	    @Column
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
	    @Column
		public int getAuthority() {
			return authority;
		}

		public void setAuthority(int authority) {
			this.authority = authority;
		}
	    

	
}
