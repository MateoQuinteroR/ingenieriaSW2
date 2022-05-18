package academic.api.controller.attendance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import academic.dto.AttendanceDTO;
import academic.service.facade.attendance.RegisterAttendanceFacade;

@RestController
@RequestMapping("api/attendance")
public class RegisterAttendanceController {
	
	@Autowired
	private RegisterAttendanceFacade registerAttendanceFacade;
	
	public void register(@RequestBody AttendanceDTO attendanceDTO) {
		registerAttendanceFacade.execute(attendanceDTO);
		
	}
		
}
