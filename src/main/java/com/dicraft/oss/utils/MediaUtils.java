package com.dicraft.oss.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: DiCraft
 * @Date: 2022/9/21 15:06
 * @package: com.dicraft.oss.utils
 * @Version: 1.0
 * @Decsription: 媒体工具，判断媒体类型
 */
public class MediaUtils {
    public static final Map<String, String> MEDIA_MAP = new HashMap(){
        {

            //本来是pdf的
            put(".pdf", "application/pdf");

            //视频
            put(".mp4", "video,video/mp4");

        }
    };

    /**
     * 获得文件类型
     * @param filePath
     * @return
     */
    public static String getContentType(String filePath){

        if(!StringUtils.isBlank(filePath)
                && filePath.indexOf(".")!=-1) {

            // 后缀转换成小写
            String suffix = filePath.substring(filePath.lastIndexOf(".")).toLowerCase();

            if (MEDIA_MAP.containsKey(suffix)) {
                return MEDIA_MAP.get(suffix);
            }
        }

        return "application/octet-stream";
    }
}
