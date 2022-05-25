package academic.service.facade.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import academic.domain.StudentDomain;
import academic.dto.StudentDTO;
import academic.service.assembler.implementation.StudentAssembler;
import academic.service.facade.student.FindAllStudentFacade;
import academic.service.usecase.student.FindAllStudent;

@Service
public class FindAllStudentFacadeImpl implements FindAllStudentFacade{

	@Autowired
	private FindAllStudent findAllStudent;
	
	@Override
	public List<StudentDTO> execute(StudentDTO dto) {
		
		StudentDomain domain = StudentAssembler.getStudentAssembler().convertDTOToDomain(dto);
		List<StudentDomain> domains = findAllStudent.execute(domain);
		
		return StudentAssembler.getStudentAssembler().convertListDomainToListDTO(domains);
		
	}
}
