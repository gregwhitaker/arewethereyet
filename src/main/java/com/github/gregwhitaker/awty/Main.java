package com.github.gregwhitaker.awty;

import com.github.gregwhitaker.awty.bars.ProgressBarBuilder;

public class Main {

    public static void main(String... args) {
        ProgressBar bar = ProgressBarBuilder.standardProgressBar()
                .width(10)
                .showPercentage()
                .build();

        bar.update(10.1f);

        System.out.println(bar.render());

        bar.update(33.0f);

        System.out.println(bar.render());

        bar.update(100f);

        System.out.println(bar.render());
    }

}
