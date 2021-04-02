package com.example.gateway

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class FallbackController {
    @GetMapping("/api/fallback")
    Mono<String> getFallbackBillingMsg() {
        return Mono.just("Service 1 is down and will be back shortly!!!!");
    }
}
