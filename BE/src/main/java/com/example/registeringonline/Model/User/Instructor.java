package com.example.registeringonline.Model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "instructor")
@Data
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id")
public class Instructor extends User {

    @Column(name = "instructor_id")
    private String instructorID;

    @Column(name = "subject_group")
    private String subjectGroup;

    @Column(name = "rankk")
    private String rank;

    @Column(name = "faculty")
    private String faculty;

}
