package cn.sm1234.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sm1234.dao.AaaRepository;
import cn.sm1234.domain.Aaa;




@Controller
public class UserController {
	
	@Autowired
	private AaaRepository aaaRepository;
	
	
	@RequestMapping("/demo1")
	public String demo1(Model model) {
		String name = "";
		Optional<Aaa> po = aaaRepository.findById(1);
		if (po.isPresent()) {
			name = po.get().getAName();
		}
		model.addAttribute("message", "你好:" + name);
		
		return "demo1";
	}

}
