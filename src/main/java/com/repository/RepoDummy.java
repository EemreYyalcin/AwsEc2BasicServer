package com.repository;

import com.data.Dummy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoDummy extends CrudRepository<Dummy, Long> {
}
