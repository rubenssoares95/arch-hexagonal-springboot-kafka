package com.soares.hexagonal.adapters.out.repository.mapper;

import com.soares.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.soares.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity (Customer customer);
}
