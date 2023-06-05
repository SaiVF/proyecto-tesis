package svf.com.service;



import java.util.List;

import svf.com.exception.CustomerException;
import svf.com.exception.LogInException;
import svf.com.model.SignUpData;

public interface SignUpService {
	
public SignUpData createNewSignUp(SignUpData signUp) throws LogInException;
	
	public SignUpData updateSignUpDetails(SignUpData signUp,String key) throws LogInException;
	
	public List<SignUpData> showallcustomers()throws CustomerException;
	
	public SignUpData deletecustomer(Integer userId)throws CustomerException;
	
	
	

}

