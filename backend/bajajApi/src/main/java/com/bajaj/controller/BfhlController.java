package com.bajaj.controller;

import com.bajaj.model.RequestData;
import com.bajaj.model.ResponseData;
import com.bajaj.service.BfhlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bfhl")
@CrossOrigin(origins = "http://localhost:3000")  // Allow React frontend
public class BfhlController {

    @Autowired
    private BfhlService bfhlService;

    @PostMapping
    public ResponseEntity<?> processData(@RequestBody RequestData requestData) {
        // Process the data received from the frontend
        ResponseData response = bfhlService.processRequest(requestData);
        // Send the response back to the frontend
        return ResponseEntity.ok(response);
    }
}
