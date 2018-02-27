package in.techmahindra.anydomain.sts.web;

import java.sql.SQLException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.techmahindra.anydomain.sts.domain.User;
import in.techmahindra.anydomain.sts.persitence.IUserRepository;
import in.techmahindra.anydomain.sts.service.dto.UserDto;
import in.techmahindra.anydomain.sts.service.impl.CUserResourceImpl;

@RestController
@RequestMapping("/api")
public class UserController {

	
	private Logger logger = Logger.getLogger(this.getClass().toString());
	
	
	@Autowired
	CUserResourceImpl cuserresourceimpl;
	
	@Autowired
	IUserRepository iUserRepository;
	
	@Autowired
	DataSource cleardb;
	
	@Autowired
	DataSource db;
	
	@PostMapping("/sts/ver1/users/user/signup")
	public ResponseEntity<String> signUp(@RequestBody UserDto userDto) 
	{
		
		logger.info(userDto.getUserId());
		if (userDto == null)
			throw new RuntimeException("no user to sign-up");
		
		
		//create user in db
		
		cuserresourceimpl.signUp(userDto);
			
	return new 	ResponseEntity<String>("user created successfully.....",HttpStatus.OK);
		
		
	}
	
	
}
