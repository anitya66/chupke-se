package com.chupkese.app.controller;

import com.chupkese.app.dto.AppInfoResponse;
import com.chupkese.app.service.AppInfoService;
import com.chupkese.common.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/app")
public class AppInfoController {

    private final AppInfoService appInfoService;

    public AppInfoController(AppInfoService appInfoService) {
        this.appInfoService = appInfoService;
    }

    @GetMapping("/info")
    public ApiResponse<AppInfoResponse> getAppInfo() {
        return ApiResponse.success(appInfoService.getAppInfo());
    }
}