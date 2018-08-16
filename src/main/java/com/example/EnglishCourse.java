package com.example;

import org.springframework.stereotype.Service;

@Service("EnglishCourse")
public class EnglishCourse implements Course {

  @Override
  public String  startCourse() {
    return "English course started";
  }
}
