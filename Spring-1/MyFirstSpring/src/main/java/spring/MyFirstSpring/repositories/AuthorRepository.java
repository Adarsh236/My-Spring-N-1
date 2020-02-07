package spring.MyFirstSpring.repositories;


import org.springframework.data.repository.CrudRepository;
import spring.MyFirstSpring.Model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
