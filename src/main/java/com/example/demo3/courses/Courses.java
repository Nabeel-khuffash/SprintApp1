package com.example.demo3.courses;


import com.example.demo3.topics.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Courses {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id)
    {
        return courseService.getAllCourses(id);
    }

    @RequestMapping("topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable String id)
    {
        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId)
    {
        course.setTopic(new Topic(topicId,"",""));
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value="topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String topicId)
    {
        course.setTopic(new Topic(topicId,"",""));
        courseService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="courses/{id}")
    public void deleteCourses(@PathVariable String id)
    {
        courseService.deleteCourse(id);
    }
}
