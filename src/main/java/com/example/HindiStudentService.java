package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class HindiStudentService {

  @Autowired
  @Qualifier("HindiCourse")
  private Course hindiCourse;

  public String startHindiCourse() {
    return hindiCourse.startCourse();
  }

  public void setHindiCourse(Course hindiCourse) {
    this.hindiCourse = hindiCourse;
  }
}

