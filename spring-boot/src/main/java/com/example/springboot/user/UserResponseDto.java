package com.example.springboot.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UserResponseDto {
    private final Long id;
    private final String username;
}
