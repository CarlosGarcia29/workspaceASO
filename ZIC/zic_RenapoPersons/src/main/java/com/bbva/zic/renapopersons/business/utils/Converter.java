package com.bbva.zic.renapopersons.business.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Converter {
	private static final String DATE_FORMAT = "yyyy-MM-dd";
	private static final String DATE_FORMAT_WS = "dd/MM/yyyy";
	
	public static String converterToDateSlashToDash(String fecha) {
		if (fecha == null) {
			return null;
		}		
		
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		SimpleDateFormat sdfWs = new SimpleDateFormat(DATE_FORMAT_WS);	
		
		try {
			return sdf.format(sdfWs.parse(fecha));
		} catch (ParseException e) {
			return null;
		}
		
		
	}
	
	public static String converterToDateDashToSlash(String fecha) {
		if (fecha == null) {
			return null;
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		SimpleDateFormat sdfWs = new SimpleDateFormat(DATE_FORMAT_WS);
		try {
			return sdfWs.format(sdf.parse(fecha));
		} catch (ParseException e) {
			return null;
		}
	}
}
