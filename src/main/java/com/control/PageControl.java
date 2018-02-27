package com.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/Page")
public class PageControl {
	
	@RequestMapping("/toInformation")
	 public ModelAndView toCommodityInfo(int commodityId) {
	 	ModelAndView modelAndView = new ModelAndView();
	 	modelAndView.addObject("commodityId",commodityId);
	 	modelAndView.setViewName("home/introduction");
	 	return modelAndView;
	}
	
	@RequestMapping("/toCart")
	 public ModelAndView toCart() {
	 	ModelAndView modelAndView = new ModelAndView();
	 	int userId=11;
	 	modelAndView.addObject("userId",userId);
	 	modelAndView.setViewName("home/shopcart");
	 	return modelAndView;
	}
	
	@RequestMapping("/toAddress")
	 public ModelAndView toAddress() {
	 	ModelAndView modelAndView = new ModelAndView();
	 	int userId=11;
	 	modelAndView.addObject("userId",userId);
	 	modelAndView.setViewName("person/address");
	 	return modelAndView;
	}
	
	@RequestMapping("/toPay")
	 public ModelAndView toPay() {
	 	ModelAndView modelAndView = new ModelAndView();
	 	int userId=11;
	 	modelAndView.addObject("userId",userId);
	 	modelAndView.setViewName("home/pay");
	 	return modelAndView;
	}//注意这里的spring的Control的方法形式这里addObject方法保存的是需要传递到前端的变量 ,setViewName方法传递的是需要跳转的地址链接
	
	@RequestMapping("/order")
	 public ModelAndView order() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("person/order");
	 	return modelAndView;
	}
}
