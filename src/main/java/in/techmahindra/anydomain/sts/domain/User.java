/**
 * 
 */
package in.techmahindra.anydomain.sts.domain;

import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

/**
 * @author SV00542797
 *
 */
@Entity
 public class User 
{
	
	@Column(name="id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="userid")
	private String userId;
	@Column(name="password")
	private String password;
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "userrole", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
	private List<Role> roles;
	@Embedded
	private AuditTrail auditTrail;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the roles
	 */
	public List<Role> getRoles() {
		return roles;
	}
	/**
	 * @param roles the roles to set
	 */
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	/**
	 * @return the auditTrail
	 */
	public AuditTrail getAuditTrail() {
		return auditTrail;
	}
	/**
	 * @param auditTrail the auditTrail to set
	 */
	public void setAuditTrail(AuditTrail auditTrail) {
		this.auditTrail = auditTrail;
	}

}
