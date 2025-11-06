package ht.bms.applicant.utils;

import java.math.BigDecimal;

public class GenTools {
	public static BigDecimal generedCodeId(){

        long code = (long) Math.floor(Math.random() * 90000000000000L) + 10000000000000L;
        return new BigDecimal(code);
    }
	
	public static String generateOTP(){

        long otp = (long) Math.floor(Math.random() * 9000000L) + 1000000L;
        return String.valueOf(otp);
    }


}
