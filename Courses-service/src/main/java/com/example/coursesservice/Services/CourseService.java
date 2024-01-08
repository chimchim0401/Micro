package com.example.coursesservice.Services;
import com.example.coursesservice.Models.Course;
import com.example.coursesservice.Repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Optional<Course> getCourseById(Long courseId) {
        return courseRepository.findById(courseId);
    }

    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    public Course getCourseByCourseName(String courseName) {
        return courseRepository.findByCourseName(courseName);
    }
}
