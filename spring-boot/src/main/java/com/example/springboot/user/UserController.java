package com.example.springboot.user;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/user")
    public ResponseEntity<UserResponseDto> createUser(@RequestBody UserRequestDto userRequestDto) {
        User user = userService.createUser(userRequestDto);
        UserResponseDto res = new UserResponseDto(user.getId(), user.getUsername());
        return new ResponseEntity<>(res, HttpStatus.CREATED);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<UserResponseDto> getUsers(@PathVariable Long id) {
        UserResponseDto res = userService.getUser(id);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
