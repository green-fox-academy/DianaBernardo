package com.pallidaexam.pallida.Repositories;

import com.pallidaexam.pallida.Models.LicencePlate;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LicenceRepository extends CrudRepository<LicencePlate, Long> {

  List<LicencePlate> findAllByPlateContaining(String query);
  List<LicencePlate> findAllByPlateStartingWith(String query);
  List<LicencePlate> findAllByBrand(String brand);
}
