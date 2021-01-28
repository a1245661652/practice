package threadtest;

/**
 * @author wu
 * @version 1.0
 * @date 2021/1/26
 * 生产者消费者模型-->利用缓冲区解决：管程法
 * 生产者 ， 消费者 ， 产品 ， 缓冲区
 */
public class TestPC {
    public static void main(String[] args) {
        SynContainer container = new SynContainer();
        new Producter(container).start();
        new Consumer(container).start();
    }

}


/**
 * 生产者
 */
class Producter extends Thread {
    SynContainer container;
    public Producter(SynContainer container){
        this.container = container ;
    }
//生产
    @Override
    public void run(){
        for (int i = 0; i <1000 ; i++) {

            container.push(new Chicken(i));
            System.out.println("生产了"+i+"只鸡");
        }
    }
}


/**
 * 消费者
 */
class Consumer extends Thread {
    SynContainer container ;
    public Consumer(SynContainer container){
        this.container=container;

    }
    @Override
    public void run(){
        for(int i = 0 ; i<1000 ;i++){

            System.out.println("消费了-->"+container.POP().id+"只鸡");
        }
    }

}



/**
 * 产品
 */

class Chicken {

    //编号
    int id ;
    public Chicken(int id){
        this.id = id;
    }
}


class SynContainer{

    //需要一个容器大小
    Chicken[] chickens = new Chicken[10];

    //容器计数器
    int count = 0;

    //生产者放入产品
    public synchronized void push(Chicken chicken) {

        //如果容器满了，就需要等待消费者消费
        if(count == chickens.length){
            try {
                //生产者等待
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //如果没有满，我们就需要丢入产品
        chickens[count] = chicken;
        count++;


        //可以通知消费者消费了.
        this.notifyAll();

    }

    //消费者消费产品
    public synchronized Chicken POP(){
      //判断是否能消费
      if(count == 0){
          //消费者等待
          try{
              this.wait();
          }catch(InterruptedException e){
              e.printStackTrace();
          }

      }
      //如果可以消费
      count--;
      Chicken chicken = chickens [count];
      //吃完了,通知生产者生产
        this.notifyAll();
        return chicken;

    }





}

























