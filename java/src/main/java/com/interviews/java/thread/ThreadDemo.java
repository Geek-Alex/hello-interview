package com.interviews.java.thread;

/**
 * 线程学习Demo
 *
 * @Author shenjg
 * @Date 2020/8/22 3:38 下午
 **/
public class ThreadDemo {

    public static void main(String[] args) {
        // 使用两种方式创建线程
        ThreadExtends threadExtends = new ThreadExtends();
        threadExtends.start();

        //为了使线程能够执行run()方法，需要在Thread类的构造函数中传入 ThreadImpl 的实例对象
        Thread thread = new Thread(new ThreadImpl());
        thread.start();
    }

    /**
     * 创建Thread子类的一个实例并重写run方法
     */
    public static class ThreadExtends extends Thread {
        @Override
        public void run() {
            System.out.println("继承Thread的线程" + Thread.currentThread().getName() + "启动了。。。。");
        }
    }

    /**
     * 创建类的时候实现Runnable接口
     */
    public static class ThreadImpl implements Runnable {
        public void run() {
            System.out.println("实现Runnable的线程" + Thread.currentThread().getName() + "启动了。。。。");
        }
    }

}
