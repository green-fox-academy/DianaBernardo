package com.example.rest.rest.Controllers;

import com.example.rest.rest.Repositories.LogRepository;
import com.example.rest.rest.Services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

  private LogService logService;

  @Autowired
  public LogController(LogService logService) {
    this.logService = logService;
  }

  @GetMapping("/log")
  public Object showlogs() {
    return logService;
  }
}

