package model.computer;

public interface Video {
    void playVideo();
    void pauseVideo();
    void stopVideo();

    default void sayHelloFromVideo(){
        System.out.println("Hello from video");
    }
}
