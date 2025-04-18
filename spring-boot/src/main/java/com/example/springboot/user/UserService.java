package com.example.springboot.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User createUser(UserRequestDto req) {
        User user = new User(req);
        return userRepository.save(user);
    }

    public UserResponseDto getUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return new UserResponseDto(user.get().getId(), user.get().getUsername());
        } else {
            throw new RuntimeException("User not found");
        }
    }
}
