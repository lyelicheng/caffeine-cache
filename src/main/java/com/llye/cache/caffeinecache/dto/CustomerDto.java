package com.llye.cache.caffeinecache.dto;

import com.llye.cache.caffeinecache.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
    private long id;
    private String firstName;
    private String lastName;
    private ZonedDateTime updatedAt;

    public static CustomerDto toDto(Customer customer) {
        return CustomerDto.builder()
                          .id(customer.getId())
                          .firstName(customer.getFirstName())
                          .lastName(customer.getLastName())
                          .updatedAt(customer.getUpdatedAt())
                          .build();
    }
}
