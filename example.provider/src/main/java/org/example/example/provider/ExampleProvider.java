package org.example.example.provider;

import org.osgi.service.component.annotations.Component;
import org.example.example.api.ExampleService;

@Component
public class ExampleProvider implements ExampleService {
    public String hello() {
        return "Hello";
    }
}