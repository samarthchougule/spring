package com.samarth.spring.data;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.samarth.spring.data.entities.Product;
import com.samarth.spring.data.repos.ProductRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {

  @Autowired
  ApplicationContext context;

  @Test
  void saveProduct() {
    ProductRepository repository = context.getBean(ProductRepository.class);

    // create and save operation
//    Product product = new Product();
//    product.setId(3l);
//    product.setName("Mac");
//    product.setDescription("Good");
//    product.setPrice(1200d);
//    repository.save(product);

    // find by id operation
//    Optional<Product> result = repository.findById(3l);
//    System.out.println(result.get());

//    System.out.println(repository.findByName("Mac"));
//    System.out.println(repository.findByPrice(2000d));
    
    System.out.println(repository.findByNameAndPrice("Mac", 1200d));
  }

}
