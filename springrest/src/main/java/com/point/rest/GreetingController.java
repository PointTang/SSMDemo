package com.point.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Point on 2017/6/13.
 */
@RestController
public class GreetingController {
    private static final String TEMPLATE = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
    }

    @RequestMapping(value = "/greeting2")
    public String greeting2(@RequestParam(value = "name", defaultValue = "2nd method") String name){
        return String.format(TEMPLATE, name);
    }

    @RequestMapping(value = "/greeting3")
    public List<Greeting> greeting3(@RequestParam(value = "name", defaultValue = "greeting3") String name){
        List<Greeting> greetings = new ArrayList<>();
        greetings.add(new Greeting(counter.incrementAndGet(),String.format(TEMPLATE, name)));
        greetings.add(new Greeting(counter.incrementAndGet(),String.format(TEMPLATE, name)));
        greetings.add(new Greeting(counter.incrementAndGet(),String.format(TEMPLATE, name)));

        return greetings;
    }

    @RequestMapping(value = "/greeting4/{name}")
    public String greeting4(@PathVariable("name") String name){
        return String.format(TEMPLATE, name);
    }
}
