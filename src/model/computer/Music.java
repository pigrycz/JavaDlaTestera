package model.computer;

public interface Music {

//    tylko stałe, które są zawsze public final static
    String NAME = "MUSIC";

//    tylko metody abstrakcyjne, zawsze public i abstract
    void playMusic();
    void pauseMusic();
    void stopMusic();

    default void sayHelloFromMusic() {
        System.out.println("Hello from default");
    }

    static String getName(){
        privateMusic();
        return NAME;
    }

    private static void privateMusic(){
        System.out.println("Hello from private method");
    }

}
