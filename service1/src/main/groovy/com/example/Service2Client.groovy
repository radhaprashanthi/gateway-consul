package com.example

import com.example.domain.Book
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.micronaut.retry.annotation.CircuitBreaker
import io.micronaut.retry.annotation.Retryable
import io.reactivex.Flowable

@Client(id = "service2")
@CircuitBreaker(delay = "2s", attempts = "1", multiplier = "2", reset = "2s")
//@Retryable(attempts = "10", delay = "2s")
interface Service2Client {
    @Get("/books")
    Flowable<ArrayList<Book>> findBooks()
}