package net.wisfaith.bean;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体类
 */
@Data
public class User implements Serializable {


    private Integer uid;
    private String username;
    private String password;
    private String phone;
    private String email;
    private String header;
    private Date createTime;




}

