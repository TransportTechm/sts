/**
 * 
 */
package in.techmahindra.anydomain.sts.persitence;

import org.springframework.data.jpa.repository.JpaRepository;
import in.techmahindra.anydomain.sts.domain.User;

/**
 * @author SV00542797
 *
 */
public interface IUserRepository extends JpaRepository<User, Long>
{

}
