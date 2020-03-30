package com.zhanghonghao.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("第"+i+1+"次");
			Person p=new Person();
			//名字
			p.setName(StringUtil.generateChineseName());
			//年龄
			p.setAge(RandomUtil.random(1,120));
			//介绍
			p.setAbout(StringUtil.randomChineseString(140));
			//注册日期
			p.setCreated(new Date());
			System.out.println(p);
		}
	}

}
