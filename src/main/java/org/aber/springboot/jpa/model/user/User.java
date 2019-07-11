package org.aber.springboot.jpa.model.user;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(schema = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    private int age;
}
