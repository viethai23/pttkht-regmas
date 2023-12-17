package com.example.shoppingonline.Model.Course;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "subject")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "credit")
	private double credit;

	@Column(name = "faculty")
	private String faculty;

	@Column(name = "major")
	private String major;

	@Column(name = "class_hour")
	private float classHour;
}