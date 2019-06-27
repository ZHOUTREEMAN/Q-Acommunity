package com.weblatter.service;

import com.weblatter.entity.UsersM;
import com.weblatter.util.Information;

public interface IPeopleService {
    /**登录服务
     * @param userName
     * @param password
     * @return工具类information,如果通过information的mainData不为空，不通过为空,String为错误信息
     */
    public Information<UsersM>validateSignIn(String userName, String password);

    /**查询服务
     * @param userName
     * @return用户信息
     */
    public UsersM getUsersInformation(String userName);

    /**修改用户名服务
     * 数据库只能修改三个选项，用户名，密码和邮箱
     * @param userName
     * @param email
     * @param password
     * @return 修改是否成功，
     */
    public Information<Boolean> updateUserInformation(String oldUserName, String userName, String email, String password);

    /**
     * 注销用户名服务
     * @param userName
     * @return 注销是否成功
     */
    public void deleteUserFromSystem(String userName);

    /**
     * 用户注册
     */
    public void UserRegister(UsersM usersM);
}
