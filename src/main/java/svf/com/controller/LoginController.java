package svf.com.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import svf.com.exception.LogInException;
import svf.com.model.LogInData;
import svf.com.service.LogInService;

@RestController
public class LoginController {
	

	@Autowired
	private LogInService loginService;
	
	@PostMapping("/login")
	public String loginHandler( @Valid @RequestBody LogInData loginData) throws LogInException {
		return loginService.logInAccount(loginData);
	}
	
	@PatchMapping("/logout")
	public String logOutFromAccount(@RequestParam String key) throws LogInException
	{
		return loginService.logOutFromAccount(key);
	}
	//done

}
