package com.example.wineshop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
class WineControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void all() {
        webTestClient.get()
                .uri("/wine")
                .exchange()
                .expectStatus().isOk()
                .expectHeader().valueEquals("Content-Type","application/json")
                .expectBody()
                .jsonPath("$.length()").isEqualTo(2);
    }

    @Test
    void one() {
    }
}