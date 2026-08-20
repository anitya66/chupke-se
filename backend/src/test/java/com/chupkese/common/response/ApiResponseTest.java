package com.chupkese.common.response;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApiResponseTest {

    @Test
    void shouldCreateSuccessfulResponse() {
        ApiResponse<String> response =
                ApiResponse.success("Hello CHUPKE SE");

        assertTrue(response.success());
        assertEquals("Hello CHUPKE SE", response.data());
        assertEquals("Success", response.message());
    }

    @Test
    void shouldCreateErrorResponse() {
        ApiResponse<String> response =
                ApiResponse.error("Something went wrong");

        assertFalse(response.success());
        assertNull(response.data());
        assertEquals("Something went wrong", response.message());
    }
}