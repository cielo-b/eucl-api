package com.app.eucl.services.token;

import com.app.eucl.dto.requests.PurchaseTokenDTO;
import com.app.eucl.dto.responses.ApiResponse;

import java.util.UUID;

public interface ITokenService {
    ApiResponse purchase(PurchaseTokenDTO dto);
    ApiResponse validateToken(String token);
    ApiResponse getTokensByMeter(UUID meterId);
    ApiResponse getToken(UUID id);
}
