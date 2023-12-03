package com.llye.cache.caffeinecache.repository;

import com.llye.cache.caffeinecache.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
