package academic.persistence.dao.session;

import org.springframework.data.jpa.repository.JpaRepository;

import academic.entity.SessionEntity;

public interface SessionRepository extends JpaRepository<SessionEntity, Integer>{

}
