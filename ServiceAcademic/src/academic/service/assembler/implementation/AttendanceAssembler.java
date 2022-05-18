package academic.service.assembler.implementation;

import academic.domain.AttendanceDomain;
import academic.dto.AttendanceDTO;
import academic.entity.AttendanceEntity;
import academic.service.assembler.Assembler;

public class AttendanceAssembler implements Assembler <AttendanceDomain, AttendanceDTO, AttendanceEntity>{

	private static final Assembler <AttendanceDomain, AttendanceDTO, AttendanceEntity>
	INSTANCE =new AttendanceAssembler();
	
	private AttendanceAssembler() {
		super();
	}
	
	public static Assembler <AttendanceDomain, AttendanceDTO, AttendanceEntity>
	getCourseAssembler(){
		return INSTANCE;
	}

	@Override
	public AttendanceDTO convertDomainToDTO(AttendanceDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AttendanceEntity convertDomainToEntity(AttendanceDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AttendanceDomain convertDTOToDomain(AttendanceDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AttendanceDomain convertEntityToDomain(AttendanceEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}


}
