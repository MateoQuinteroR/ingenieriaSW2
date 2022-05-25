package academic.api.controller.attendance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import academic.dto.AttendanceDTO;
import academic.service.facade.attendance.FindAllAttendanceFacade;
import academic.service.facade.attendance.RegisterAttendanceFacade;

@RestController
@RequestMapping("api/attendance")
public class RegisterAttendanceController {
	
	@Autowired
	private RegisterAttendanceFacade registerAttendanceFacade;

	@Autowired
	private FindAllAttendanceFacade findAllAttendanceFacade;
	
	@GetMapping
	public List<AttendanceDTO> findAll() {
		return findAllAttendanceFacade.execute(AttendanceDTO.create());
	}
	
	@GetMapping("/dummy")
	public AttendanceDTO getDummy() {
		return AttendanceDTO.create();
	}
	
	@PostMapping
	public String register(@RequestBody AttendanceDTO attendanceDTO) {
		registerAttendanceFacade.execute(attendanceDTO);
		return "Asistencia registrada exitosamente.";
	}
		
}
