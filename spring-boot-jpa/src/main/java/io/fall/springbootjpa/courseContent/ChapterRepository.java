package io.fall.springbootjpa.courseContent;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ChapterRepository extends CrudRepository<Chapter,String> {
    
    public List<Chapter> findByName(String name);
    /*
    spring will implement this method :

        find + By + variableName (naming convention - camelCase)

        works only for primitive data-types & string
    */

    public List<Chapter> findByDescription(String description);

    public List<Chapter> findByCourseId(String courseId);
}
