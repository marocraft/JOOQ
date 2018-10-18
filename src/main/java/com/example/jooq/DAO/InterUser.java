package com.example.jooq.DAO;

import java.util.List;

import com.example.jooq.Entitys.User;

public interface InterUser {

	public void addUser(User user);
	public User getOneUser(Long id);
	public List<User> getAllUsers();
}
