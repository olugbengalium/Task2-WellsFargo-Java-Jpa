package com.wellsfargo.task2wellsfargo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Security {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private PortFolio portFolio;

    @Column(name= "name", nullable = false)
    private String name;

    @Column(name= "category", nullable = false)
    private String category;

    @Column(name= "purchase_price", nullable = false)
    private String purchasePrice;

    @Column(name= "purchase_date", nullable = false)
    private String purchaseDate;

    @Column(name= "quantity", nullable = false)
    private String quantity;
}
