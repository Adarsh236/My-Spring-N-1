package spring.MyFirstSpring.bootStrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.MyFirstSpring.Model.Author;
import spring.MyFirstSpring.Model.Book;
//import spring.MyFirstSpring.Model.Publisher;
import spring.MyFirstSpring.repositories.AuthorRepository;
import spring.MyFirstSpring.repositories.BookRepository;
//import spring.MyFirstSpring.repositories.PublisherRepository;


@Component// Dependerncy injection
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    //private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository/*, PublisherRepository publisherRepository*/) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
       // this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in Bootstrap");

    /*    Publisher publisher = new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setCity("St Petersburg");
        publisher.setState("FL");
*/
        /*publisherRepository.save(publisher);

        System.out.println("Publisher Count:" + publisherRepository.count());*/

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book ("Domain Driven Design", "123123");

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        /*ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);*/

        authorRepository.save(eric);
        bookRepository.save(ddd);
       // publisherRepository.save(publisher);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "393945459");

        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
//---------- 2

       /* noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);*/

        authorRepository.save(rod);
        bookRepository.save(noEJB);
       // publisherRepository.save(publisher);


        System.out.println("Number of Books: " + bookRepository.count());
       // System.out.println("Publisher Number of Books: " + publisher.getBooks().size());


    }
}
