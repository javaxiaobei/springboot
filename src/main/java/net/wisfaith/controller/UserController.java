package net.wisfaith.controller;

import io.swagger.annotations.Api;
import net.wisfaith.bean.ResultVO;
import net.wisfaith.service.UserService;
import net.wisfaith.service.serviceimpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Api(tags = "用户接口", description = "提供用户相关的 api")
@Controller
@RequestMapping(value = "/user")
public class UserController {
    private final UserService userService;
    private ResultVO resultVO;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
        resultVO = null;
        resultVO = new ResultVO();
    }

    /**
     * 用户列表
     *
     * @param userName     用户名
     * @param phone    手机号
     * @param email        邮箱
     * @param page         页码
     * @param pageSize     每页条数
     */
    @GetMapping("/userList")
    public String userList(
            @RequestParam(required = false) String userName,
            @RequestParam(required = false) String phone,
            @RequestParam(required = false) String email,
            @RequestParam(required = false, defaultValue = "1") Integer page,
            @RequestParam(required = false, defaultValue = "10") Integer pageSize
             )  {

        return userService.getUser(userName, phone, email,
                page, pageSize,resultVO);
    }



}
