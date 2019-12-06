package com.yhhis.common.util;


import com.yhhis.service.NoService;

/**
 * 生成tard_no的工具类
 *
 * @author Administrator
 */
public class NoTools {
    private static NoTools mInstance;
    private NoService noService;

    private NoTools() {
    }

    /**
     * 单例模式拿到NoTools对象
     *
     * @return
     */
    public static NoTools getInstance() {
//        if(mInstance == null){
//			synchronized (NoTools.class){
//				if(mInstance == null){
//					mInstance = new NoTools();
//					mInstance.noService =  (NoService) SpringContextUtil.getBean(NoService.class);
//				}
//			}
//		}
//		System.out.println(mInstance);
        mInstance = new NoTools();
        return mInstance;
    }

    /**
     * 生成订单号
     *
     * @return
     */
    public String getWXTradeNo() {
        String time = Util.getTime("yyyyMMddHHmmss");
        System.out.println("no-----" + time);
        return time;
    }
}
