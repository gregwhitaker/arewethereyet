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

import com.github.gregwhitaker.awty.ProgressBar;

/**
 *
 */
public abstract class BaseProgressBar implements ProgressBar {

    // Configuration
    protected final int width;
    protected final float maximumPercentage;
    protected final char endcapCharacter;
    protected final char completeStepCharacter;
    protected final char incompleteStepCharacter;
    private final float stepSize;

    // Runtime
    protected volatile float percentage = 0f;

    BaseProgressBar(int width,
                    float maximumPercentage,
                    char endcapCharacter,
                    char completeStepCharacter,
                    char incompleteStepCharacter) {
        this.width = width;
        this.maximumPercentage = maximumPercentage;
        this.endcapCharacter = endcapCharacter;
        this.completeStepCharacter = completeStepCharacter;
        this.incompleteStepCharacter = incompleteStepCharacter;
        this.stepSize = calculateStepSize();
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
    public void update(int percentage) {
        this.percentage = percentage;
    }

    @Override
    public void update(double percentage) {
        this.percentage = (float) percentage;
    }

    @Override
    public void render() {
        System.out.print(toString());
    }

    protected float getMaximumPercentage() {
        return maximumPercentage;
    }

    protected float getStepSize() {
        return stepSize;
    }

    private float calculateStepSize() {
        return getMaximumPercentage() / width;
    }

}
