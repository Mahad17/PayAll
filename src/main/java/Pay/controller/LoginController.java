package Pay.controller;

import Pay.model.User;
import Pay.repository.UserRepository;
import Pay.response.ResponseHandler;
import Pay.services.LogInService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pay")
public class LoginController {

	@Autowired
	LogInService logInService;

	@Autowired
	UserRepository repository;

	@PostMapping(value = "/signUp",produces = "application/json")
	public ResponseHandler signUp(@RequestBody @Valid User user) {
		System.out.println(user);
		if(
				StringUtils.isEmpty(user.getCprNumber()) ||
				StringUtils.isEmpty(user.getPhoneNumber()) ||
//						StringUtils.isEmpty(user.getCountryCode()) ||
				StringUtils.isEmpty(user.getPassword()) ||
				StringUtils.isEmpty(user.getUserName()
		)){
			return new ResponseHandler(0, "Fields Are Empty");

		}

		User find=repository.findByUserName(user.getUserName());
		if(find!=null){
			return  new ResponseHandler(0,"name already exist");

		}
		String phoneNumber = user.getPhoneNumber();
		boolean numberExists = repository.existsByPhoneNumber(phoneNumber);

		if (numberExists) {
			return new ResponseHandler(0, "Number already exists");
		}
		User post= logInService.postDetails(user);
	if (post!=null){
		return new ResponseHandler(1, "Signed Up successfully",post);

	}else {
		return new ResponseHandler(0, "Not Successful");
	}
	}
@PostMapping(value = "/user-login",produces = "application/json")
	public ResponseHandler logIn(@RequestBody User user){
		if (StringUtils.isEmpty(user.getUserName())|| StringUtils.isEmpty(user.getPassword())){
			return new ResponseHandler(0,"fields are empty");
		}


//		String phoneNumber= user.getCountryCode() + user.getNumber();
		boolean numberExists=repository.existsByUserName(user.getUserName());
		if (!numberExists){
			return new ResponseHandler(0,"User Not Registered");
		}
		else{
			Boolean isAuthenticated = logInService.logIn(user.getPassword(), user.getUserName());
			if (isAuthenticated) {
				User authenticate = repository.findByUserName(user.getUserName());
				return new ResponseHandler(1, "Login successful.", authenticate);
			} else {
				return new ResponseHandler(0, "Incorrect password.");
			}
		}
}




}



