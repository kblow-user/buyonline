package com.dailycodework.buynowdotcom.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;
@Data
@AllArgsConstructor
public class ApiResponse {
    private String message;
    private Object data;
}
