package academic.service.usecase.attendance.implementation;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import academic.domain.AttendanceDomain;
import academic.entity.AttendanceEntity;
import academic.persistence.dao.attendance.AttendanceRepository;
import academic.service.assembler.implementation.AttendanceAssembler;
import academic.service.usecase.attendance.FindAllAttendance;

@Service
public class FindAllAttendanceImpl implements FindAllAttendance{

	@Autowired
	private AttendanceRepository attendanceRepository;
	
	@Override
	public List<AttendanceDomain> execute(AttendanceDomain domain) {
		List<AttendanceEntity> attendances = attendanceRepository.findAll();
		return AttendanceAssembler.getAttendanceAssembler().convertListEntityToListDomain(attendances);
	}

	

	
}
