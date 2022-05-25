package academic.persistence.dao.course;

import org.springframework.data.jpa.repository.JpaRepository;

import academic.entity.CourseEntity;

public interface CourseRepository extends JpaRepository<CourseEntity, Integer>{

}
