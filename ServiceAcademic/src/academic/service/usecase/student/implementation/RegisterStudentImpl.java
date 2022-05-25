package academic.service.usecase.student.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import academic.domain.StudentDomain;
import academic.entity.StudentEntity;
import academic.persistence.dao.student.StudentRepository;
import academic.service.assembler.implementation.StudentAssembler;
import academic.service.usecase.student.RegisterStudent;
import academic.service.usecase.validator.student.RegisterStudentValidator;

@Service
public class RegisterStudentImpl implements RegisterStudent{

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private RegisterStudentValidator registerStudentValidator;
	
	@Override
	public void execute(StudentDomain domain) {
		
		registerStudentValidator.validate(domain);
		StudentEntity studentEntity = StudentAssembler.getStudentAssembler().convertDomainToEntity(domain);
		studentRepository.save(studentEntity);
		
	}
}
