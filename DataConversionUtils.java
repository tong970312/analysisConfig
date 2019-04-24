package com.ebiz.erp.core.Utils;

import com.ebiz.erp.core.admin.entity.attendanceConfig.*;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: litong
 * @date: 2019/4/23
 * 假期配置解析类
 **/
public class DataConversionUtils {

    //先判断属于哪个实例，再调用方法返回对应json对象
    public static Object vacationConfig(Object object, String str) {

        if (object != null && StringUtils.isNotBlank(str)) {
            String className = object.getClass().getName().substring(object.getClass().getName().lastIndexOf(".")+1);
            //根据实例获取类名并调用方法
            switch (className){
                //年假
                case "AnnualLeaveConfig":{
                    return  getJsonObject(object,str);
                }
                //婚假
                case "MarriageLeaveConfig":{
                   return  getJsonObject(object,str);
                }
                //丧假
                case "FuneralLeaveConfig":{
                    return  getJsonObject(object,str);
                }
                //产假
                case "MaternityLeaveConfig":{
                    return  getJsonObject(object,str);
                }
                //产检假
                case "PrenatalCheckUpLeaveConfig":{
                    return  getJsonObject(object,str);
                }
                //陪护假
                case "PaternityLeaveConfig":{
                    return  getJsonObject(object,str);
                }
                //哺乳假
                case "BreastfeedingLeaveConfig":{
                    return  getJsonObject(object,str);
                }
                //加班
                case "OverTimeConfig":{
                    return  getJsonObject(object,str);
                }
                //迟到
                case "BeLateConfig":{
                    return  getJsonObject(object,str);
                }
                //漏打卡
                case "IsPermitNotSignedAttendRecordConfig":{
                    return  getJsonObject(object,str);
                }
                //事假
                case "LeaveForPersonalAffairsConfig":{
                    return  getJsonObject(object,str);
                }
                //倒休
                case "ExchangeWorkingDaysAndHolidaysConfig":{
                    return  getJsonObject(object,str);
                }
                //旷工
                case "AbsenteeismConfig":{
                    return  getJsonObject(object,str);
                }
                //早退
                case "LeaveEarlyConfig":{
                    return  getJsonObject(object,str);
                }
                //缺勤
                case "AbsenceFromDutyConfig":{
                    return  getJsonObject(object,str);
                }
                //病假
                case "SickLeaveConfig":{
                    return  getJsonObject(object,str);
                }
                //通用配置
                case "AttendCommonConfig":{
                    return  getJsonObject(object,str);
                }
            }
        }
        return null;
    }

    private static Object getJsonObject(Object object, String str) {
        JSONObject jsonObject = JSONObject.fromObject(str);
        Object obj = JSONObject.toBean(jsonObject, object.getClass());
        return obj;
    }
}
