package com.example.coursesservice.Repositories;

import com.example.coursesservice.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findAll();
    Course findByCourseName(String courseName);
}
