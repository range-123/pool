package factoryupdate.payway;

import factoryupdate.payselect.PayWay;

/**
 * @program: pool
 * @description: 中国支付-微信
 * @author: fz
 * @create: 2020-02-27 11:00
 */
public class PayWay_wx extends PayWay{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showPayWay() {
        System.out.println("中国支付-微信");
    }
}