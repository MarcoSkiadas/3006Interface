package org.example;


public class MediaController implements Playable {

    @Override
    public void play() {
    }
    public void playMedia(Playable media) {
        media.play();
    }
}
