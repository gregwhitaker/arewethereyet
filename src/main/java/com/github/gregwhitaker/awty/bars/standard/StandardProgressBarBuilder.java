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
