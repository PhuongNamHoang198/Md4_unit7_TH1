package com.example.th.service.customer;

import com.example.th.model.Customer;
import com.example.th.model.Province;
import com.example.th.service.IGeneralService;

public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}
