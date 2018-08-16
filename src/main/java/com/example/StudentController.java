package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

  @Autowired private HindiStudentService studentService;

  @Autowired
  @Qualifier("EnglishCourse")
  private Course englishCourse;

  @GetMapping("/student/startHindiCourse")
  public String startHindiCourse() {
    return studentService.startHindiCourse();
  }

  @PostMapping("/students/fuckWithHindiCourse")
  public ResponseEntity<Void> fuckWithHindiCourse() {
    studentService.setHindiCourse(englishCourse);
    return ResponseEntity.ok().build();
  }
}
