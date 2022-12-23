package Seminar2.view;

import java.util.List;

import Seminar2.data.User;

public abstract class UserView {
    
    public void show(User user){   
    }

    protected abstract User findTheBest(List<User> userList);
    
    public void showTheBest(List<User> userList){
        User user = findTheBest(userList);
        System.out.println(user);

    }
}
