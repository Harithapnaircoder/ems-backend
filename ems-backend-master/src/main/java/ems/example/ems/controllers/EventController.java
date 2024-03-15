package ems.example.ems.controllers;

import ems.example.ems.models.Events;
import ems.example.ems.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class EventController {

    @Autowired
    private EventRepository eventRepository;
    @PostMapping("/Event")
    public String Event(@RequestBody Events Event){
        eventRepository.save(Event);
        return "Event sent succesfully";
    }

}
