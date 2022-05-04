package academic.service.facade.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import academic.domain.AttendanceDomain;
import academic.dto.AttendanceDTO;
import academic.service.facade.attendance.RegisterAttendanceFacade;
import academic.service.usecase.attendance.RegisterAttendance;

@Service
@Transactional
public class RegisterAttendanceFacadeImpl implements RegisterAttendanceFacade{

	@Autowired
	private RegisterAttendance registerAttendance;
	
	@Override
	public void execute(AttendanceDTO dto) {
		AttendanceDomain domain = null;
		registerAttendance.execute(domain);
		
	}
}
