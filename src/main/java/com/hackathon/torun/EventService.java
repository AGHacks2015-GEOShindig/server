package com.hackathon.torun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukasz on 24.10.15.
 */
@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public void addEvent(Event event){

        eventRepository.save(event);

    }

    public Iterable<Event> listEvent(){

        return eventRepository.findAll();
    }

}
