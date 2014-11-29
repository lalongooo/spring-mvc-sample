package com.coordinate.web.dao;

import java.util.List;

import com.coordinate.web.entity.Role;

public interface RoleDAO {
	
	public Role getRole(Integer id);
	
	public List<Role> listRole();
	
}
