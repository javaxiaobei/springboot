package net.wisfaith.service;

import net.wisfaith.bean.ResultVO;
import org.springframework.stereotype.Service;


@Service
public interface UserService {
     String getUser(String userName, String phone, String email, Integer page, Integer pageSize, ResultVO resultVO) ;
}
