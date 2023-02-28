package com.fotocondeproducciones.webapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "client")
public class ClientEntity {


	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		private Long contractId;
		@Column
		private String studentName;
		@Column
		private String parentName;
		@Column
		private String school;
		@Column
		private String group;
		@Column
		private String classOf;
		@Column
		private String address;
		@Column
		private String state;
		@Column
		private String city;
		@Column
		private String phone;
		@Column
		private String mobilPhone;
		@Column
		private String email;
		@Column
		private String ringSize;
		@Column
		private String shirtSize;
		@Column
		private String packOption;
		@Column
		private String extras;
		@Column
		private String photo;
		@Column
		private String signature;

}
