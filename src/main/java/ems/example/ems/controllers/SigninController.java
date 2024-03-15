package ems.example.ems.controllers;

import ems.example.ems.repositories.SignupRepository;
import ems.example.ems.models.Signup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class SigninController {

    @Autowired
    private SignupRepository signupRepository;

    @PostMapping("/signin")
    public ResponseEntity<String> signin(@RequestBody Signup user) {
        // Retrieve the user from the database based on the provided email
        Signup existingUser = signupRepository.findByEmail(user.getEmail());

        if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
            // User exists and passwords match, return success message or some token for authentication
            return ResponseEntity.ok("Signin successful");
        } else {
            // User does not exist or passwords don't match, return appropriate response
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
        }
    }
}
