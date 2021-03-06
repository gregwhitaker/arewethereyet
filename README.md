# Are we there yet?
[![Build Status](https://travis-ci.org/gregwhitaker/arewethereyet.svg?branch=master)](https://travis-ci.org/gregwhitaker/arewethereyet)

A simple utility for creating progress bars in command line applications.

![Simpsons](/docs/images/simpsons.gif)

## Usage

    // Create the progress bar
    ProgressBar bar = Awty.standardProgressBar()
            .withWidth(10)
            .showPercentage()
            .build();

    // Update progress
    bar.update(10.1f);

    // Render the progress bar to the terminal
    bar.render();

## Bugs and Feedback

For bugs, questions and discussions please use the [Github Issues](https://github.com/gregwhitaker/arewethereyet/issues).

## License
Copyright 2017 Greg Whitaker

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
