package com.group.libraryapp.domain.fruit;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit, Long> {

    public List<Fruit> findAllByNameAndIsSaledTrue(String name);
    public List<Fruit> findAllByNameAndIsSaledFalse(String name);

}
