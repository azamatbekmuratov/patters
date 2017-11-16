package kz.bekmuratov.patters.creational.singleton.singleThread;

public class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value){
        //Этот код эмулирует медленную инициализацию.
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value){
        if(instance == null){
            instance = new Singleton(value);
        }
        return instance;
    }
}
