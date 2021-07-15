package io.fall.springbootjpa.courseContent;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.fall.springbootjpa.course.CourseService;

@Service
public class ChapterService {

    @Autowired
    private ChapterRepository chapterRepository;

    @Autowired
    private CourseService courseService;
    
    public List<Chapter> getAllChapters(String courseId) {
        return (List<Chapter>) chapterRepository.findByCourseId(courseId);
    }

    public Chapter getChapter(String courseId, String id) {
        Optional<Chapter> chapter =  chapterRepository.findById(id);
        if(chapter.isPresent()){
            return chapter.get();
        }
        return null;
    }

    public void addChapter(String courseId, Chapter chapter) {
        chapter.setCourse(courseService.getCourse(courseId));
        chapterRepository.save(chapter);
    }

    public void updateChapter(String courseId, String id, Chapter chapter) {
        chapter.setCourse(courseService.getCourse(courseId));
        chapterRepository.save(chapter);
    }

    public void deleteChapter(String courseId, String id) {
        chapterRepository.deleteById(id);
    }
}
