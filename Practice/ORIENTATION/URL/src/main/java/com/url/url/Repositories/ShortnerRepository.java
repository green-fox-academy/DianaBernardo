package com.url.url.Repositories;

import com.url.url.Models.Shortner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ShortnerRepository extends CrudRepository<Shortner, Long> {
  List<Shortner> findByLink(String query);
}
