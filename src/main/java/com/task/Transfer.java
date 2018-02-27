package com.task;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.control.orderControl;
import com.domain.shopcart;
import com.mapper.parentOrderMapper;
import com.mapper.shopcartMapper;
import com.service.orderServer;

@Component("alipay")
public class Transfer {
	@Autowired
	private shopcartMapper cart;
	
	@Autowired
	private parentOrderMapper parent;
	
	@Autowired
	private orderServer order;
	
	private  Logger log=LoggerFactory.getLogger(Transfer.class);
	
	
	public void work(){
		Calendar cal=Calendar.getInstance();//��ȡ��ǰ��ʱ��
		cal.add(cal.MINUTE, -5);//ʱ����ǰ����5����
		Date date=cal.getTime();
		try {
			order.addStore(date);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<shopcart> shop=cart.selectBystatus(2);
		for(shopcart i:shop) {
			cart.updateCanel(0,i.getId(),date);
		}
		int rows=parent.updateOrderStatus(date);
		System.out.println("rows=++++++++++++++"+rows+"]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]");
		
	}//����Ķ�ʱ��������5���������û��֧����ȡ������

}
