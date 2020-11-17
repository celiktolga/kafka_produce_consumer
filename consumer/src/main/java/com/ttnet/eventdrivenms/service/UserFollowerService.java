package com.ttnet.eventdrivenms.service;

import com.ttnet.eventdrivenms.entity.UserFollower;
import com.ttnet.eventdrivenms.exception.FollowerAlreadyExistsException;
import com.ttnet.eventdrivenms.repository.UserFollowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserFollowerService {
    @Autowired
    UserFollowerRepository userFollowerRepository;

    public UserFollower create(UserFollower userFollower) throws FollowerAlreadyExistsException {
        Optional<UserFollower> userFollowerOptional = userFollowerRepository.findById(userFollower.getId());
        if (userFollowerOptional.isPresent())
            throw new FollowerAlreadyExistsException(userFollower.getId());
        return userFollowerRepository.save(userFollower);
    }
}
