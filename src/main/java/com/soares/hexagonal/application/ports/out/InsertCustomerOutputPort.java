package com.soares.hexagonal.application.ports.out;

import com.soares.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);

}
