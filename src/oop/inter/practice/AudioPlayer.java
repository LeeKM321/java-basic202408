package oop.inter.practice;

public class AudioPlayer implements MediaPlayable {
    @Override
    public void play() {
        System.out.println("오디오가 재생됩니다.");
    }

    @Override
    public void pause() {
        System.out.println("오디오가 일시정지 됩니다.");
    }

    @Override
    public void stop() {
        System.out.println("오디오가 정지됩니다.");
    }
}
