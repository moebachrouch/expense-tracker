package com.example.codeengine.express.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="category")
@NoArgsConstructor
@Data
public class Category {
    @Id
    private Long id;

    // Travel, Grocery...
    private String name;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private User user;
}
