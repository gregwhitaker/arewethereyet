package com.github.gregwhitaker.awty.bars.standard;

import com.github.gregwhitaker.awty.ProgressBar;

public class StandardProgressBarBuilder {
    private final int DEFAULT_WIDTH = 10;

    private int width = DEFAULT_WIDTH;

    public StandardProgressBarBuilder width(int width) {
        this.width = width;
        return this;
    }

    public ProgressBar build() {
        return new StandardProgressBar();
    }
}
