package cn.team.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.team.bean.User;
import cn.team.mapper.UserMapper;

@Service
@Transactional
public class UserService implements UserDetailsService{
	@Autowired
	UserMapper userMapper;
	
//	public User getUserById(int id) {
//		return userMapper.findUserById(id);
//	}

	public List<User> getAllUser(){
		return userMapper.findUserList();
	}
	public int addUser(User user) {
		return userMapper.addUser(user);
	}
	public User getUserByUsername(String username) {
		return userMapper.findUserByUserName(username);
	}
	public int updateUser(User user) {
		return userMapper.updateUser(user);
	}
	public int deleteUserByUsername(String username) {
		return userMapper.deleteUserByUsername(username);
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 User user = userMapper.findUserByUserName(username);
		 Collection collection = user.getAuthorities();
	        if (user == null) {
	            throw new UsernameNotFoundException("用户名不对");
	        }
	        //System.out.println(user.getName()+"-----------");
	        return user;
	}
}
