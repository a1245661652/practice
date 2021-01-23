package threadtest;

/**
 * @author wu
 * @version 1.0
 * @date 2021/1/23
 * 不安全的取钱，
 * 两个人同时去银行取钱，账户
 */
public class UnsafeBank {
    public static void main(String[] args) {
        Account account = new Account(100,"结婚基金");
        Drawing you = new Drawing(account,100,"你");
        Drawing girlFriend = new Drawing(account,50,"你女朋友");
        you.start();
        girlFriend.start();
    }
}
//账户
class Account{
    // 余额
    int money ;
    String name ;

    public Account(int money,String name) {
        this.money = money;
        this.name = name;
    }
}
//模拟银行取钱
class Drawing extends Thread{
    Account account;//账户
    //取了多少钱
    int drawingMoney ;
    //谁取的钱
    int nowMoney ;
    public Drawing(Account account,int drawingMoney,String name){
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;


    }
    @Override
    public void run(){
        //判断有没有钱
        if(account.money-drawingMoney < 0)
        {
            System.out.println(Thread.currentThread().getName()+"钱不够取不了");
            return;
        }
        try {
            Thread.sleep(100);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        //卡内余额 = 余额 - 你取的钱
        account.money =  account.money -drawingMoney ;
        //你手里的钱
        nowMoney = nowMoney + drawingMoney;
        System.out.println(account.name+"余额为"+account.money);
        //Thread.currentThread.getName() = this.getName
        System.out.println(this.getName()+"手里的钱："+nowMoney);
    }

}





