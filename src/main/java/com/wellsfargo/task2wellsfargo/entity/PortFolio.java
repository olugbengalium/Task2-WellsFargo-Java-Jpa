package com.wellsfargo.task2wellsfargo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class PortFolio {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name= "client_id")
    private Client clientID;

    @Column(name= "Creation_Date", nullable = false)
    private String creationDate;
}
