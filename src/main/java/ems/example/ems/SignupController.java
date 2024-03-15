package ems.example.ems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
@RestController

@CrossOrigin(origins = "http://localhost:3000")
public class SignupController {

    @Autowired
    private SignupRepository signupRepository;

    @PostMapping("/signup")
    public String signup(@RequestBody Signup signup) {
        signupRepository.save(signup);
        return "Signup successful!";
    }
}
