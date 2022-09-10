package com.mateuszjanczak.oktetodemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.http.HttpStatus.OK;

@RestController
public class DemoController {

    Logger logger = LogManager.getLogger(DemoController.class);

    @GetMapping("/test")
    public ResponseEntity<String> demo(HttpServletRequest request) {
        logger.info("Request: " + request.getRemoteAddr());
        return new ResponseEntity<>("Hello okteto", OK);
    }
}
