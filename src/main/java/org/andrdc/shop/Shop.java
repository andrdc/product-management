package org.andrdc.shop;

import org.andrdc.data.Product;

import java.math.BigDecimal;

public class Shop {
  public static void main(String[] args) {
    Product product = new Product();
    product.setId(101);
    product.setName("Tea");
    product.setPrice(BigDecimal.valueOf(1.99));

    System.out.println(product.getId() + " " + product.getName() + " " + product.getPrice() + " " + product.getDiscount());
  }
}