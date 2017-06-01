package com.github.gregwhitaker.awty.bars;

import com.github.gregwhitaker.awty.bars.standard.StandardProgressBarBuilder;

public final class ProgressBarBuilder {

    private ProgressBarBuilder() {
        // prevent direct instantiation
    }

    public static StandardProgressBarBuilder standardProgressBar() {
        return new StandardProgressBarBuilder();
    }

}
