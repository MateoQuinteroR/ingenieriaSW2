package academic.service.usecase.validator.rules.studentCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import academic.crosscutting.exception.AcademicException;
import academic.domain.StudentCourseDomain;
import academic.persistence.dao.studentCourse.StudentCourseRepository;
import academic.service.usecase.validator.rules.Rule;

@Service
public class StudentCourseExistsRule implements Rule<StudentCourseDomain>{

	@Autowired
	private StudentCourseRepository studentCourseRepository;
	
	@Override
	public void execute(StudentCourseDomain domain) {
		
		if (!studentCourseRepository.findById(domain.getId()).isPresent()){
			var message = "El estudiante para el cual se llevará a a cabo no existe.";
			throw AcademicException.buildBusinessServiceException(message);
		}
		
	}

}
