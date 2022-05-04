package academic.persistence.dao.attendance;

import org.springframework.data.jpa.repository.JpaRepository;

import academic.entity.AttendanceEntity;

public interface AttendanceRepository extends JpaRepository <AttendanceEntity, String> {

}
