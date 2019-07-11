package org.aber.springboot.jpa.dao.product;

import org.aber.springboot.jpa.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
