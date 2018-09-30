package com.preciousccheck.api.resources;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Root resource (exposed at "myresource" path)
 */
@RestController
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GetMapping("/myresource")
    public String getIt() {
        return "Got it!";
    }
}