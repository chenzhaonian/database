package com.itheima.ssm.service;

import cao.itheima.ssm.domain.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAll() throws Exception;

}
