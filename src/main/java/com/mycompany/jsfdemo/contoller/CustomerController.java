package com.mycompany.jsfdemo.contoller;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.IOException;
import java.util.logging.Logger;

@Named
@RequestScoped
public class CustomerController {

    private static final Logger LOG = Logger.getLogger(CustomerController.class.getName());

    @Inject
    private Customer customer;

    public String saveCustomer() throws IOException {
        String landingPage = "confirmation";
        return landingPage;
    }
}
