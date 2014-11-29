package com.coordinate.web.service;

import java.util.List;

import com.coordinate.web.entity.Role;

public interface RoleService {
	
	public Role getRole(Integer id);
	
	public List<Role> listRole();
}
