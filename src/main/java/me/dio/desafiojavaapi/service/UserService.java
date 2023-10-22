package me.dio.desafiojavaapi.service;

import me.dio.desafiojavaapi.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);


}
