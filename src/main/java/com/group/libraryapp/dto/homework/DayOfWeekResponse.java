package com.group.libraryapp.dto.homework;

public class DayOfWeekResponse {

    private String dayoftheweek;

    // 생성자
    public DayOfWeekResponse(String dayoftheweek) {
        this.dayoftheweek = dayoftheweek;
    }

    // Getter (JSON 변환 시 필요)
    public String getDayoftheweek() {
        return dayoftheweek;
    }
}
