package com.example.registeringonline.Model.Register;

import com.example.registeringonline.Model.Course.Course;
import com.example.registeringonline.Model.User.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "student_register")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Register {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToOne()
	@JoinColumn(name = "student_id")
	private Student student;

	@ManyToOne()
	@JoinColumn(name = "course_id")
	private Course course;

	@Column(name = "semester")
	private int semester;

	@Column(name = "school_year")
	private int schoolYear;

	@Column(name = "final_score")
	private double finalScore;
}