package com.dmart.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer stockId;
   private String name;
   private double price;
   private Integer quantity;
   private String location;
   
}
