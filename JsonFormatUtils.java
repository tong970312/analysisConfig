package com.ebiz.erp.core.Utils;

import com.ebiz.erp.core.admin.entity.attendanceConfig.AnnualLeaveConfig;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;

/**
 * @author: litong
 * @date: 2019/4/23
 * 假期配置解析类
 **/
public class JsonFormatUtils {

   /* public static Object vacationConfig(Object object, String str) {

        if (object != null && StringUtils.isNotBlank(str)) {
            JSONObject jsonObject = JSONObject.fromObject(str);
            Object obj = JSONObject.toBean(jsonObject, object.getClass());
            return obj;
        }
        return null;
    }*/
   public static <T> T transformJsonToObject(Class<T> objectClass, String str) throws Exception {
       Object object = null;

       if (StringUtils.isNotBlank(str)) {
           net.sf.json.JSONObject jsonObject = JSONObject.fromObject(str);
           object = JSONObject.toBean(jsonObject, objectClass);
       }
       return (T)object;
   }
    public static void main(String[] args) {
        String str = "{\n" +
                "\t\"isAnnualLeave\": 0,\n" +
                "\t\"isDiffEntryYears\": 0,\n" +
                "\t\"notDistinguishEntryYearsColumn\": {\n" +
                "\t\t\"entryMonths\": 6,\n" +
                "\t\t\"workMonths\": 12,\n" +
                "\t\t\"annualLeaveDays\": 5\n" +
                "\t},\n" +
                "\t\"distinguishEntryYearsColumn\": [{\n" +
                "\t\t\t\"minEntryYears\": 1,\n" +
                "\t\t\t\"maxEntryYears\": 10,\n" +
                "\t\t\t\"annualLeaveDays\": 2\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"minEntryYears\": 2,\n" +
                "\t\t\t\"maxEntryYears\": 20,\n" +
                "\t\t\t\"annualLeaveDays\": 3\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"isIncludeWeekendAndHoliday\": 0,\n" +
                "\t\"noAnnualLeaveSettingColumn\": [{\n" +
                "\t\t\t\"minEntryYearAmount\": 1,\n" +
                "\t\t\t\"maxEntryYearAmount\": 10,\n" +
                "\t\t\t\"leaveType\": 1,\n" +
                "\t\t\t\"leaveDays\": 1\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"minEntryYearAmount\": 2,\n" +
                "\t\t\t\"maxEntryYearAmount\": 20,\n" +
                "\t\t\t\"leaveType\": 2,\n" +
                "\t\t\t\"leaveDays\": 2\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"noAnnualLeaveUserIds\": \"1,2,3\",\n" +
                "\t\"noAnnualLeaveUserNames\": \"郑凯,王立帅,何伟杰\",\n" +
                "\t\"annualLeaveMinUnit\": 1,\n" +
                "\t\"thisYearAnnualLeaveSettingColumn\": [{\n" +
                "\t\t\t\"minDays\": 0.2,\n" +
                "\t\t\t\"maxDays\": 0.5,\n" +
                "\t\t\t\"annualLeaveDays\": 0.5\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"minDays\": 0.2,\n" +
                "\t\t\t\"maxDays\": 0.5,\n" +
                "\t\t\t\"annualLeaveDays\": 0.5\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"isRuleTimeUse\": 1,\n" +
                "\t\"annualLeaveExpirationDate\": \"04-14\"\n" +
                "}";
        Object obj = null;
        try {
            obj = transformJsonToObject( AnnualLeaveConfig.class,str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("obj = " + ((AnnualLeaveConfig) obj).getDistinguishEntryYearsColumn().get(0));
    }

}
