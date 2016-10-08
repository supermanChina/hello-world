/**
 * 
 */
package com.study.fastjson.demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

/**
 * @author Zhang, Xiaochao
 * @since 2016年8月30日
 */
public class FastJsonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Group group = new Group();
		group.setId(0L);
		group.setName("admin");

		User guestUser = new User();
		guestUser.setId(2L);
		guestUser.setName("guest");

		User rootUser = new User();
		rootUser.setId(3L);
		rootUser.setName("root");

		group.addUser(guestUser);
		group.addUser(rootUser);

		Map<String, String> dataMap = new HashMap<String, String>();
		dataMap.put("key1", "value1");
		dataMap.put("key2", "value2");
		group.setDataMap(dataMap);

		String jsonString = JSON.toJSONString(group, true);

		System.out.println(jsonString);

		String jsonString2 = "{\"dataMap\":{\"key1\":\"value1\",\"key2\":\"value2\"},\"id\":0,\"name\":\"admin\",\"users\":[{\"id\":2,\"name\":\"guest\"},{\"id\":3,\"name\":\"root\"}]}";
		Group group2 = JSON.parseObject(jsonString, Group.class);

		System.out.println(group2);

		try {
			JSON.writeJSONString(new FileWriter(new File(
					"src/main/resource/group.json")), group2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
