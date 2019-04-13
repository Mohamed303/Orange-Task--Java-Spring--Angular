package com.orange.task.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;
// using project lombok to avoid write getters and setters
@Data
@Entity  //default table name = class name start with an lowercase
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @NotBlank(message="You Have Enter a name")
    @Column(unique=true)
    private String name;
    private String description;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "category")
    private Set<Product> products = new HashSet<>();
}
