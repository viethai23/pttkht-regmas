package com.example.shoppingonline.Model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id")
public class Student extends User {

	@Column(name = "student_id")
	private String studentID;

	@Column(name = "major")
	private String major;

	@Column(name = "classs")
	private String classs;

	@Column(name = "faculty")
	private String faculty;
}