package com.len.util;

import org.apache.log4j.Logger;

import java.util.Base64;
import java.util.Base64.Encoder;
import java.io.IOException;
import java.io.InputStream;


/**
 * bug_fix
 * //需要导入的包
 * import java.util.Base64.Encoder
 * import java.util.Base64.Decoder
 *
 * // 在代码中获取BASE64Encoder
 * BASE64Encoder encoder = Base64.getEncoder();
 * //在代码中获取BASE64Decoder
 * BASE64Decoder decoder = Base64.getDecoder();
 */

/**
 * Created by user on 2018/7/12.
 */
public class Base64Utils {
    private static Logger logger = Logger.getLogger(Base64Utils.class);
    private static Encoder encoder = Base64.getEncoder();

    public static byte[] ioToBase64(InputStream in) throws IOException {
        byte[] strBase64 = null;
        try {
            byte[] bytes = new byte[in.available()];
            // 将文件中的内容读入到数组中
            in.read(bytes);
            strBase64 = encoder.encode(bytes);      //将字节流数组转换为字符串
            in.close();
        } catch (IOException ioe) {
            logger.error("图片转64编码异常",ioe);
        }
        return strBase64;
    }
}
