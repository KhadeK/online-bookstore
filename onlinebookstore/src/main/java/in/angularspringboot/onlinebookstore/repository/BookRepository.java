package in.angularspringboot.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.angularspringboot.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
