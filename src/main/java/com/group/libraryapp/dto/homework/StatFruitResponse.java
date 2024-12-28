package com.group.libraryapp.dto.homework;

public class StatFruitResponse {

    private Long salesAmount;
    private Long notSalesAmount;

    public StatFruitResponse() {}

    public StatFruitResponse(Long salesAmount, Long notSalesAmount) {
        this.salesAmount = salesAmount;
        this.notSalesAmount = notSalesAmount;
    }

    public Long getSalesAmount() {
        return salesAmount;
    }


    public Long getNotSalesAmount() {
        return notSalesAmount;
    }

}
