package com.group.libraryapp.dto.user.request;

public class FruitUpdateRequest {
    private Long id;

    // 기본 생성자
    public FruitUpdateRequest() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
