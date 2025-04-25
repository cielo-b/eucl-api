package com.app.eucl.dto.requests;

import com.app.eucl.enums.ERole;
import com.app.eucl.security.validation.annotations.ValidNationalId;
import com.app.eucl.security.validation.annotations.ValidPassword;
import com.app.eucl.security.validation.annotations.ValidPhoneNumber;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDTO {
    @NotEmpty(message = "The names are required.")
    private String names;

    @NotEmpty(message = "The email is required.")
    @Email(message = "Invalid email provided")
    private String email;

    @NotEmpty(message = "The phone number is required.")
    @ValidPhoneNumber
    private String phone;

    @NotEmpty(message = "The national id is required.")
    @ValidNationalId
    private String nationalId;

    @NotEmpty(message = "The password is required.")
    @ValidPassword
    private String password;

    private ERole role;
    private String adminCreationKey;
}
