package com.soares.hexagonal.adapters.out.client.mapper;

import com.soares.hexagonal.adapters.out.client.response.AddressResponse;
import com.soares.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
