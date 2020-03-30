package com.zhanghonghao.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		int i = RandomUtil.random(2, 4);
		System.out.println(i);
	}

	@Test
	public void testSubRandom() {
		int[] array = RandomUtil.subRandom(1, 10, 5);
		for (int i : array) {
			System.out.println(i);
		}
	}

	@Test
	public void testRandomCharacter() {
		char sss = RandomUtil.randomCharacter();
		System.out.println(sss);
	}

	@Test
	public void testRandomString() {
		String sss = RandomUtil.randomString(5);
		System.out.println(sss);
	}

}
