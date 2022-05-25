package academic.service.facade.student;

import academic.dto.StudentDTO;
import academic.service.facade.UseCaseFacade;

public interface RegisterStudentFacade extends UseCaseFacade<StudentDTO>{

	void execute(StudentDTO studentDTO);
}
