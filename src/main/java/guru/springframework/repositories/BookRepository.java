package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import  guru.springframework.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
