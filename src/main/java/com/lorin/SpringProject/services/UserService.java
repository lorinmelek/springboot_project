package com.lorin.SpringProject.services;

import com.lorin.SpringProject.main.User;

import java.util.List;

public class UserService
{
    private List<User> userList;

    public void setUserList(List<com.lorin.SpringProject.main.User> userList)
    {
        this.userList = userList;
    }

    public List<User> getUserList()
    {
        return userList;
    }
    @Override
    public String toString() {
        if (userList == null || userList.isEmpty()) {
            return "No users found.";
        }
        StringBuilder sb = new StringBuilder("Users: ");
        for (User user : userList) {
            sb.append(user.getName()).append(", ");
        }
        return sb.substring(0, sb.length() - 2); // Son virgülü kaldırır
    }
}
