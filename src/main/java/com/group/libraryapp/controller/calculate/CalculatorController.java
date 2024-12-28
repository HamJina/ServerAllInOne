package com.group.libraryapp.controller.calculate;

//두개의 숫자를 요청으로 받아 덧셈결과를 응답으로 반환하는 API

import com.group.libraryapp.dto.calculator.request.CalculatorAddRequest;
import com.group.libraryapp.dto.calculator.request.CalculatorMultiplyRequest;
import com.group.libraryapp.dto.homework.CalcResponse;
import org.springframework.web.bind.annotation.*;

@RestController //api의 진입지점이다.
public class CalculatorController {

    @GetMapping("/add")
    public int addTwoNumbers(CalculatorAddRequest request) {
        return request.getNumber1() + request.getNumber2();
    }

    @PostMapping("/multiply")
    public int multiplyTwoNumbers(@RequestBody CalculatorMultiplyRequest request) {
        return request.getNumber1() * request.getNumber2();
    }

}
