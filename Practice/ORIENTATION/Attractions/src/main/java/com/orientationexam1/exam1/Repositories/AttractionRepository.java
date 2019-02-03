package com.orientationexam1.exam1.Repositories;

import com.orientationexam1.exam1.Model.Attraction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AttractionRepository extends CrudRepository <Attraction, Long> {


  List<Attraction> findByCategoryOrderByPriceAsc(String category);



}
