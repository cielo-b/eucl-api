package com.app.eucl.controllers.auth;

import com.app.eucl.dto.requests.LoginDTO;
import com.app.eucl.dto.requests.RegisterDTO;
import com.app.eucl.dto.responses.ApiResponse;
import com.app.eucl.services.auth.IAuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final IAuthService authService;

    @PostMapping("/login")
    public ResponseEntity<ApiResponse> login(@Valid @RequestBody LoginDTO dto) {
        ApiResponse response = authService.login(dto);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping("/register")
    public ResponseEntity<ApiResponse> register(@Valid @RequestBody RegisterDTO dto) {
        ApiResponse response = authService.register(dto);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @GetMapping("/me")
    public ResponseEntity<ApiResponse> me() {
        ApiResponse response = authService.getLoggedInUser();
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
