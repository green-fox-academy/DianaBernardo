package com.pallidaexam.pallida.Service;

import com.pallidaexam.pallida.Models.LicencePlate;
import com.pallidaexam.pallida.Repositories.LicenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicencePlateService {

  private LicenceRepository repository;

  @Autowired
  public LicencePlateService(LicenceRepository repository) {
    this.repository = repository;
  }

  public List<LicencePlate> getAll() {
    return (List<LicencePlate>) repository.findAll();
  }

  public List<LicencePlate> search(String query) {
    return repository.findAllByPlateContaining(query);
  }

  public List<LicencePlate> police() {
    return repository.findAllByPlateStartingWith("RB");
  }

  public List<LicencePlate> diplomat() {
    return repository.findAllByPlateStartingWith("DT");
  }

  public List<LicencePlate> brand(String brand) {
    return repository.findAllByBrand(brand);
  }

  public boolean valid (String query) {
    return query.matches("[-A-Za-z0-9]+");
  }
}
