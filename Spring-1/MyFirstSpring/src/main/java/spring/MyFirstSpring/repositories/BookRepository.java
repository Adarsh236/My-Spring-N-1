package spring.MyFirstSpring.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.MyFirstSpring.Model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
