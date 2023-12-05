package com.kyobo.service.impl;

import com.kyobo.dao.UserMapper;
import com.kyobo.dto.UserVO;
import com.kyobo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<UserVO> getUserList() {
        return userMapper.getUserList();
    }
}
