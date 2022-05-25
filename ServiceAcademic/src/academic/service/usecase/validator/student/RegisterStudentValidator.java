package academic.service.usecase.validator.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import academic.domain.StudentDomain;
import academic.service.usecase.validator.Validator;
import academic.service.usecase.validator.rules.student.StudentExistsRule;

@Service
public class RegisterStudentValidator implements Validator<StudentDomain>{

	
	@Override
	public void validate(StudentDomain domain) {
		studentExistsRule.execute(domain.create());	
	}
	
	@Autowired 
	private StudentExistsRule studentExistsRule;
	
	private RegisterStudentValidator() {
		super();
	}
	


}
