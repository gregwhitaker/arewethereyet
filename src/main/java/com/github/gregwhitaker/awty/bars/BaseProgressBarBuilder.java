package com.github.gregwhitaker.awty.bars;

public abstract class BaseProgressBarBuilder {
    private static final int MINIMUM_WIDTH = 1;
    private static final int DEFAULT_WIDTH = 20;

    protected int width = DEFAULT_WIDTH;
    protected Character endcapStepCharacter = '|';
    protected Character completeStepCharacter = '*';
    protected Character incompleteStepCharacter = '-';

    /**
     * Sets the width of the progress bar in characters.
     *
     * @param width the width of the progress bar in the number of characters
     * @return {@link BaseProgressBarBuilder}
     */
    public BaseProgressBarBuilder withWidth(int width) {
        if (width <= 0) {
            this.width = MINIMUM_WIDTH;
        } else {
            this.width = width;
        }

        return this;
    }

    /**
     * Sets the character to use as the endcap of the progress bar.
     *
     * @param endcapStepCharacter a string to use as the endcap of the progress bar
     * @return {@link BaseProgressBarBuilder}
     */
    public BaseProgressBarBuilder withEndCapStepCharacter(char endcapStepCharacter) {
        this.endcapStepCharacter = endcapStepCharacter;
        return this;
    }

    /**
     * Sets the character to use for completed steps on the progress bar.
     *
     * @param completeStepCharacter character to use for completed steps
     * @return {@link BaseProgressBarBuilder}
     */
    public BaseProgressBarBuilder withCompleteStepCharacter(char completeStepCharacter) {
        this.completeStepCharacter = completeStepCharacter;
        return this;
    }

    /**
     * Sets the character to use for uncompleted steps on the progress bar.
     *
     * @param incompleteStepCharacter character to use for uncompleted steps
     * @return {@link BaseProgressBarBuilder}
     */
    public BaseProgressBarBuilder withIncompleteCharacter(char incompleteStepCharacter) {
        this.incompleteStepCharacter = incompleteStepCharacter;
        return this;
    }

}
