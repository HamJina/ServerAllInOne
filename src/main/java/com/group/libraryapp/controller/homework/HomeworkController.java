package com.group.libraryapp.controller.homework;

import com.group.libraryapp.dto.homework.CalcResponse;
import com.group.libraryapp.dto.homework.DayOfWeekResponse;
import com.group.libraryapp.dto.homework.FruitRequest;
import com.group.libraryapp.dto.homework.TotalSumRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

@RestController
public class HomeworkController {

    //과제2-1
    @GetMapping("/api/v1/calc")
    public CalcResponse calc(@RequestParam int num1, @RequestParam int num2) {
        int add = num1 + num2;
        int minus = num1 - num2;
        int multiply = num1 * num2;
        return new CalcResponse(add, minus, multiply);
    }

    //과제2-2
    @GetMapping("/api/v1/day-of-the-week")
    public DayOfWeekResponse getDayOfTheWeek(@RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") String date) {
        // 문자열 날짜를 LocalDate로 변환
        LocalDate localDate = LocalDate.parse(date);
        // 요일 추출
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        // JSON 응답 생성
        return new DayOfWeekResponse(dayOfWeek.toString().substring(0, 3)); // MON, TUE, WED 형식
    }

    //과제2-3
    @PostMapping("/api/v1/totalsum")
    public Integer totalSum(@RequestBody TotalSumRequest request) {
        List<Integer> nums = request.getNumbers();

        // 입력 검증
        if (nums == null || nums.isEmpty()) {
            throw new IllegalArgumentException("The input list 'nums' cannot be null or empty.");
        }

        // 총합 계산 (Stream API 사용)
        return nums.stream().reduce(0, Integer::sum);
    }


}
