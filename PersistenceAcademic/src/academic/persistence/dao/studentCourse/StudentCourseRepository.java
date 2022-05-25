package academic.persistence.dao.studentCourse;

import org.springframework.data.jpa.repository.JpaRepository;

import academic.entity.StudentCourseEntity;

public interface StudentCourseRepository extends JpaRepository<StudentCourseEntity, Integer>{

}
