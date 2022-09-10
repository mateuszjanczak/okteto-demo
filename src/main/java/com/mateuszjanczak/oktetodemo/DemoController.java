package com.mateuszjanczak.oktetodemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
public class DemoController {

    @GetMapping("/test")
    public ResponseEntity<String> demo() {
        return new ResponseEntity<>("Hello okteto", OK);
    }
}
