package net.wisfaith.service.serviceimpl;

import com.alibaba.fastjson.JSON;
import net.wisfaith.bean.ResultVO;
import net.wisfaith.mapper.UserMapper;
import net.wisfaith.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public String getUser(String userName, String phone, String email, Integer page, Integer pageSize,ResultVO resultVO) {
        resultVO.setData(JSON
                .toJSONString(userMapper.getUserList(userName,phone,email,page,pageSize)));
        return JSON.toJSONString(resultVO);
    }
}
