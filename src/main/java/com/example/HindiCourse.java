package com.example;

import org.springframework.stereotype.Service;

@Service("HindiCourse")
public class HindiCourse implements Course {

  @Override
  public String startCourse() {
    return "Hindi Course started";
  }

}
