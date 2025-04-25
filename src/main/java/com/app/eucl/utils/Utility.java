package com.app.eucl.utils;

import jakarta.validation.constraints.NotEmpty;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class Utility {
    private static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public static String hash(@NotEmpty(message = "The raw string is required.") String raw) {
            return passwordEncoder.encode(raw);
    }

    public static boolean compare(String hashed, String raw) {
        return passwordEncoder.matches(raw, hashed);
    }
}
