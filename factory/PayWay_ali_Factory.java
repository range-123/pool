package factoryupdate.factory;

import factoryupdate.payselect.PaySelctOne;
import factoryupdate.payselect.PayWay;
import factoryupdate.payway.PayWay_ali;
import factoryupdate.payway.PayWay_yl;

/**
 * @program: pool
 * @description: 中国支付-微信
 * @author: fz
 * @create: 2020-02-27 11:00
 */
public class PayWay_ali_Factory extends PaySelctOne  {

    public PayWay selectPayWays() {
        return new PayWay_ali();
    }
}