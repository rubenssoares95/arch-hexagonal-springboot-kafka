package com.soares.hexagonal.application.ports.out;

import com.soares.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);

}
