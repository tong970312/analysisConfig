package com.ebiz.erp.core.Utils;

import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;

/**
 * @author: litong
 * @date: 2019/4/23
 * 假期配置解析类
 **/
public class JsonFormatUtils {

    public static Object vacationConfig(Object object, String str) {

        if (object != null && StringUtils.isNotBlank(str)) {
            JSONObject jsonObject = JSONObject.fromObject(str);
            Object obj = JSONObject.toBean(jsonObject, object.getClass());
            return obj;
        }
        return null;
    }


}
