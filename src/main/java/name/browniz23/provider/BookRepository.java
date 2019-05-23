package name.browniz23.provider;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
	
	List<Book> findByNameLike(String name);
	

}
