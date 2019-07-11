package org.aber.springboot.jpa.model.product;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "products")
@Data
public class Product {

    @Id
    private int id;

    private String name;

    private double price;
}
