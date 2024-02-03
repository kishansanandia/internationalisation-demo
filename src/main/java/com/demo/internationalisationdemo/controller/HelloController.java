package com.demo.internationalisationdemo.controller;

import com.demo.internationalisationdemo.model.response.APIResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Kishan
 */
@RestController
@RequestMapping("/api/hello")
public class HelloController {
    @Autowired
    private MessageSource messageSource;

    @GetMapping()
    private ResponseEntity<APIResponse> greeting(HttpServletRequest request) {
        APIResponse response = APIResponse.builder().responseCode(200).message(messageSource.getMessage("greeting", null, request.getLocale())).traceId(UUID.randomUUID()).build();
        return ResponseEntity.ok(response);
    }
}
