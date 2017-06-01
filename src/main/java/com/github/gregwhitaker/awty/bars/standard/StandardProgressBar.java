package com.github.gregwhitaker.awty.bars.standard;

import com.github.gregwhitaker.awty.ProgressBar;

public class StandardProgressBar implements ProgressBar {

    private float percentage = 0;

    StandardProgressBar() {

    }

    @Override
    public float getPercentage() {
        return percentage;
    }

    @Override
    public void update(float percentage) {
        this.percentage = percentage;
    }

    @Override
    public String render() {
        return "|*****------|";
    }

}
