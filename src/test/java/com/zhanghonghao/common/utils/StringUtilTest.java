package com.zhanghonghao.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		String src=" ";
		String sr="";
		boolean s = StringUtil.hasLength(src);
		boolean ss = StringUtil.hasLength(sr);
		System.out.println(s);
		System.out.println(ss);
	}

	@Test
	public void testHasText() {
		String src=" ";
		String sr="";
		boolean s = StringUtil.hasText(src);
		boolean ss = StringUtil.hasText(sr);
		System.out.println(s);
		System.out.println(ss);
	}

	@Test
	public void testRandomChineseString() {
		String sss = StringUtil.randomChineseString(2);
		System.out.println(sss);
	}

	@Test
	public void testGenerateChineseName() {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}

}
