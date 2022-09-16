package com.api.apirepo.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Repo")
public class RepoController {

  @ApiOperation(value="Retorna informações de um repositório público do GitHub")
  @GetMapping("/repos")
  public String getRepo(String[] args) throws IOException {
    URL url = new URL("https://api.codetabs.com/v1/loc/?github=brcaua/cars-rental-app");
    HttpURLConnection httpcon = (HttpURLConnection) url.openConnection();
    httpcon.addRequestProperty("User-Agent", "Mozilla/5.0");
    BufferedReader in = new BufferedReader(new InputStreamReader(httpcon.getInputStream()));

    StringBuilder data = new StringBuilder();
    String line;
    while ((line = in.readLine()) != null) {
      data.append(line);
    }

    return data.toString();
  }
}
