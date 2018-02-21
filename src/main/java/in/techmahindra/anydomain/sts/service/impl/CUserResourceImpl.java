package in.techmahindra.anydomain.sts.service.impl;

import org.springframework.stereotype.Service;

import in.techmahindra.anydomain.sts.service.contract.IUserResource;
import in.techmahindra.anydomain.sts.service.dto.UserDto;

@Service
public class CUserResourceImpl implements IUserResource 
{

	@Override
	public void signUp(UserDto userDto) 
	{
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

	}

	@Override
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

}
