package com.mvc.dao;

import com.mvc.bean.LoginBean;
import com.mvc.exception.LoginException;

public interface ILoginDao {
	
	 public String authenticateUser(LoginBean loginBean) throws ClassNotFoundException, LoginException;

}
