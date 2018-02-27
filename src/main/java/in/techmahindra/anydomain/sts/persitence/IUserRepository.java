/**
 * 
 */
package in.techmahindra.anydomain.sts.persitence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import in.techmahindra.anydomain.sts.domain.User;

/**
 * @author SV00542797
 *
 */
@Component
public interface IUserRepository extends JpaRepository<User, Long>
{
	
	
	User findByuserId(String uid);

}
