package com.yhhis.common.util;


import net.sf.json.JSONObject;
import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author DJY
 */
public class Util {

    public static String contextPath = "";
    /**
     * 打印log用
     */
    private static Log logger = new Log(LoggerFactory.getLogger(Util.class));

    /**
     * 打log接口
     *
     * @param log 要打印的log字符串
     * @return 返回log
     */
    public static String log(Object log) {
        logger.i(log.toString());
        return log.toString();
    }

    /**
     * 异常log打印
     *
     * @param info 描述字符串
     * @param e    异常对象
     */
    public static void logException(String info, Exception e) {

        StackTraceElement[] trace = e.getStackTrace();
        if (trace.length == 0) {
            logger.e(info + ":" + e.getCause());
        } else {
            String log = info + ":" + e.getCause();
            for (StackTraceElement s : trace) {
                log += "\tat " + s + "\n";
            }
            logger.e(log);
        }
    }

    /**
     * 获取系统时间
     *
     * @param format 时间格式
     * @return 格式化过的当前系统时间
     */
    public static String getTime(String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(new Date());
    }


    /**
     * 将字符串根据格式转换成Date对象
     *
     * @param format 时间格式
     * @param time   时间字符串
     * @return
     */
    public static long getTimeFromString(String format, String time) {
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        try {
            date = simpleDateFormat.parse(time);
        } catch (ParseException e) {
            return 0;
        }
        return date.getTime();
    }


    /**
     * 判断字符是否为空
     *
     * @param str 要判断的字符串
     * @return
     */
    public static boolean isEmpty(String str) {
        boolean isempty;

        if (str == null || str.equals("")) {
            isempty = true;
        } else {
            isempty = false;
        }
        return isempty;
    }

    /**
     * 设置当前request路径
     *
     * @param path
     */
    public static void setContextPath(String path) {
        contextPath = path;
    }

    /**
     * 根据身份证号获取性别
     *
     * @param idNo 身份证号
     * @return sex 性别
     */
    public static String getSexByIDNo(String idNo) {
        String sex = "";
        String id17 = idNo.substring(16, 17);
        if (Integer.parseInt(id17) % 2 != 0) {
            sex = "男";
        } else {
            sex = "女";
        }
        return sex;
    }

    /**
     * 根据身份证号获取生日
     *
     * @param idNo 身份证号
     * @return birthDate 出生年月字符串
     */
    public static String getBirthDateByIDNo(String idNo) {
        String birthDate = idNo.substring(6, 10) + "-" + idNo.substring(10, 12) + "-" + idNo.substring(12, 14);
//    	System.out.println(birthDate);
        return birthDate;
    }

    /**
     * 获取当前网络ip
     *
     * @param request
     * @return
     */
    public static String getIpAddr(HttpServletRequest request) {
        String ipAddress = request.getHeader("x-forwarded-for");
        if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("Proxy-Client-IP");
        }
        if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getRemoteAddr();
            System.out.println(ipAddress);
            if (ipAddress.equals("127.0.0.1") || ipAddress.equals("0:0:0:0:0:0:0:1")) {
                //根据网卡取本机配置的IP
                InetAddress inet = null;
                try {
                    inet = InetAddress.getLocalHost();
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
                ipAddress = inet.getHostAddress();
            }
        }
        //对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
        if (ipAddress != null && ipAddress.length() > 15) { //"***.***.***.***".length() = 15
            if (ipAddress.indexOf(",") > 0) {
                ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));
            }
        }
        return ipAddress;
    }

    /**
     * 获取中文字符首拼
     *
     * @param chinese
     * @return
     */
    public static String getPyHead(String chinese) {
        String pyHead = "";
        if (isEmpty(chinese)) {
            return null;
        }
        HanyuPinyinOutputFormat format = new HanyuPinyinOutputFormat();
        format.setCaseType(HanyuPinyinCaseType.UPPERCASE);
        format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        format.setVCharType(HanyuPinyinVCharType.WITH_V);
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < chinese.length(); i++) {
                String[] array = PinyinHelper.toHanyuPinyinStringArray(chinese
                        .charAt(i), format);
                if (array == null || array.length == 0) {
                    continue;
                }

                char s = array[0].charAt(0);

                sb.append(s);
            }
            pyHead = sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pyHead;
    }


    /**
     * 9位随机数 患者卡号（年2位-月2位-随机数4位）
     *
     * @return
     */
    public static String RanDomten() {
        String res = "";
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        String mm = "";
        mm = String.format("%02d", month);
        res = 0 + String.valueOf(year).substring(2, 4) + mm;
        return res;
    }

    // 根据时间计算年龄的方式 格式 1999-02-15
    public static String getAge(String str) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 0;
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        int age = 0;
        // System.out.println(year+" "+month+" "+date+"");
        try {
            str = str.trim();
            while (str.trim().charAt(0) == '-') {
                str = str.substring(1);
            }
            String temp[] = str.trim().split("-");
            if (temp.length == 3) {
                for (; i < 3; i++) {
                    list.add(Integer.parseInt(temp[i]));
                }
            }
            if (year - list.get(0) > 0) {
                age = year - list.get(0) - 1;
                if (month >= list.get(1)) {
                    if (date >= list.get(2)) {
                        age += 1;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("无法解析为年月日的结构");
            throw e;
        }
        return age + " ";
    }

    /**
     * 获取5位随机数
     */
    public static String getRundom() {

        Integer result = (int) ((Math.random() * 9 + 1) * 10000);
        return result.toString();
    }

    /**
     * 格式化时间
     *
     * @param date
     * @return
     */
    public static String simpleDate(String date) {
        try {
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            Date parse = sf.parse(date);
            String format = sf.format(parse);
            return format;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("时间转换异常");
        }
        return "";

    }

    /**
     * json 转map 集合
     *
     * @param s
     * @return
     */
    public static Map<String, Object> jsonStrToMap(String s) {
        Map<String, Object> map = new HashMap<String, Object>();
        //注意这里JSONObject引入的是net.sf.json
        JSONObject json = JSONObject.fromObject(s);
        Iterator<?> keys = json.keys();
        while (keys.hasNext()) {
            String key = (String) keys.next();
            String value = json.get(key).toString();
            if (value.startsWith("{") && value.endsWith("}")) {
                map.put(key, jsonStrToMap(value));
            } else {
                map.put(key, value);
            }

        }
        return map;
    }


    /**
     * 数组转map
     *
     * @param s
     * @return
     */
    public static Map<String, Object> jsonStrToArray(String s) {
        if (s.startsWith("[")) {
            s = s.substring(1);
        }
        if (s.endsWith("]")) {
            s = s.substring(0, s.length() - 1);
        }
        return jsonStrToMap(s);
    }

    /**
     * 将月份 无0 转换为 07
     * 2019-7-22转成 2019-07-22
     *
     * @param time
     * @return
     */
    public static String getTimeString(String time) {
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(time);

            time = new SimpleDateFormat("yyyy-MM-dd").format(date);
        } catch (Exception e) {
            return "";
        }
        return time;

    }

    /**
     * 将 603302400000 转换为时间
     *
     * @param time
     * @return
     */
    public static String getTimeBylong(String time) {
        Date date = new Date(Long.parseLong(time));
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(date);

    }


}

