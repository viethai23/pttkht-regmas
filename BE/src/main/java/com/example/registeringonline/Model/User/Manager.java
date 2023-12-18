package com.example.registeringonline.Model.User;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "manager")
@Data
@PrimaryKeyJoinColumn(name = "user_id")
public class Manager extends User {
	@Column(name = "position")
	private String position;

	@Column(name = "start_date")
	private Date startDate;

	@Column(name = "salary")
	private double salary;
}