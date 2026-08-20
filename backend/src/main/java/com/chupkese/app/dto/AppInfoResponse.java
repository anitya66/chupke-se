package com.chupkese.app.dto;

public record AppInfoResponse(
        String name,
        String version,
        String status
) {
}