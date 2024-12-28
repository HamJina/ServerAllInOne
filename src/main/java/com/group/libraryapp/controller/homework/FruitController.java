package com.group.libraryapp.controller.homework;

import com.group.libraryapp.dto.homework.FruitRequest;
import com.group.libraryapp.dto.homework.StatFruitResponse;
import com.group.libraryapp.dto.user.request.FruitUpdateRequest;
import com.group.libraryapp.service.fruit.FruitService;
import org.springframework.web.bind.annotation.*;

@RestController
public class FruitController {

    private final FruitService fruitService;


    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @PostMapping("/api/v1/fruit")
    public void saveFruit(@RequestBody FruitRequest request) {
        fruitService.saveFruit(request);
    }

    @PutMapping("/api/v1/fruit")
    public void saledFruit(@RequestBody FruitUpdateRequest request) {
        fruitService.saledFruit(request.getId());
    }

    @GetMapping("/api/v1/fruit/stat")
    public StatFruitResponse statFruit(@RequestParam String name) {
       return fruitService.statFruit(name);
    }

}
