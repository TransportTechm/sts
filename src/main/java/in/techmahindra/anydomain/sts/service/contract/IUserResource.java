/**
 * 
 */
package in.techmahindra.anydomain.sts.service.contract;

import in.techmahindra.anydomain.sts.service.dto.UserDto;

/**
 * @author SV00542797
 *
 */
@RestController
public interface IUserResource 
{
	public void signUp(UserDto userDto);

}
