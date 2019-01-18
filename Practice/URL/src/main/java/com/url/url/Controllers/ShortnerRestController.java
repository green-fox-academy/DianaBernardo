package com.url.url.Controllers;

import com.url.url.Models.SecretCode;
import com.url.url.Models.Shortner;
import com.url.url.Repositories.ShortnerRepository;
import com.url.url.Services.ShortnerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ShortnerRestController {

  private ShortnerRepository shortnerRepository;
  private ShortnerService shortnerService;

  public ShortnerRestController(ShortnerRepository shortnerRepository, ShortnerService shortnerService) {
    this.shortnerRepository = shortnerRepository;
    this.shortnerService = shortnerService;
  }

  @GetMapping("/api/links")
  @ResponseBody
  public List<Shortner> links() {
    return (List<Shortner>) shortnerRepository.findAll();
  }

  @DeleteMapping("/api/links/{id}")
  public ResponseEntity delete(@PathVariable Long id, @RequestBody SecretCode secretCode) {
    Optional<Shortner> shortnerToFind = shortnerRepository.findById(id);
    if (!shortnerToFind.isPresent()) {
      return ResponseEntity.notFound().build();
    } else if (!shortnerToFind.get().getSecretCode().equals(secretCode.getSecretCode())) {
      return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    } else {
      shortnerRepository.delete(shortnerToFind.get());
      return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
  }

}
