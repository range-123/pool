package factoryupdate.test;

import factoryupdate.environments.PayEnvironment;
import factoryupdate.payselect.PaySelctOne;
import factoryupdate.payselect.PayWay;
import factoryupdate.payway.PayWay_ali;

/**
 * @program: pool
 * @description: 测试多个国家—及国家下不同的支付方式
 * @author: fz
 * @create: 2020-02-27 11:33
 */
public class PayTest {
    public static void main(String[] args) {
        PayEnvironment payEnvironment = new PayEnvironment(new PaySelctOne() {
            @Override
            public PayWay selectPayWays() {
                return null;
            }
        });
        payEnvironment.select(PayWay_ali.class);

    }
}