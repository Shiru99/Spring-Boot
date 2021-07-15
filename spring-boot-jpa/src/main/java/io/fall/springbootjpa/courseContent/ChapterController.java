package io.fall.springbootjpa.courseContent;

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
public class ChapterController {

    @Autowired
    private ChapterService chapterService;

    @RequestMapping("courses/{courseId}/chapters")
    public List<Chapter> getAllChapters(@PathVariable("courseId") String courseId) {
        return chapterService.getAllChapters(courseId);
    }

    @RequestMapping("courses/{courseId}/chapters/{id}")
    public Chapter getChapter(@PathVariable String courseId, @PathVariable String id) {
        return chapterService.getChapter(courseId,id);
    }

    @PostMapping("courses/{courseId}/chapters")
    public void addChapter(@PathVariable String courseId, @RequestBody Chapter Chapter) {
        chapterService.addChapter(courseId, Chapter);
    }

    @PutMapping("courses/{courseId}/chapters/{id}")
    public void updateChapter(@PathVariable String courseId, @PathVariable("id") String id, @RequestBody Chapter Chapter) {
        chapterService.updateChapter(courseId, id, Chapter);
    }

    @DeleteMapping("courses/{courseId}/chapters/{id}")
    public void deleteChapter(@PathVariable String courseId, @PathVariable("id") String id) {
        chapterService.deleteChapter(courseId, id);
    }
}
