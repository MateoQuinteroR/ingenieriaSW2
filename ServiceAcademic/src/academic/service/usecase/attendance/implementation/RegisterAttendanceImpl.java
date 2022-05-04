package academic.service.usecase.attendance.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import academic.domain.AttendanceDomain;
import academic.entity.AttendanceEntity;
import academic.persistence.dao.attendance.AttendanceRepository;
import academic.service.usecase.attendance.RegisterAttendance;

@Service
public class RegisterAttendanceImpl implements RegisterAttendance{

	@Autowired
	private AttendanceRepository attendanceRepository;

	@Override
	public void execute(AttendanceDomain domain) {
		//Business Logic
		//1. Diagrama de actividades
		AttendanceEntity attendanceEntity = null;
		attendanceRepository.save(attendanceEntity);
		
	}
}
