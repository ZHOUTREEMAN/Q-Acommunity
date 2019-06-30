package com.weblatter.service.imple;

import com.weblatter.dao.UsersDao;
import com.weblatter.entity.UsersM;
import com.weblatter.service.IPeopleService;
import com.weblatter.util.Information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleService implements IPeopleService {

    @Autowired
    UsersDao usersDao;

    public Information<UsersM> validateSignIn(String userName, String password) {
        UsersM usersM = usersDao.selectUsersInformation(userName);
        if(usersM == null)
            return new Information<UsersM>("用户不存在", null);
        else if(!usersM.getPassword().equals(password))
            return new Information<UsersM>("密码不正确", null);
        else
            return new Information<UsersM>("登录成功", usersM);
    }

    public UsersM getUsersInformation(String userName) {
        UsersM usersM = usersDao.selectUsersInformation(userName);
        if(usersM == null)
            return null;
        else
            return usersM;
    }

    public Information<Boolean> updateUserInformation(String oldUserName, String userName, String email, String password) {
        //先查看数据库有没有此人
        UsersM usersM = usersDao.selectUsersInformation(oldUserName);
        if(usersM == null)
            return new Information<Boolean>("更新失败", false);
        else {
            UsersM res = usersM;
            res.setUserName(userName);
            res.setPassword(password);
            res.setEmail(email);
            usersDao.updateInformation(res);
            return new Information<Boolean>("更新完成", true);
        }
    }

    public void deleteUserFromSystem(String userName) {
        usersDao.deleteUser(userName);
    }

    public void UserRegister(String userName,String password) {
       UsersM usersM = new UsersM();
       int number = usersDao.selectAllUsersInformation().size();
       number++;
       usersM.setUser_id(String.valueOf(number));
       usersM.setUserName(userName);
       usersM.setPassword(password);
       usersM.setFans_num(0);
       usersM.setFollowers_num(0);
       usersDao.insertNewUser(usersM);
    }
}
