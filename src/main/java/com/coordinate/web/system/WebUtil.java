package com.coordinate.web.system;

import java.util.Collection;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import com.coordinate.web.entity.User;

public final class WebUtil{

	public static String getUserNameFromPrincipal(){
		String userName = "";
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if( principal instanceof UserDetails ){
			userName = ((UserDetails)principal).getUsername();
		}else if( principal instanceof User ){
			userName = principal.toString();
		}
		return userName;
	} 
	
	public static String getUserNameFromAuthentication(){
		String userName = "";
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		userName = auth.getName();
		return userName;
	}	
	
	public static boolean isRolePresent(Collection<GrantedAuthority> authorities, String role) {
		boolean isRolePresent = false;
		for (GrantedAuthority grantedAuthority : authorities) {
		isRolePresent = grantedAuthority.getAuthority().equals(role);
		if (isRolePresent) break;
		}
		return isRolePresent;
	}	
}