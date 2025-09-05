package ru.practicum.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;


    @Override
    public List<User> getAllUsers() {
        log.info("Попытка получения пользователей");
        return repository.findAll();
    }

    @Override
    public User saveUser(User user) {
        log.info("Попытка создания пользователя {}", user.getName());
        return repository.save(user);
    }
}
