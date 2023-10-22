package me.dio.desafiojavaapi.service.impl;

import me.dio.desafiojavaapi.domain.model.User;
import me.dio.desafiojavaapi.domain.repository.UserRepository;
import me.dio.desafiojavaapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw  new IllegalArgumentException("This user already exists");
        }

        return userRepository.save(userToCreate);
    }
}
