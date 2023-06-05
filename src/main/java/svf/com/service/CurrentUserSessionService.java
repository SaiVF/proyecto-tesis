package svf.com.service;


import svf.com.exception.LogInException;
import svf.com.model.CurrentUserSession;
import svf.com.model.SignUpData;

public interface CurrentUserSessionService {
	
	

	
		
		public CurrentUserSession getCurrentUserSession(String key) throws LogInException;;
		public Integer getCurrentUserSessionId(String key) throws LogInException;
		
		public SignUpData getSignUpDetails(String key) throws LogInException;
		

	

}