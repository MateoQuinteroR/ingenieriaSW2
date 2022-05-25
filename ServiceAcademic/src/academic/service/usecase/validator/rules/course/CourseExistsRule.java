package academic.service.usecase.validator.rules.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import academic.crosscutting.exception.AcademicException;
import academic.domain.CourseDomain;
import academic.persistence.dao.course.CourseRepository;
import academic.service.usecase.validator.rules.Rule;

@Service
public class CourseExistsRule implements Rule<CourseDomain>{

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public void execute(CourseDomain domain) {
		
		if (!courseRepository.findById(domain.getId()).isPresent()){
			var message = "El course para el cual se llevará a a cabo no existe.";
			throw AcademicException.buildBusinessServiceException(message);
		}
		
	}

}
