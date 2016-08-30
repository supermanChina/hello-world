/**
 * 
 */
package com.study.fastjson.demo;

import lombok.Data;

/**
 * @author Zhang, Xiaochao
 * @since 2016年8月30日
 */
@Data
public class User {

	private Long id;
	private String name;

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
}
