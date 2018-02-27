package in.techmahindra.anydomain.sts.persitence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import in.techmahindra.anydomain.sts.domain.Role;
import in.techmahindra.anydomain.sts.domain.User;



@Component
public interface IRoleRepository extends JpaRepository<Role, Long>
{
	
	
	Role findByid(long rid);

}