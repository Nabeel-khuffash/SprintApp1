package com.example.demo3.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId)
    {

        return courseRepository.findByTopicId(topicId);
        //ArrayList<Course> courses = new ArrayList<>();
        //courseRepository.findAll().forEach(courses::add);
        //return courses;
    }
    public Course getCourse(String id)
    {
        return courseRepository.findById(id).get();
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
