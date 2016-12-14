package br.com.cea.ecommerce.common.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

public class DateTimeUtil {
	
	public static final String PATTERN_DATE_PT = "dd/MM/yyyy";
	
	public static final String PATTERN_DATE_TIME_PT = PATTERN_DATE_PT + " HH:mm:ss";
	  
	public static synchronized String format(java.util.Date dateRep, String pattern) {
		try {
			DateFormat df = new SimpleDateFormat(pattern);
			return df.format(dateRep);
		}catch (Exception e) {
			return "";
		}
	}
	
	public static synchronized Date parse(String dateRep, String pattern) {
		try {
			DateFormat df = new SimpleDateFormat(pattern);
			return df.parse(dateRep);
		}catch (Exception e) {
			return null;
		}
	}
	
	public static synchronized String format(XMLGregorianCalendar xmlGregorian, String pattern) {
		try {
			return DateTimeUtil.format(DateTimeUtil.convertGregorianToDate(xmlGregorian), pattern);
		}catch (Exception e) {
			return "";
		}
	}
	
	public static synchronized java.sql.Timestamp convertDateToSQLDate(Date date){
		if(date != null){
			return new java.sql.Timestamp(date.getTime());
		}
		return null;
	}
	
	public static synchronized Date convertGregorianToDate(XMLGregorianCalendar xmlGregorian){
		if(xmlGregorian != null){
			return xmlGregorian.toGregorianCalendar().getTime();
		}
		return null;
	}
}
