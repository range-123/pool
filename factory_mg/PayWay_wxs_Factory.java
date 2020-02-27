package factoryupdate.factory_mg;

import factoryupdate.payselect.PaySelctOne;
import factoryupdate.payselect.PaySelctTwo;
import factoryupdate.payselect.PayWay;
import factoryupdate.payway.PayWay_mg_wxs;
import factoryupdate.payway.PayWay_mg_wxx;

/**
 * @program: pool
 * @description: 中国支付-微信
 * @author: fz
 * @create: 2020-02-27 11:00
 */
public class PayWay_wxs_Factory extends PaySelctTwo {

    public PayWay selectPayWays() {
        return new PayWay_mg_wxs();
    }
}