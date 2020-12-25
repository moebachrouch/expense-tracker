package com.example.codeengine.express.model;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;

import javax.persistence.*;

@Entity
@Table(name="category")
@NoArgsConstructor
@Data
public class Category {
    public Long getId() {
        return id;
    }

    @Id
    private Long id;

    @NotNull
    // Travel, Grocery...
    private String name;
}
