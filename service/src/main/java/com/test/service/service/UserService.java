package com.test.service.service;

import com.test.dao.UserDao;
import com.test.service.dto.UserDto;

import java.util.Optional;

    public class UserService {

        private final UserDao userDao = new UserDao();

        public Optional<UserDto> getUser(Long id){
          return userDao.findById(id).map(it->new UserDto());
        }
    }
