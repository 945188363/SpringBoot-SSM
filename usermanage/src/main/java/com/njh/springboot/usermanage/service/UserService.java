package com.njh.springboot.usermanage.service;

import com.njh.springboot.usermanage.domain.User;

public interface UserService {
    User getUser(String username);
}
