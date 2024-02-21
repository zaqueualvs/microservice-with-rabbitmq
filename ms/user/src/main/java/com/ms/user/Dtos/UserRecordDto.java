package com.ms.user.Dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserRecordDto(
        @NotBlank
        String name,
        @NotBlank
        @Email
        String email
) {
}
