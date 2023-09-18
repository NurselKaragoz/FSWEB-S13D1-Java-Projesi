

public class Main

{
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(shouldWakeUp(true,1));
    }

    public static boolean shouldWakeUp(boolean x, int time) {
 if (time <0 ||  time >23) return false;
 if(!x) return false;
 return time <8 || time >= 20;
    }



}

