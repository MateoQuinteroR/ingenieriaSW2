package academic.service.facade.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import academic.domain.AttendanceDomain;
import academic.dto.AttendanceDTO;
import academic.service.assembler.implementation.AttendanceAssembler;
import academic.service.facade.attendance.RegisterAttendanceFacade;
import academic.service.usecase.attendance.FindAllAttendance;
import academic.service.usecase.attendance.RegisterAttendance;

@Service
public class FindAllAttendanceFacadeImpl implements RegisterAttendanceFacade{

	@Autowired
	private FindAllAttendance findAllAttendance;
	
	@Override
	public List<AttendanceDTO> execute(AttendanceDTO dto) {
		
		AttendanceDomain domain = AttendanceAssembler.getAttendanceAssembler().convertDTOToDomain(dto);
		List<AttendanceDomain> domains = findAllAttendance.execute(domain);
		
		return AttendanceAssembler.getAttendanceAssembler().convertListDomainToListDTO(domains);
		
	}
}
