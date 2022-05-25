package academic.api.controller.attendance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import academic.dto.StudentDTO;
import academic.service.facade.student.FindAllStudentFacade;
import academic.service.facade.student.RegisterStudentFacade;

@RestController
@RequestMapping("api/student")
public class RegisterStudentController {
	
	@Autowired
	private RegisterStudentFacade registerStudentFacade;

	@Autowired
	private FindAllStudentFacade findAllStudentFacade;
	
	@GetMapping
	public List<StudentDTO> findAll() {
		return findAllStudentFacade.execute(StudentDTO.create());
	}
	
	@GetMapping("/dummy")
	public StudentDTO getDummy() {
		return StudentDTO.create();
	}
	
	@PostMapping
	public String register(@RequestBody StudentDTO studentDTO) {
		registerStudentFacade.execute(studentDTO);
		return "Estudiante registrado exitosamente.";
	}
		
}
