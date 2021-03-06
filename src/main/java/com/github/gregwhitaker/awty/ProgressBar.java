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

package com.github.gregwhitaker.awty;

/**
 * Interface that all progress bars must implement.
 */
public interface ProgressBar {

    /**
     * @return the percentage setting of the progress bar.
     */
    float getPercentage();

    /**
     * Updates the percentage setting of the progress bar.
     *
     * @param percentage percentage to set
     */
    void update(float percentage);

    /**
     * Updates the percentage setting of the progress bar.
     *
     * @param percentage percentage to set
     */
    void update(int percentage);

    /**
     * Updates the percentage setting of the progress bar.
     *
     * @param percentage percentage to set
     */
    void update(double percentage);

    /**
     * Renders the progress bar to the terminal.
     */
    void render();

    /**
     * @return the string representation of the progress bar
     */
    String toString();

}
