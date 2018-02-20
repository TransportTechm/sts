/**
 * 
 */
package in.techmahindra.anydomain.sts.domain;

import java.util.Calendar;
import java.util.List;

/**
 * @author SV00542797
 *
 */
public class User 
{
	
	
	private long id;
	private String userId;
	private String password;
	private List<Role> roles;
	private AuditTrail auditTrailField;

}
