package com.artarkatesoft.buildingspringbootwebappsection2.repositories;

import com.artarkatesoft.buildingspringbootwebappsection2.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
