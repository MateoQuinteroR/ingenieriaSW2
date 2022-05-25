package academic.service.usecase.validator.rules.session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import academic.crosscutting.exception.AcademicException;
import academic.domain.SessionDomain;
import academic.persistence.dao.session.SessionRepository;
import academic.service.usecase.validator.rules.Rule;

@Service
public class SessionExistsRule implements Rule<SessionDomain>{

	@Autowired
	private SessionRepository sessionRepository;
	
	@Override
	public void execute(SessionDomain domain) {
		
		if (!sessionRepository.findById(domain.getId()).isPresent()){
			var message = "La sesión para el cual se llevará a a cabo no existe.";
			throw AcademicException.buildBusinessServiceException(message);
		}
		
	}

}
