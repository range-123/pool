package factoryupdate.factory_mg;

import factoryupdate.payselect.PaySelctOne;
import factoryupdate.payselect.PaySelctTwo;
import factoryupdate.payselect.PaySelect;
import factoryupdate.payselect.PayWay;
import factoryupdate.payway.PayWay_mg_wxx;
import factoryupdate.payway.PayWay_yl;

/**
 * @program: pool
 * @description: 中国支付-微信
 * @author: fz
 * @create: 2020-02-27 11:00
 */
public class PayWay_wxx_Factory extends PaySelctTwo {

    public PayWay selectPayWays() {
        return new PayWay_mg_wxx();
    }



}