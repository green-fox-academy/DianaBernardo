package com.orientationexam1.exam1.Services;

import com.orientationexam1.exam1.Model.Attraction;
import com.orientationexam1.exam1.Repositories.AttractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AttractionService {

  private AttractionRepository repository;
  private List<Attraction> findingCheapest = new ArrayList<>();

  public List<Attraction> getFindingCheapest() {
    return findingCheapest;
  }

  public void setFindingCheapest(List<Attraction> findingCheapest) {
    this.findingCheapest = findingCheapest;
  }

  @Autowired
  public AttractionService(AttractionRepository repository) {
    this.repository = repository;
  }

  public List<Attraction> getAll() {
    return (List<Attraction>) repository.findAll();
  }

  public void addAttraction(Attraction attraction) {
    repository.save(attraction);
  }

  public Object edit(Long id) {
    return repository.findById(id);
  }

  public Object editAttraction(Attraction attraction) {
    repository.findById(attraction.getId());
    return repository.save(attraction);
  }

  public List<Attraction> findCheapest() {
    findingCheapest.add(repository.findByCategoryOrderByPriceAsc("museum").get(0));
    findingCheapest.add(repository.findByCategoryOrderByPriceAsc("restaurant").get(0));
    findingCheapest.add(repository.findByCategoryOrderByPriceAsc("park").get(0));
    return findingCheapest;
  }
}
