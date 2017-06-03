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

package com.github.gregwhitaker.awty.bars;

/**
 * Standard progress bar implementation.
 *
 * Creates a progress bar with the format:
 *
 *  |****----------------| 20.0%
 */
public final class StandardProgressBar extends BaseProgressBar {

    private boolean showPercentage = false;

    StandardProgressBar(int width,
                        Character endcapCharacter,
                        Character incompleteCharacter,
                        Character completeCharacter,
                        boolean showPercentage) {
        super(width,
                100f,
                endcapCharacter,
                completeCharacter,
                incompleteCharacter);

        this.showPercentage = showPercentage;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(width * 2);

        builder.append(endcapCharacter);

        int numCompleteCharacters = (int)(getPercentage() / getStepSize());

        for (int i = 1; i <= width; i++) {
            if (i <= numCompleteCharacters) {
                builder.append(completeStepCharacter);
            } else {
                builder.append(incompleteStepCharacter);
            }
        }

        builder.append(endcapCharacter);

        if (showPercentage) {
            builder.append(" ");
            builder.append(getPercentage());
            builder.append("%");
        }

        builder.append("\r");

        return builder.toString();
    }

}
