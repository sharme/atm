package com.atongmu.mvc.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * DataUtil的接口
 * 
 * @author junxian
 *
 */
interface DataUtilI{
	//\u4e00-\u9fa5 汉字
	/**
	 * 
	 * @param phone
	 * @return 检查手机号是否合法
	 */ 
	public boolean checkPhoneFormat(String phone);
	
	/**
	 * 
	 * @param str
	 * @return 检查是否为纯数字
	 */
	public boolean checkStrIsInt(String str);
	
	/**
	 * 
	 * @param str 要校验的字符串
	 * @param minLen 字符串最小长度
	 * @param maxLen 字符串最大长度
	 * @return 校验字符串是否为字母或数字并校验字符串的长度
	 */
	public boolean checkIsLetterDigit(String str, int minLen, int maxLen);
	
	/**
	 * 
	 * @param str 要校验的字符串
	 * @param minLen 字符串最小长度
	 * @param maxLen 字符串最大长度
	 * @return 校验字符串是否为字母或数字或汉字并校验字符串的长度
	 */
	public boolean checkIsLetterDigitChinese(String str, int minLen, int maxLen);

	
	/**
	 * 
	 * @return 获取产生验证码
	 */
	public String getProductCode();
}

/**
 * DataUtilI的接口 的实现类
 * 
 * @author junxian
 *
 */
public class DataUtil implements DataUtilI{
	//获取实例方法
	static DataUtil dataUtil;
	public static DataUtil getInstance(){
		if(dataUtil==null){
			dataUtil=new DataUtil();
		}
		return dataUtil;
	}

	@Override
	public boolean checkPhoneFormat(String phone) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("[0-9]*"); 
		Matcher isNum = pattern.matcher(phone);
		if(isNum.matches()&&phone.length()>=6&&phone.length()<=11){
			return true;
		}
		return false;
	}

	@Override
	public boolean checkStrIsInt(String str) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("[0-9]*"); 
		Matcher isNum = pattern.matcher(str);
		if(isNum.matches()){
			return true;
		}
		return false;
	}

	@Override
	public boolean checkIsLetterDigit(String str, int minLen, int maxLen) {
		// TODO Auto-generated method stub
		String regex = "[a-z0-9A-Z]*";
		Pattern pattern = Pattern.compile(regex); 
		Matcher isNum = pattern.matcher(str);
		if(isNum.matches()&&str.length()>=minLen&&str.length()<=maxLen){
			return true;
		}
		return false;
	}

	@Override
	public boolean checkIsLetterDigitChinese(String str, int minLen, int maxLen) {
		// TODO Auto-generated method stub
		String regex = "[a-z0-9A-Z\u4e00-\u9fa5]*";
		Pattern pattern = Pattern.compile(regex); 
		Matcher isNum = pattern.matcher(str);
		if(isNum.matches()&&str.length()>=minLen&&str.length()<=maxLen){
			return true;
		}
		return false;
	}


	@Override
	public String getProductCode() {
		// TODO Auto-generated method stub
		int code=(int)((Math.random()*9+1)*100000);
		return code+"";
	}

	
}


