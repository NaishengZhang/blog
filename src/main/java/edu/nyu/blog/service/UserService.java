package edu.nyu.blog.service;

import edu.nyu.blog.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
