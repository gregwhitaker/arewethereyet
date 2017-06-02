/*
 * Copyright 2017 Greg Whitaker
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.gregwhitaker.awty.bars.standard;

import com.github.gregwhitaker.awty.ProgressBar;

/**
 * Builder responsible for creating {@link StandardProgressBar} instances.
 */
public class StandardProgressBarBuilder {
    private static final int MINIMUM_WIDTH = 1;

    private int width = 10;
    private boolean showPercentage = false;
    private String endcap = "|";
    private Character completeCharacter = '*';
    private Character incompleteCharacter = '-';

    /**
     * Sets the width of the progress bar in number of characters.
     *
     * @param width number of characters to make the width of the progress bar.
     * @return {@link StandardProgressBarBuilder}
     */
    public StandardProgressBarBuilder width(int width) {
        if (width <= 0) {
            this.width = MINIMUM_WIDTH;
        } else {
            this.width = width;
        }

        return this;
    }

    /**
     * Shows the percentage complete at the end of the progress bar.
     *
     * @return {@link StandardProgressBarBuilder}
     */
    public StandardProgressBarBuilder showPercentage() {
        this.showPercentage = true;
        return this;
    }

    /**
     * Sets the string to use as the endcap of the progress bar.
     *
     * @param endcap a string to use as the endcap of the progress bar
     * @return {@link StandardProgressBarBuilder}
     */
    public StandardProgressBarBuilder endcap(String endcap) {
        this.endcap = endcap;
        return this;
    }

    /**
     * Sets the character to use for completed steps on the progress bar.
     *
     * @param completeCharacter character to use for completed steps
     * @return {@link StandardProgressBarBuilder}
     */
    public StandardProgressBarBuilder completeCharacter(char completeCharacter) {
        this.completeCharacter = completeCharacter;
        return this;
    }

    /**
     * Sets the character to use for uncompleted steps on the progress bar.
     *
     * @param incompleteCharacter character to use for uncompleted steps
     * @return {@link StandardProgressBarBuilder}
     */
    public StandardProgressBarBuilder incompleteCharacter(char incompleteCharacter) {
        this.incompleteCharacter = incompleteCharacter;
        return this;
    }

    /**
     * Builds a {@link StandardProgressBar} instance based on the configuration
     * of the builder.
     *
     * @return a {@link StandardProgressBar}
     */
    public ProgressBar build() {
        return new StandardProgressBar(width,
                endcap,
                incompleteCharacter,
                completeCharacter,
                showPercentage);
    }
    
}
