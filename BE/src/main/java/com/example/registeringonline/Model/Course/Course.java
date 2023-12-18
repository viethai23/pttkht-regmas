package com.example.registeringonline.Model.Course;

import com.example.registeringonline.Model.User.Instructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "course")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "id")
	private int id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "subject_id")
	private Subject subject;

	@ManyToOne
	@JoinColumn(name = "instructor_id")
	private Instructor instructor;

	@Column(name = "start_date")
	private Date startDate;

	@Column(name = "time")
	private String time;

	@Column(name = "room")
	private String room;

	@Column(name = "capacity")
	private int capacity;

	@Column(name = "semester")
	private int semester;

	@Column(name = "school_year")
	private int schoolYear;
}