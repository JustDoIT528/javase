package com.lmgzxh.javase.threadsafe;

/*
* 银行账户
*   不同线程同步机制，多线程对同一个账户进行取款，出现线程安全问题。
* */
public class Account {
    //账号
    private String actno;
    //余额
    private double balance;

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    //取款的方法
    public void withdrew(double money){
        //t1和t2并发这个方法（t1和t2是两个栈。两个栈操作堆中同一个对象）
        //取款之前的余额
        double before = this.getBalance();

        //取款之后余额
        double after = before - money;

        //更新余额
        // t1执行到这里，但还没来得及执行这段代码，t2线程进来withdrew方法
        // ，此时一定出问题
        try {
            //模拟网络延迟
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setBalance(after);
    }
}
