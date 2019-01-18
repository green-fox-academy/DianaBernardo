package com.pallidaexam.pallida.Controllers;

import com.pallidaexam.pallida.Models.JsonResponse;
import com.pallidaexam.pallida.Repositories.LicenceRepository;
import com.pallidaexam.pallida.Service.LicencePlateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LicenceRestController {

  private LicenceRepository repository;
  private LicencePlateService service;

  public LicenceRestController(LicenceRepository repository, LicencePlateService service) {
    this.repository = repository;
    this.service = service;
  }

  @PostMapping("/api/search/{brand}")
  public ResponseEntity getMessage(@PathVariable String brand) {
    if(repository.findAllByBrand(brand).size() == 0) {
      return new ResponseEntity(new JsonResponse("Invalid brand"), HttpStatus.BAD_REQUEST);
    } else {
      return new ResponseEntity(new JsonResponse("ok", service.brand(brand)), HttpStatus.OK);
    }
  }
}
