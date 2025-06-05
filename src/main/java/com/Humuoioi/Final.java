package com.Humuoioi;

import com.birdbrain.Finch;

public class Final {
    public static void main(String[] args){
        Songbird bird = new Songbird();

        bird.segment1();
        bird.segment2();
        bird.segment3();
        bird.segment4();
        bird.segment1();
        bird.segment2();

        bird.stopAll();
        bird.disconnect();
    }

}