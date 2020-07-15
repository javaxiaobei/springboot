package net.wisfaith.config;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.util.Date;

/**
 * 功能:  定时任务
 *
 * @Auther 李帅
 * @Data 2017-11-19.下午 5:26
 *
 *      demo: "0 0 12 * * ?"    每天中午十二点触发
 *            "0 15 10 ? * *"    每天早上10：15触发
 *            "0 15 10 * * ?"    每天早上10：15触发
 *            "0 15 10 * * ? *"    每天早上10：15触发
 *            "0 15 10 * * ? 2005"    2005年的每天早上10：15触发
 *            "0 * 14 * * ?"    每天从下午2点开始到2点59分每分钟一次触发
 *            "0 0/5 14 * * ?"    每天从下午2点开始到2：55分结束每5分钟一次触发
 *            "0 0/5 14,18 * * ?"    每天的下午2点至2：55和6点至6点55分两个时间段内每5分钟一次触发
 *            "0 0-5 14 * * ?"    每天14:00至14:05每分钟一次触发
 *            "0 10,44 14 ? 3 WED"    三月的每周三的14：10和14：44触发
 *            "0 15 10 ? * MON-FRI"    每个周一、周二、周三、周四、周五的10：15触发
 *
 */
@Component
public class TimeTask {


    /**
     * 每分钟的5秒执行该方法
     */
   // @Scheduled(cron = "5 * * * * *")
    public void cron() throws Exception
    {
        System.out.println("执行测试cron时间(每分钟的5秒执行该方法)："+ new Date(System.currentTimeMillis()));
    }


    /**
     * 是上一个调用开始后再次调用的延时（不用等待上一次调用完成）
     */
    //@Scheduled(fixedRate = 3000 * 1)
    public void fixedRate() throws Exception
    {
        Thread.sleep(2000);
        System.out.println("执行测试fixedRate时间："+ new Date(System.currentTimeMillis()));
    }

    /**
     * 上一个调用完成后再次调用的延时调用（等待上一次调用完成）
     */
    //@Scheduled(fixedDelay = 1000 * 1)
    public void fixedDelay() throws Exception
    {
        Thread.sleep(3000);
        System.out.println("执行测试fixedDelay时间："+ new Date(System.currentTimeMillis()));
    }

    /**
     * 第一次被调用前的延时，单位毫秒
     */
    @Scheduled(initialDelay = 1000 * 10,fixedDelay = 1000 * 2)
    public void initialDelay()
    {
        System.out.println("执行测试initialDelay时间："+ new Date(System.currentTimeMillis()));

    }

}
