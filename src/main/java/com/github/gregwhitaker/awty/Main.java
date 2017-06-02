package com.github.gregwhitaker.awty;

import com.github.gregwhitaker.awty.bars.ProgressBarBuilder;

public class Main {

    public static void main(String... args) throws Exception {
        ProgressBar bar = ProgressBarBuilder.standardProgressBar()
                .width(10)
                .showPercentage()
                .build();

        bar.update(10.1f);

        System.out.print(bar.render());

        Thread.sleep(1000);

        bar.update(33.0f);

        System.out.print(bar.render());

        Thread.sleep(1000);

        bar.update(100f);

        System.out.print(bar.render());
    }

}
