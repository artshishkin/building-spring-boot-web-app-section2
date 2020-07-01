package com.artarkatesoft.buildingspringbootwebappsection2.repositories;

import com.artarkatesoft.buildingspringbootwebappsection2.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
