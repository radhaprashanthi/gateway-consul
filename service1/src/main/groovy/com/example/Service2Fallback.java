package com.example;

import com.example.domain.Book;
import io.micronaut.retry.annotation.Fallback;
import io.reactivex.Flowable;

import java.util.ArrayList;

@Fallback
public class Service2Fallback implements Service2Client {
    @Override
    public Flowable<ArrayList<Book>> findBooks() {
        Book book1 = new Book();
        book1.setTitle("Service 2 is down and will be back shortly!!!!");
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        return Flowable.just(books);
    }
}
