package threadtest;

/**
 * @author wu
 * @version 1.0
 * @date 2021/1/28
 * 测试生产者消费者问题2：信号灯法，标志位解决
 */
public class TestPc2 {
    public static void main(String[] args) {
        TV tv = new TV();
        new Player(tv).start();
        new Watcher(tv).start();
    }
}

//生产者——》演员
class Player extends Thread{
    TV tv;
    int count = 20;



    //构造方法
    public  Player(TV tv){
        this.tv = tv ;
    }
    @Override
    public void run(){
        for (int i = 0; i < count; i++) {
            if( i%2 == 0){
                this.tv.play("快乐大本营");
            }else{
                this.tv.play("抖音");
            }
        }
    }


}

//消费者——》观众
class Watcher extends Thread{
    TV tv ;
    int count = 20;
    public  Watcher(TV tv){
        this.tv = tv ;
    }
    @Override
    public void run(){
        for (int i = 0; i < count; i++) {

            tv.watch();
        }
    }


}

//产品——》节目
class TV{

//演员演出，观众等待
//观众观看，演员等待
    String voice ; //表演的节目
    boolean flag = true ; //标志位
//表演
    public synchronized void play(String voice){
    if (!flag){
        try{this.wait();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    System.out.println("演员表演了" + voice);
    //通知观众观看
    this.notifyAll();
    this.voice= voice ;
    this.flag = !this.flag;//标志位取反

}
//观看
    public synchronized void watch(){
        if(flag){
            try{
                this.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("观众观看了" + voice);
        //通知演员表演
        this.notifyAll();
        this.flag=!this.flag;
    }

}


