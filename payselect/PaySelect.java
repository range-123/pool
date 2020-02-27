package factoryupdate.payselect;

/**
 * @program: pool
 * @description: 支付选择-策略
 * @author: fz
 * @create: 2020-02-27 10:53
 */
public abstract class PaySelect {

    public abstract void select();

    public  PayWay getPayWay(Class<? extends PayWay> payWay){
        try {
            if(payWay!=null)
            return payWay.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return  null;
    }

}