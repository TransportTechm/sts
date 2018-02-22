/**
 * 
 */
package in.techmahindra.anydomain.sts.domain;

import java.util.Calendar;
import javax.persistence.*;

/**
 * @author SV00542797
 *
 */
@Embeddable
public class AuditTrail 
{
	
	/**
	 * @param createdDateTime
	 * @param updatedDateTime
	 * @param createdBy
	 * @param updatedBy
	 */
	public AuditTrail(Calendar createdDateTime, Calendar updatedDateTime, String createdBy, String updatedBy) {
		super();
		this.createdDateTime = createdDateTime;
		this.updatedDateTime = updatedDateTime;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}
	/**
	 * 
	 */
	public AuditTrail() 
	{
		super();
		this.createdDateTime = null;
		this.updatedDateTime = null;
		this.createdBy = null;
		this.updatedBy = null;
	}
	@Column(name = "cr_dt")
	@Temporal(TemporalType.TIMESTAMP)
	private final Calendar createdDateTime;
	@Column(name = "up_dt")
	@Temporal(TemporalType.TIMESTAMP)
	private final Calendar updatedDateTime;
	/**
	 * @return the createdDateTime
	 */
	public Calendar getCreatedDateTime() {
		return createdDateTime;
	}
	/**
	 * @return the updatedDateTime
	 */
	public Calendar getUpdatedDateTime() {
		return updatedDateTime;
	}
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}
	@Column(name = "cr_by")
	private final String createdBy;
	@Column(name = "up_by")
	private final String updatedBy;

}
