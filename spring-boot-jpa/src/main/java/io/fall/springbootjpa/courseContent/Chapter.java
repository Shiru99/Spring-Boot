package io.fall.springbootjpa.courseContent;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.fall.springbootjpa.course.Course;

@Entity
public class Chapter {

    @Id
    private String id;
    private String name;
    private String description;

    @ManyToOne
    // @ManyToOne(fetch = FetchType.LAZY)
    private Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Chapter() {
    }

    public Chapter(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}