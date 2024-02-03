package com.demo.internationalisationdemo.model.response;

import lombok.Builder;

import java.util.UUID;

/**
 * @author Kishan
 */

@Builder
public record APIResponse(int responseCode,String message,UUID traceId){}
