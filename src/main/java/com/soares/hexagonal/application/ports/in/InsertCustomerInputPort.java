package com.soares.hexagonal.application.ports.in;

import com.soares.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);

}
