package com.ttnet.eventdrivenms.service;

import com.ttnet.eventdrivenms.entity.User;
import com.ttnet.eventdrivenms.exception.UserAlreadyExistsException;
import com.ttnet.eventdrivenms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User create(User user) throws UserAlreadyExistsException {
        if (user.getId() != null) {
            Optional<User> producerOptional = userRepository.findById(user.getId());
            if (producerOptional.isPresent())
                throw new UserAlreadyExistsException(user.getId());
        }
        return userRepository.save(user);
    }
}
