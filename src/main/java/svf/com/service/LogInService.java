package svf.com.service;

import svf.com.exception.LogInException;
import svf.com.model.LogInData;

public interface LogInService {
	
	

	public String logInAccount(LogInData loginData)throws LogInException;
	public String logOutFromAccount(String key) throws LogInException;


}
