/**
 * 
 */
package com.study.fastjson.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;

/**
 * @author Zhang, Xiaochao
 * @since 2016年8月30日
 */
@Data
public class Group {

	private Long id;
	private String name;
	private List<User> users = new ArrayList<User>();
	private Map<String, String> dataMap = new HashMap<String, String>();

	public Map<String, String> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, String> dataMap) {
		this.dataMap = dataMap;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public void addUser(User user) {
		users.add(user);
	}
}
