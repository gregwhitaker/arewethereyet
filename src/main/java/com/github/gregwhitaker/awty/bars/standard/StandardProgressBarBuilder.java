package com.github.gregwhitaker.awty.bars.standard;

import com.github.gregwhitaker.awty.ProgressBar;

public class StandardProgressBarBuilder {
    private static final int MINIMUM_WIDTH = 1;

    private int width = 10;
    private boolean showPercentage = false;
    private String endcap = "|";
    private Character completeCharacter = '*';
    private Character incompleteCharacter = '-';

    public StandardProgressBarBuilder width(int width) {
        if (width <= 0) {
            this.width = MINIMUM_WIDTH;
        } else {
            this.width = width;
        }

        return this;
    }

    public StandardProgressBarBuilder showPercentage() {
        this.showPercentage = true;
        return this;
    }

    public StandardProgressBarBuilder endcap(String endcap) {
        this.endcap = endcap;
        return this;
    }

    public StandardProgressBarBuilder completeCharacter(char completeCharacter) {
        this.completeCharacter = completeCharacter;
        return this;
    }

    public StandardProgressBarBuilder incompleteCharacter(char incompleteCharacter) {
        this.incompleteCharacter = incompleteCharacter;
        return this;
    }

    public ProgressBar build() {
        return new StandardProgressBar(width,
                endcap,
                incompleteCharacter,
                completeCharacter,
                showPercentage);
    }
}
