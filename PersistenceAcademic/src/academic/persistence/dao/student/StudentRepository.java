package academic.persistence.dao.student;

import org.springframework.data.jpa.repository.JpaRepository;

import academic.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

}
