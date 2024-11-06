package com.samarth.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samarth.spring.springorm.product.dao.ProductDao;
import com.samarth.spring.springorm.product.entity.Product;

public class Test {

  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext(
        "com/samarth/spring/springorm/product/test/config.xml");
    ProductDao dao = (ProductDao) context.getBean("productDao");

    Product product = new Product();
    product.setId(1);
    product.setName("Phone");
    product.setDesc("Latest in market");
    product.setPrice(40000);

//    dao.create(product);

//    dao.update(product);

//    dao.delete(product);

//    Product result = dao.find(1);
//    System.out.println(result);

    List<Product> results = dao.findAll();
    System.out.println(results);
  }
}
