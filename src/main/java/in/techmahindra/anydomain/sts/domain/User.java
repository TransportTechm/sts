/**
 * 
 */
package in.techmahindra.anydomain.sts.domain;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;

/**
 * @author SV00542797
 *
 */
@Entity
 class User 
{
	
	
	private long id;
	private String userId;
	private String password;
	private List<Role> roles;
	@Embedded
	private AuditTrail auditTrail;

}
