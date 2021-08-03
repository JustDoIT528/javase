package com.lmgzxh.javase.threadsafe;

public class AccountThread extends Thread{
    //两个线程必须共享同一个账户对象
    private Account act;

    //通过构造方法来传递过来账户对象

    public AccountThread(Account act){
        this.act = act;
    }

    public void run() {
        //run方法的执行表示取款操作
        //假设取款5000
        double money = 5000;
        //取款
        act.withdrew(money);
        System.out.println(Thread.currentThread().getName()+"对账户"+act.getActno()+"取款"+money+"成功，余额"+act.getBalance());
    }
}