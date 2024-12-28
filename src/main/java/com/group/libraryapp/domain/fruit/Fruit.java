package com.group.libraryapp.domain.fruit;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate warehousingDate;
    private long price;
    //판매여부
    private boolean isSaled = false;

    public Fruit() {}

    public Fruit(String name, LocalDate warehousingDate, Long price) {
        this.name = name;
        this.warehousingDate = warehousingDate;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public LocalDate getWarehousingDate() {
        return warehousingDate;
    }

    public Long getPrice() {
        return price;
    }

    public boolean isSaled() {
        return isSaled;
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWarehousingDate(LocalDate warehousingDate) {
        this.warehousingDate = warehousingDate;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setSaled(boolean saled) {
        isSaled = saled;
    }
}
