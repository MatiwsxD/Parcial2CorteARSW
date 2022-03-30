package edu.eci.arsw.clickrace.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

@MessageMapping("/events")
@SendTo()
public class EventsController {
}
