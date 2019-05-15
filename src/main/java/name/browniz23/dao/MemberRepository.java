package name.browniz23.dao;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.data.rest.core.annotation.*;

import name.browniz23.service.*;

@RepositoryRestResource
public interface MemberRepository extends JpaRepository<Member, Long> {
	
	Member findByName(@Param("name") String name);
}