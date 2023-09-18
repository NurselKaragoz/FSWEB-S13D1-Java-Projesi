

public class Main

{
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(shouldWakeUp(true,1));
        System.out.println(hasTeen(26,25,32));
        System.out.println( isCatPlaying(true,56));
    }

    public static boolean shouldWakeUp(boolean x, int time) {
 if (time <0 ||  time >23) return false;
 if(!x) return false;
 return time <8 || time >= 20;
    }
public static boolean hasTeen( int firstAge, int secondAge,int thirdAge){
        return (firstAge >=13 && firstAge<=19)||
                (secondAge >=13 && secondAge<=19)||
                (thirdAge >=13 && thirdAge<=19);


}
public static boolean isCatPlaying(boolean yaz, int temp){
    if(!yaz) return (temp>25 && temp<=35);
    else return (temp>25 && temp <= 45);


}



}

