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
 * Standard progress bar implementation.
 *
 * Creates a progress bar with the format:
 *
 *  |****------| 40.0%
 */
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
    public void render() {
        System.out.print(toString());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(width * 2);
        builder.append(endcap);

        int numCompleteCharacters = (int)(getPercentage() / stepSize);

        for (int i = 1; i <= width; i++) {
            if (i <= numCompleteCharacters) {
                builder.append(completeCharacter);
            } else {
                builder.append(incompleteCharacter);
            }
        }

        builder.append(endcap);

        if (showPercentage) {
            builder.append(" ");
            builder.append(getPercentage());
            builder.append("%");
        }

        builder.append("\r");

        return builder.toString();
    }

    private float calculateStepSize(int width) {
        return 100f / width;
    }
}
