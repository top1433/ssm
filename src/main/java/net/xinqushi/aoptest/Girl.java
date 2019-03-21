package net.xinqushi.aoptest;

public class Girl {
    public void dance(String string){
        System.out.println(this.getClass().getSimpleName()+"在跳舞");
    }

    public void sleep(String string){
        System.out.println(this.getClass().getSimpleName()+"在睡觉");
    }
}
