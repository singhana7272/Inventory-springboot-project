package com.anamika.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anamika.bean.Cart;
import com.anamika.bean.Product;
import com.anamika.bean.User;
import com.anamika.persistence.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public User searchUser(int userId) {
		return userRepo.getById(userId);
	}

	@Override
	public User saveUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public boolean boughtProduct(int userId, Product product, Cart cart) {
		
		return false;
	}

	@Override
	public boolean returns(int userId, Product product, Cart cart) {
	// TODO Auto-generated method stub
		return false;
	}

}
