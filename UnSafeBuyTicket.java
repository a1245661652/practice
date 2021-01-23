package threadtest;

/**
 * @author wu
 * @version 1.0
 * @date 2021/1/23
 */
public class UnSafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();
        new Thread(buyTicket,"me").start();
        new Thread(buyTicket,"you").start();
        new Thread(buyTicket,"tickerScalper").start();
    }


}
class BuyTicket implements Runnable{
    //票
    private int ticketNums = 10 ;
    boolean flag = true ;
    @Override
    public void run(){
        while(flag){
            try {
                buy();
            }catch (InterruptedException e){
                e.printStackTrace();

            }
        }
    }
    private void buy() throws InterruptedException{
        //判断是否有票
        if(ticketNums <=0)
        {
            flag = false;
            return;
        }
        //模拟延时
        Thread.sleep(100);
        //买票
        System.out.println(Thread.currentThread().getName()+"拿到"+ticketNums--);
    }
}
