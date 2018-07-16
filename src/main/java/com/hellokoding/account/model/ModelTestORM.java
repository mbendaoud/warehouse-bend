package com.hellokoding.account.model;


import javax.persistence.*;


@Entity
@Table(name = "modeltestorm")
public class ModelTestORM {
    private Long id;
    private String toto;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return toto;
    }

    public void setName(String toto) {
        this.toto = toto;
    }


}
