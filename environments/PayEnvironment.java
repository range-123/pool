package factoryupdate.environments;

import factoryupdate.payselect.PaySelect;
import factoryupdate.payselect.PayWay;

/**
 * @program: pool
 * @description: 策略模式-环境类
 * @author: fz
 * @create: 2020-02-27 11:16
 */
public class PayEnvironment {
    public PaySelect paySelect;



    public   PayEnvironment(PaySelect paySelect) {
        this.paySelect = paySelect;
    }

    public void select(Class<? extends PayWay> pay){
        paySelect.select();
        PayWay oa =paySelect.getPayWay(pay);
        oa.showPayWay();
    }
}