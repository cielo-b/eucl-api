package com.app.eucl.services.auth;

import com.app.eucl.dto.requests.LoginDTO;
import com.app.eucl.dto.requests.RegisterDTO;
import com.app.eucl.dto.responses.ApiResponse;

public interface IAuthService {
    ApiResponse login(LoginDTO dto);
    ApiResponse register(RegisterDTO dto);
}
