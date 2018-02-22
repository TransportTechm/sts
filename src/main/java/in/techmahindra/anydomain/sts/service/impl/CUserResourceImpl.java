package in.techmahindra.anydomain.sts.service.impl;

import java.util.Calendar;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.techmahindra.anydomain.sts.domain.AuditTrail;
import in.techmahindra.anydomain.sts.domain.Role;
import in.techmahindra.anydomain.sts.domain.User;
import in.techmahindra.anydomain.sts.persitence.IUserRepository;
import in.techmahindra.anydomain.sts.service.contract.IUserResource;
import in.techmahindra.anydomain.sts.service.dto.UserDto;

@Component
@RestController
@RequestMapping("/api")
public class CUserResourceImpl implements IUserResource 
{
	private Logger logger = Logger.getLogger(this.getClass().toString());
	@Autowired
	IUserRepository iUserRepository;

	@Override
	@Transactional
	@PostMapping
	@RequestMapping("/sts/ver1/users/user/signup")
	public void signUp(@RequestBody UserDto userDto) 
	{
		// TODO Auto-generated method stub
		try
		{
			if (userDto == null)
				throw new RuntimeException("no user to sign-up");
			Calendar createdDateTime = Calendar.getInstance();
			Calendar updatedDateTime = null;
			
			AuditTrail auditTrail = new AuditTrail(createdDateTime,updatedDateTime,"system","");
			Role role = null;
			User user = new User();
			user.setAuditTrail(auditTrail);
			user.setRoles(null);
			user.setPassword(userDto.getPassword());
			user.setUserId(userDto.getUserId());
			User newUser = iUserRepository.save(user);//not used - newly created user
				
		}
		catch(Exception ex)
		{
			ex.printStackTrace();//TODO - to log it
		}
		finally
		{
			
		}

	}

	@Override
	@RequestMapping(method = RequestMethod.GET, value = "/sts/ver1/test1")
	public String testEndPoint() {
		// TODO Auto-generated method stub
		try
		{
			
		}
		catch(Exception ex)
		{
			
		}
		finally
		{
			
		}
		return "{HI there, test}";
	}

	/**
	 * @return the iUserRepository
	 */
	public IUserRepository getiUserRepository() {
		return iUserRepository;
	}

	/**
	 * @param iUserRepository the iUserRepository to set
	 */
	public void setiUserRepository(IUserRepository iUserRepository) {
		this.iUserRepository = iUserRepository;
	}

}
