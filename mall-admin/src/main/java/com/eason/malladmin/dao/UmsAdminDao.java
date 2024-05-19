package com.eason.malladmin.dao;

import com.eason.malladmin.model.UmsAdmin;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UmsAdminDao
 * @Description Class created by Eason Lee
 * @Author Eason Lee
 * @Date 2024-05-19 9:53 AM
 */

@Repository
public interface UmsAdminDao {
    UmsAdmin selectByIdSimple(long id);
}
