package com.eason.malladmin.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName UmsAdmin
 * @Description Class created by Eason Lee
 * @Author Eason Lee
 * @Date 2024-05-19 9:27 AM
 */

@Data
public class UmsAdmin implements Serializable {
    private long id;

    private String username;

    private String password;

    private String icon;

    private String email;

    private String nickName;

    private String note;

    private Date createTime;

    private Date loginTime;

    private Integer status;

}
