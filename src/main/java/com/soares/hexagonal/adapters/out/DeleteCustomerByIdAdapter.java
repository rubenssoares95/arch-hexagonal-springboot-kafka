package com.soares.hexagonal.adapters.out;

import com.soares.hexagonal.adapters.out.repository.CustomerRepository;
import com.soares.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
