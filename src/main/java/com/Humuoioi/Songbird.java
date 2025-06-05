package com.Humuoioi;

import com.birdbrain.Finch;

public class Songbird extends Finch {
    private int cSharp = NoteCreator.findNote("C#");
    private int c = NoteCreator.findNote("C");
    private int gSharp = NoteCreator.findNote("G#");
    private int aSharp = NoteCreator.findNote("A#");
    private int dSharp = NoteCreator.findNote("D");
    private int d = NoteCreator.findNote("D#");
    private int eSharp = NoteCreator.findNote("E");
    private int fSharp = NoteCreator.findNote("F#");
    private int areC = NoteCreator.findNote("C#", 60);

    public void segment1() {
    // Twinkle
        playNote(cSharp, .5);
        pause(1);

        playNote(cSharp, .5);
        pause(1);

    //Twinkle
        playNote(gSharp, .5);
        pause(1);

        playNote(gSharp, .5);
        pause(1);
    // Little
        playNote(aSharp, .5);
        pause(1);

        playNote(aSharp, .5);
        pause(1.0);

    // Star
        playNote(gSharp, 1);
        pause(1.5);
    }


// Segment 2
    // How I
        bird.playNote(fSharp, .5);
        bird.pause(1);

        bird.playNote(fSharp, .5);
        bird.pause(1);

    // wonder
        bird.playNote(eSharp, .5);
        bird.pause(1);

        bird.playNote(eSharp, .5);
        bird.pause(1.0);

    // What you
        bird.playNote(dSharp, .5);
        bird.pause(1);

        bird.playNote(dSharp, .5);
        bird.pause(1.0);

    // are
        bird.playNote(areC, .8);
        bird.pause(1.5);

//Segment 3
    // up above the
        bird.playNote(gSharp, .5);
        bird.pause(1.0);
        bird.playNote(gSharp, .5);
        bird.pause(1.0);

        bird.playNote(fSharp, .5);
        bird.pause(1);

        bird.playNote(fSharp, .5);
        bird.pause(1);

    // world so high
        bird.playNote(eSharp, .5);
        bird.pause(1);

        bird.playNote(eSharp, .5);
        bird.pause(1.0);

        bird.playNote(dSharp, .5);
        bird.pause(1);

//Segment 4
    // like a diamond
        bird.playNote(gSharp, .5);
        bird.pause(1.0);
        bird.playNote(gSharp, .5);
        bird.pause(1.0);

        bird.playNote(fSharp, .5);
        bird.pause(1);

        bird.playNote(fSharp, .5);
        bird.pause(1);

    // in the sky
        bird.playNote(eSharp, .5);
        bird.pause(1);

        bird.playNote(eSharp, .5);
        bird.pause(1.0);

        bird.playNote(dSharp, .5);
        bird.pause(1);

//Segment 5
    // Twinkle
        bird.playNote(cSharp, .5);
        bird.pause(1);

        bird.playNote(cSharp, .5);
        bird.pause(1);

    //Twinkle
        bird.playNote(gSharp, .5);
        bird.pause(1);

        bird.playNote(gSharp, .5);
        bird.pause(1);
    // Little
        bird.playNote(aSharp, .5);
        bird.pause(1);

        bird.playNote(aSharp, .5);
        bird.pause(1.0);

    // Star
        bird.playNote(gSharp, 1);
        bird.pause(1.5);

//Segment 6
    // How I
        bird.playNote(fSharp, .5);
        bird.pause(1);

        bird.playNote(fSharp, .5);
        bird.pause(1);

    // wonder
        bird.playNote(eSharp, .5);
        bird.pause(1);

        bird.playNote(eSharp, .5);
        bird.pause(1.0);

    // What you
        bird.playNote(d, .5);
        bird.pause(1);

        bird.playNote(d, .5);
        bird.pause(1.0);

    // are
        bird.playNote(areC, .8);
        bird.pause(1.5);

}