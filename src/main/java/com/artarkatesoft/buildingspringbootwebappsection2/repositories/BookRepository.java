package com.artarkatesoft.buildingspringbootwebappsection2.repositories;

import com.artarkatesoft.buildingspringbootwebappsection2.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book,Long> {
}
