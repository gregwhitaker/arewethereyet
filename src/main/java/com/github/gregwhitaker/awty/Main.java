package com.github.gregwhitaker.awty;

import com.github.gregwhitaker.awty.bars.Awty;

public class Main {

    public static void main(String... args) throws Exception {
        ProgressBar bar = Awty.standardProgressBar()
                .withWidth(10)
                .showPercentage()
                .build();

        bar.update(10.1f);

        bar.render();

        Thread.sleep(1000);

        bar.update(33.0f);

        bar.render();

        Thread.sleep(1000);

        bar.update(100f);

        bar.render();

        Thread.sleep(3000);

        System.out.println();
    }

}
