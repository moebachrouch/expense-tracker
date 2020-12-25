package com.example.codeengine.express.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "expense")
public class Expense {
    @Id
    private Long id;

    private Instant expensedate; // time object (time stamp)

    private String description; // description of this expense

    @ManyToOne
    private Category category; // sql join, jpa handles it for us

    @ManyToOne(cascade = CascadeType.PERSIST)
    private User user;
}
