package com.chupkese.app.service;

import com.chupkese.app.dto.AppInfoResponse;
import org.springframework.stereotype.Service;

@Service
public class AppInfoService {

    public AppInfoResponse getAppInfo() {
        return new AppInfoResponse(
                "CHUPKE SE",
                "1.0.0",
                "RUNNING"
        );
    }
}