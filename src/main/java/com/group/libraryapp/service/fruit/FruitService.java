package com.group.libraryapp.service.fruit;

import com.group.libraryapp.domain.fruit.Fruit;
import com.group.libraryapp.domain.fruit.FruitRepository;
import com.group.libraryapp.dto.homework.FruitRequest;
import com.group.libraryapp.dto.homework.StatFruitResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;


@Service
public class FruitService {

    private final FruitRepository fruitRepository;


    public FruitService(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @Transactional
    public void saveFruit(FruitRequest request) {
        // getWarehousingDate()가 이미 LocalDate라면 바로 사용
        LocalDate warehousingDate = request.getWarehousingDate();

        // Fruit 객체 생성 및 저장
        fruitRepository.save(new Fruit(request.getName(), warehousingDate, request.getPrice()));
    }

    @Transactional
    public void saledFruit(Long id) {
        Fruit findFruit = fruitRepository.findById(id).orElseThrow(IllegalAccessError::new);
        findFruit.setSaled(true);

        fruitRepository.save(findFruit);
    }

    @Transactional(readOnly = true)
    public StatFruitResponse statFruit(String name) {
        List<Fruit> isSaledTrue = fruitRepository.findAllByNameAndIsSaledTrue(name);
        List<Fruit> isSaledFalse = fruitRepository.findAllByNameAndIsSaledFalse(name);

        // isSaledTrue의 price 총합 계산
        long totalPriceSaledTrue = isSaledTrue.stream()
                .mapToLong(Fruit::getPrice)
                .sum();

        // isSaledFalse의 price 총합 계산
        long totalPriceSaledFalse = isSaledFalse.stream()
                .mapToLong(Fruit::getPrice)
                .sum();

        return new StatFruitResponse(totalPriceSaledTrue, totalPriceSaledFalse);
    }
}
