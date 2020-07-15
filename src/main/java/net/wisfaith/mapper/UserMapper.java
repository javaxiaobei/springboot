package net.wisfaith.mapper;

import net.wisfaith.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {

    List<User> getUserList(String userName, String phone, String email,Integer page,Integer pageSize);
}
