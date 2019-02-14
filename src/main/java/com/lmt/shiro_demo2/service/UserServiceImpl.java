package com.lmt.shiro_demo2.service;

        import com.lmt.shiro_demo2.mapper.UserMapper;
        import com.lmt.shiro_demo2.model.User;
        import org.springframework.stereotype.Service;

        import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
