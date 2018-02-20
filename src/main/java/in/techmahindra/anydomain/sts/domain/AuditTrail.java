/**
 * 
 */
package in.techmahindra.anydomain.sts.domain;

import java.util.Calendar;

/**
 * @author SV00542797
 *
 */
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
	private Calendar createdDateTime;
	private Calendar updatedDateTime;
	private String createdBy;
	private String updatedBy;

}
