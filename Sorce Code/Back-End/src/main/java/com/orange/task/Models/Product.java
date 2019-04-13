package com.orange.task.Models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @NotBlank(message="You Have Enter a name")
    @Column(nullable = false)
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name = "cat_id", referencedColumnName = "id",nullable=false)
    private Category category;
}

