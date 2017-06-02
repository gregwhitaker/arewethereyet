package com.github.gregwhitaker.awty.bars.standard;

import com.github.gregwhitaker.awty.ProgressBar;

public class StandardProgressBar implements ProgressBar {

    //Configuration
    private final int width;
    private final String endcap;
    private final char incompleteCharacter;
    private final char completeCharacter;
    private final boolean showPercentage;
    private final float stepSize;

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
        this.stepSize = calculateStepSize(width);
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
        StringBuilder builder = new StringBuilder(width * 2);
        builder.append(endcap);
        builder.append(endcap);

        if (showPercentage) {
            builder.append(" ");
            builder.append(getPercentage());
            builder.append("%");
        }

        return builder.toString();
    }

    private float calculateStepSize(int width) {
        return 100f / width;
    }
}
