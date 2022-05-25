package academic.service.usecase.student.implementation;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import academic.domain.StudentDomain;
import academic.entity.StudentEntity;
import academic.persistence.dao.student.StudentRepository;
import academic.service.assembler.implementation.StudentAssembler;
import academic.service.usecase.student.FindAllStudent;

@Service
public class FindAllStudentImpl implements FindAllStudent{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<StudentDomain> execute(StudentDomain domain) {
		List<StudentEntity> attendances = studentRepository.findAll();
		return StudentAssembler.getStudentAssembler().convertListEntityToListDomain(attendances);
	}

	

	
}
