package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
        @OneToMany(targetEntity = Cataloge.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "sp_fk", referencedColumnName = "id")

        private List<Cataloge> cataloge;

}
