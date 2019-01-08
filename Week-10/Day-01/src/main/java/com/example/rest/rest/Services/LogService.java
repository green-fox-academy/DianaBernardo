package com.example.rest.rest.Services;

import com.example.rest.rest.Models.Log;
import com.example.rest.rest.Repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {

  private LogRepository logRepository;
  private List<Log> entries;
  private Long counter;

  @Autowired
  public LogService(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  public void save(Log log) {
    logRepository.save(log);
  }

 public List getEntries() {
    return (List) logRepository.findAll();
 }

 public void setEntries(List<Log> entries) {
    this.entries = entries;
 }

  public Long getCounter() {
    return logRepository.count();
  }

  public void setCounter(Long counter) {
    this.counter = counter;
  }
}
