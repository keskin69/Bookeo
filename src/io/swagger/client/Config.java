package io.swagger.client;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Config {
	public static final String API_DATE = "yyyy-MM-dd'T'HH:mm:ssXXX";
	public static final DateFormat APIFORMAT = new SimpleDateFormat(API_DATE);
	public static final DateFormat URLDATE = new SimpleDateFormat("yyyy'%2d'MM'%2d'dd'T'HH'%3a'mm'%3a'ss'%2b02%3a00'");
}
