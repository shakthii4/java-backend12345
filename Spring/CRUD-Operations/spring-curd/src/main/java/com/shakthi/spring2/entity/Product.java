package com.shakthi.spring2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product
{
    @Id

    private int id;
    private String name;
    private int quantity;
    private double price;

}
