package com.group.libraryapp.dto.homework;

import java.util.List;

public class TotalSumRequest {
    private List<Integer> numbers;

    public TotalSumRequest() {
    }

    public TotalSumRequest(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }
}
