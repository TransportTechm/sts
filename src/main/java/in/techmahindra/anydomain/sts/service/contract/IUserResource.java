/**
 * 
 */
package in.techmahindra.anydomain.sts.service.contract;

import in.techmahindra.anydomain.sts.persistence.User;

/**
 * @author SV00542797
 *
 */
public interface IUserResource 
{
	public void signUp(User userDto);

}
