package com.xiaoma.service.serviceImpl;

import com.xiaoma.dao.UsersDao;
import com.xiaoma.entity.USERS;
import com.xiaoma.service.UsersService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.List;


@Service("userService")
@Transactional
public class UsersServiceImpl implements UsersService {
    @Resource
    private  UsersDao dao;


    public USERS selectUser(long id) {
        return null;
    }
}
