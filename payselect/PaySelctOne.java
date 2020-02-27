package factoryupdate.payselect;

/**
 * @program: pool
 * @description: 中国-支付
 * @author: fz
 * @create: 2020-02-27 10:55
 */
public abstract  class PaySelctOne extends PaySelect {

    public void select() {
        System.out.println("中国支付");
    }
    public abstract PayWay selectPayWays();

}