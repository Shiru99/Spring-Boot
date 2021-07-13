package io.fall.springbootjpa.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    private List<Course> courses = new ArrayList<>(
        Arrays.asList(
            new Course("1", "Spring Boot", "Introduction to spring boot"),
            new Course("2", "Java", "Introduction to Java"),
            new Course("3", "JSPs & Servlets", "introduction to JSPs & Servlets")
        )
    );

    public List<Course> getAllCourses() {
        List<Course> c = (List<Course>) courseRepository.findAll();
        return c;
    }

    public Course getCourse(String id) {
        return courses.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void updateCourse(String id, Course course) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getId().equals(id)) {
                courses.set(i, course);
                break;
            }
        }
    }

    public void deleteCourse(String id) {
        courses.removeIf(t-> t.getId().equals(id));
        // for (int i = 0; i < courses.size(); i++) {
        //     if (courses.get(i).getId().equals(id)) {
        //         courses.remove(i);
        //         break;
        //     }
        // }
    }
}
