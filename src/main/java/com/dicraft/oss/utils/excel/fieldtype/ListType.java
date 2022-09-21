package com.dicraft.oss.utils.excel.fieldtype;

import com.dicraft.oss.utils.StringUtils;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author: DiCraft
 * @Date: 2022/9/21 14:58
 * @package: com.dicraft.oss.utils.excel.fieldtype
 * @Version: 1.0
 * @Decsription: 字段类型转换
 */
public class ListType {

    /**
     * 获取对象值（导入）
     */
    public static Object getValue(String val) {
        List<String> list = Lists.newArrayList();
        if(!StringUtils.isBlank(val)) {
            for (String s : val.split(",")) {
                list.add(s);
            }
        }
        return list;
    }

    /**
     * 设置对象值（导出）
     */
    public static String setValue(Object val) {
        if (val != null){
            List<String> list = (List<String>)val;
            StringBuffer sb = null;
            for (String item: list){
                if(StringUtils.isBlank(item)){
                    continue;
                }
                if(sb == null){
                    sb = new StringBuffer(item);
                }else{
                    sb.append(",").append(item);
                }
            }

            if(sb!=null) {
                return sb.toString().replace("[]", "");
            }
        }
        return "";
    }

}
