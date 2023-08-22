package com.anamika.Service;

import com.anamika.bean.Cart;
import com.anamika.bean.Product;
import com.anamika.bean.User;

public interface UserService {
	
	User searchUser(int userId);
	User saveUser(User user);
	boolean boughtProduct(int userId, Product product, Cart cart);
	boolean returns(int userId, Product product, Cart cart);
	

}
