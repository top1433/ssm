package net.xinqushi.aoptest;

public class Boy {
    public void play(String string){
        System.out.println(this.getClass().getSimpleName()+"打游戏");
    }

    public void sleep(String string){
        System.out.println(this.getClass().getSimpleName()+"在睡觉");
    }
}
