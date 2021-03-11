package com.ds.hnw.dsgcservice.Service;

import com.ds.hnw.dsgcservice.Dao.userDao;
import com.ds.hnw.dsgcservice.entry.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {

    @Autowired
    userDao userD;

    public User getUserByUsername(User user){
        String userName = user.getUserName();
        User u = userD.findUserByName(userName);
        return u;
    }
}
