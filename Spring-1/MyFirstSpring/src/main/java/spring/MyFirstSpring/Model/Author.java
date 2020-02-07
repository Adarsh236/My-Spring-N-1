package spring.MyFirstSpring.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String firstName;
    private String lastName;
    /*private Set<Book> books;*/


    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();


    public Author() {// required
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        /*this.books = books;*/
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }


    // to string method
    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                //", books=" + books +
                '}';
    }

    // setting equal and hash code

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return /*Objects.equals(id, author.id);*/ id != null ? id.equals(author.id) : author.id == null;
    }

    @Override
    public int hashCode() {
        return /*Objects.hash(id);*/ id != null ? id.hashCode() : 0;
    }
}
