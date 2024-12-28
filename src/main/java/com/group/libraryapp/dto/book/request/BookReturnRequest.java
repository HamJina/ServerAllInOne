package com.group.libraryapp.dto.book.request;

public class BookReturnRequest {

    private String userName;
    private String bookName;

    public BookReturnRequest() {}

    public BookReturnRequest(String userName, String bookname) {
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
