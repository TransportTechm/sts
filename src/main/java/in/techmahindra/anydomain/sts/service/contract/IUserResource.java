/**
 * 
 */
package in.techmahindra.anydomain.sts.service.contract;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.techmahindra.anydomain.sts.service.dto.UserDto;

/**
 * @author SV00542797
 *
 */

public interface IUserResource 
{
	
	public void signUp(UserDto userDto);
	//TODO - following needs to be removed - it's a test 
	
	public String testEndPoint();
	

}
