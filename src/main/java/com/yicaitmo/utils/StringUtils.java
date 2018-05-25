package com.yicaitmo.utils;

import java.io.UnsupportedEncodingException;

/**
 * 字符串操作工具类
 * @author maochunlong
 *
 */
public class StringUtils {

	static String name = "张三";
	
	public static void main(String[] args) {
		
		try {
			String test = new String(name.getBytes(), "UTF-8");
			System.out.println(test);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
