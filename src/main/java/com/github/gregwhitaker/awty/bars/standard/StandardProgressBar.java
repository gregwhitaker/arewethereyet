package com.github.gregwhitaker.awty.bars.standard;

import com.github.gregwhitaker.awty.ProgressBar;

public class StandardProgressBar implements ProgressBar {

    //Configuration
    private final int width;
    private final String endcap;
    private final char incompleteCharacter;
    private final char completeCharacter;
    private final boolean showPercentage;

    // Runtime
    private float percentage = 0;

    StandardProgressBar(int width,
                        String endcap,
                        char incompleteCharacter,
                        char completeCharacter,
                        boolean showPercentage) {
        this.width = width;
        this.endcap = endcap;
        this.incompleteCharacter = incompleteCharacter;
        this.completeCharacter = completeCharacter;
        this.showPercentage = showPercentage;
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
