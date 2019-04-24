package com.ebiz.erp.core.Utils;

import com.ebiz.erp.core.admin.entity.attendanceConfig.*;

public class DataConversionTest {
    public static void main(String[] args) {
        String str = "" ;
        AttendCommonConfig getBean = (AttendCommonConfig) DataConversionUtils.vacationConfig(new AttendCommonConfig(),str);
        System.out.println("getBean = " + getBean);

    }
}
