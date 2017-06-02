package com.github.gregwhitaker.awty;

public interface ProgressBar {

    float getPercentage();

    void update(float percentage);

    void render();

}
