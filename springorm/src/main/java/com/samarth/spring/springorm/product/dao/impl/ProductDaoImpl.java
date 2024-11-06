package com.samarth.spring.springorm.product.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.samarth.spring.springorm.product.dao.ProductDao;
import com.samarth.spring.springorm.product.entity.Product;

@Component("productDao")
public class ProductDaoImpl implements ProductDao {

  @Autowired
  private HibernateTemplate hibernateTemplate;

  @Override
  @Transactional // marks the method as transactional
  public int create(Product product) {
    Integer result = (Integer) hibernateTemplate.save(product);
    return result;
  }

  @Override
  @Transactional
  public void update(Product product) {

    // id should be present in the product
    hibernateTemplate.update(product);
  }

  @Override
  @Transactional
  public void delete(Product product) {

    // id should be present in the product
    hibernateTemplate.delete(product);
  }

  @Override
  public Product find(int id) {
    Product product = hibernateTemplate.get(Product.class, id);
    return product;
  }

  @Override
  public List<Product> findAll() {
    List<Product> products = hibernateTemplate.loadAll(Product.class);
    return products;
  }

}
