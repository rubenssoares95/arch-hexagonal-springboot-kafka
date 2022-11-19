package com.soares.hexagonal.application.ports.in;

import com.soares.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);
}
