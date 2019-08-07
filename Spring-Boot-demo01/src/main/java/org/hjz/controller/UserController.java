package org.hjz.controller;

import java.util.ArrayList;
import java.util.List;

import org.hjz.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //@RestController等价于@ResponseBody+@Controller
public class UserController {
	//当使用@ResponseBody注解，请求过来的转到页面中，而是直接将数据写入流中，将数据响应回去。相当于Response.GetWrite.
	@RequestMapping(value = "/")
	public List<User> name() {
		List<User> list = new ArrayList<User>();
		
		for (int i = 0; i <10; i++) {
			User user = new User();
			user.setName("黄捷舟"+i);
			user.setPhone("1832015730"+i);
			user.setAge(22+i);
			list.add(user);
		}
		return list;
	}
}
