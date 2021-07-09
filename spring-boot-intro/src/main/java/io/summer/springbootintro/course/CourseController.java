package io.summer.springbootintro.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/courses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @RequestMapping("/courses/{id}")
    public Course getCourse(@PathVariable("id") String id) {
        return courseService.getCourse(id);
    }

    // @RequestMapping(method = RequestMethod.POST, value = "/courses")
    @PostMapping("/courses")
    public void addCourse(@RequestBody Course course) {
        courseService.addCourse(course);
    }

    // @RequestMapping(method = RequestMethod.PUT, value = "/courses/{id}")
    @PutMapping("/courses/{id}")
    public void updateCourse(@PathVariable("id") String id, @RequestBody Course course) {
        courseService.updateCourse(id, course);
    }

    // @RequestMapping(method = RequestMethod.DELETE, value = "/courses")
    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable("id") String id) {
        courseService.deleteCourse(id);
    }
}
