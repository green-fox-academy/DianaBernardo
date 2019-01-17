package com.connectionwithmysql.connection.Controller;

import com.connectionwithmysql.connection.Models.JwtUser;
import com.connectionwithmysql.connection.Security.JwtGenerator;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/token")
public class TokenController {


  private JwtGenerator jwtGenerator;

  public TokenController(JwtGenerator jwtGenerator) {
    this.jwtGenerator = jwtGenerator;
  }

  @PostMapping
  public String generate(@RequestBody final JwtUser jwtUser) {

    return jwtGenerator.generate(jwtUser);
  }
}