/**
 * 
 */
package in.techmahindra.anydomain.sts.service.dto;

import javax.persistence.Column;

/**
 * @author SV00542797
 *
 */
public class UserDto 
{
	
	private String userId;
	private String password;
	/**
	 * @param userId
	 * @param password
	 */
	public UserDto(String userId, String password)
	{
		super();
		this.userId = userId;
		this.password = password;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
