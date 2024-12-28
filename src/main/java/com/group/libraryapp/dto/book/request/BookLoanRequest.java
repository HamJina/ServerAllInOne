package com.group.libraryapp.dto.book.request;

public class BookLoanRequest {

    private String userName;
    private String bookName;

    public BookLoanRequest() {}

    public BookLoanRequest(String userName, String bookname) {
        this.userName = userName;
        this.bookName = bookname;
    }

    public String getUserName() {
        return userName;
    }

    public String getBookName() {
        return bookName;
    }
}
