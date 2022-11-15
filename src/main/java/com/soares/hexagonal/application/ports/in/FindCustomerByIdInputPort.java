package com.soares.hexagonal.application.ports.in;

import com.soares.hexagonal.application.core.domain.Customer;
import org.springframework.stereotype.Component;

@Component
public interface FindCustomerByIdInputPort {

    Customer find(String id);

}
