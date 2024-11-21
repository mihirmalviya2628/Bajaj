package com.bajaj.service;

import com.bajaj.model.RequestData;
import com.bajaj.model.ResponseData;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class BfhlService {

    // The processRequest method is the core of your service logic
    public ResponseData processRequest(RequestData requestData) {
        List<String> data = requestData.getData(); // Extract data from the request
        List<String> numbers = data.stream().filter(item -> item.matches("\\d+")).collect(Collectors.toList()); // Extract numbers
        List<String> alphabets = data.stream().filter(item -> item.matches("[a-zA-Z]")).collect(Collectors.toList()); // Extract alphabets
        List<String> lowercaseAlphabets = alphabets.stream().filter(item -> item.matches("[a-z]")).collect(Collectors.toList()); // Extract lowercase alphabets

        // Compute the highest lowercase alphabet
        String highestLowercaseAlphabet = lowercaseAlphabets.stream()
                .max(Comparator.naturalOrder())
                .orElse(null);

        // Wrap highest lowercase alphabet in a list or return an empty list
        List<String> highestLowercaseList = (highestLowercaseAlphabet != null) 
            ? List.of(highestLowercaseAlphabet) 
            : Collections.emptyList();

        // Check for prime numbers
        boolean isPrimeFound = numbers.stream().mapToInt(Integer::parseInt).anyMatch(this::isPrime);

        // Return the response object with the required data
        return new ResponseData(
                true,                              // is_success
                "mihir_malviya_21052000",          // user_id
                "mihir@example.com",               // email
                "BTECH123",                        // roll_number
                numbers,                           // numbers
                alphabets,                         // alphabets
                highestLowercaseList,              // highest_lowercase_alphabet
                isPrimeFound,                      // is_prime_found
                false,                             // file_valid
                null,                              // file_mime_type
                null                               // file_size_kb
        );
    }

    // Helper method to check if a number is prime
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
