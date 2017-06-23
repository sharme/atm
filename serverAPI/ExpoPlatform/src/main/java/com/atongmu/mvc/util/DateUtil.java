package com.atongmu.mvc.util;

import java.util.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface DateUtilI{
	
	/**
	 * 
	 * @param str
	 * @return 检查是否为年月日日期字符串
	 */
	public boolean checkIsYMDFormat(String str);
	/**
	 * 
	 * @param date
	 * @param formatStr
	 * @return 日期转换为字符串
	 */
	public String formatDateToString(Date date, String formatStr);
	
	/**
	 * 
	 * @param dateStr
	 * @param formatStr
	 * @return 字符串转换为日期
	 */
	public Date formatStringToDate(String dateStr, String formatStr);
	
	/**
	 * 
	 * @param date
	 * @return Timestamp转为字符串
	 */
	public String formatoTimestampString(Timestamp date);
	/**
	 * 
	 * @param dateStr
	 * @return 字符串转换为Timestamp
	 */
	public Timestamp formatStringToTimestamp(String dateStr);
	/**
	 * 
	 * @param birthday
	 * @return 获取年龄
	 */
	public int getforDataAge(String birthday);
	
	/**
	 * 
	 * @param startDate 大的日期
	 * @param endDate 小的日期
	 * @param offType 0：日 1：小时 2：分 3：秒
	 * @return 获取两个时间相差多少
	 */
	public long getTwoDateDiff(Date startDate, Date endDate, int offType);
}


/**
 * 日期操作工具类
 * @author junxian
 *
 */
public class DateUtil implements DateUtilI{
	/**
	 * 日期转换格式-yyyy-MM-dd hh:mm:ss
	 */
	public static String DATE_FORMAT_YMDHMS="yyyy-MM-dd hh:mm:ss";
	/**
	 * 日期转换格式-yyyy-MM-dd hh:mm
	 */
	public static String DATE_FORMAT_YMDHM="yyyy-MM-dd hh:mm";
	/**
	 * 日期转换格式-yyyy-MM-dd
	 */
	public static String DATE_FORMAT_YMD="yyyy-MM-dd";
	
	/**
	 * 日期转换格式-yyyy/MM/dd hh:mm:ss
	 */
	public static String DATE_FORMAT_YMDHMS_TIME="yyyy/MM/dd hh:mm:ss";
	
	//获取实例方法
	static DateUtil dateUtil;
	public static DateUtil getInstance(){
		if(dateUtil==null){
			dateUtil=new DateUtil();
		}
		return dateUtil;
	}
	

	@Override
	public boolean checkIsYMDFormat(String str) {
		// TODO Auto-generated method stub
		/**
         * 判断日期格式和范围
         */
        String rexp = "^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))";
         
        Pattern pat = Pattern.compile(rexp);  
         
        Matcher mat = pat.matcher(str);  
         
        boolean dateType = mat.matches();

        return dateType;
	}


	@Override
	public String formatDateToString(Date date, String formatStr) {
		// TODO Auto-generated method stub
		String dateStr="";
		try{
			DateFormat format=new SimpleDateFormat(formatStr);
			dateStr=format.format(date);
		}catch (Exception e) {
			// TODO: handle exception
			LoggerUtil.error(e.getMessage());
		}
		return dateStr;
	}


	@Override
	public Date formatStringToDate(String dateStr, String formatStr) {
		// TODO Auto-generated method stub
		Date date=null;
		try{
			DateFormat format=new SimpleDateFormat(formatStr);
			date=(Date) format.parse(dateStr);
		}catch (Exception e) {
			// TODO: handle exception
			LoggerUtil.error(e.getMessage());
		}
		return date;
	}


	@Override
	public String formatoTimestampString(Timestamp date) {
		// TODO Auto-generated method stub
		String dateStr=null;
		try{
			DateFormat format=new SimpleDateFormat(DATE_FORMAT_YMDHMS_TIME);
			dateStr=format.format(date);
		}catch (Exception e) {
			// TODO: handle exception
			LoggerUtil.error(e.getMessage());
		}
		return dateStr;
	}


	@Override
	public Timestamp formatStringToTimestamp(String dateStr) {
		// TODO Auto-generated method stub
		Timestamp time=null;
		try{
			time=Timestamp.valueOf(dateStr);
		}catch (Exception e) {
			// TODO: handle exception
			LoggerUtil.error(e.getMessage());
		}
		return time;
	}


	@Override
	public int getforDataAge(String birthday) {
		int age=0;
		try{
		// TODO Auto-generated method stub
			SimpleDateFormat myFormatter = new SimpleDateFormat(DATE_FORMAT_YMD);
			Date nowDate=new Date();
			Date mydate= myFormatter.parse(birthday);
			long day=(nowDate.getTime()-mydate.getTime())/(24*60*60*1000) + 1;
			String year=new java.text.DecimalFormat("#.00").format(day/365f);
		
			age=Integer.parseInt(year);
		}catch (Exception e) {
			// TODO: handle exception
			LoggerUtil.error(e.getMessage());
		}
		return age;
	}


	@Override
	public long getTwoDateDiff(Date startDate, Date endDate, int offType) {
		// TODO Auto-generated method stub
		long nd = 1000 * 24 * 60 * 60;
	    long nh = 1000 * 60 * 60;
	    long nm = 1000 * 60;
	    long ns = 1000;
	    // 获得两个时间的毫秒时间差异
	    long diff = startDate.getTime() - endDate.getTime();
	    // 计算差多少天
	    long day = diff / nd;
	    // 计算差多少小时
	    long hour = diff % nd / nh;
	    // 计算差多少分钟
	    long min = diff % nd % nh / nm;
	    // 计算差多少秒//输出结果
	    long sec = diff % nd % nh % nm / ns;
	    long value=day;
	    switch (offType) {
		case 0:
			value=day;
			break;
		case 1:
			value=hour;	
			break;
		case 2:
			value=min;
			break;
		case 3:
			value=sec;
			break;

		default:
			
			break;
		}
		return value;
	}

}
