package com.url.url.Services;

import com.url.url.Models.AliasNotFound;
import com.url.url.Models.Shortner;
import com.url.url.Repositories.ShortnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Service
public class ShortnerService {

  private ShortnerRepository shortnerRepository;

  @Autowired
  public ShortnerService(ShortnerRepository shortnerRepository) {
    this.shortnerRepository = shortnerRepository;
  }

  public void add(RedirectAttributes attributes, Shortner shortner) {
    if (shortnerRepository.findByLink(shortner.getLink()).size() != 0) {
      attributes.addFlashAttribute("error", "Your alias is already in use");
    } else {
      shortner.setSecretCode((int) (Math.random() * 9999 - 1000) - 1000);
      shortnerRepository.save(shortner);
      attributes.addFlashAttribute("success", "Your URL is aliased to " + shortner.getAlias() + " and your secret code is " + shortner.getSecretCode());
    }
  }

  public boolean success() {
    return true;
  }



}
