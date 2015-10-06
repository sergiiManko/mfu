package com.igor.util;

import java.util.Date;

/**
 * Created by Igor Holyak
  * Date: 06.10.15
  */

public class Util {
    public static Date getDate(){
        return new Date();

    }

    public static long getTime(){
        return new Date().getTime();
    }
}
