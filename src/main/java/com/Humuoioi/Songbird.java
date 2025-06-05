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

public void segment2(){
 // How I
        playNote(fSharp, .5);
        pause(1);

        playNote(fSharp, .5);
        pause(1);

    // wonder
        playNote(eSharp, .5);
        pause(1);

        playNote(eSharp, .5);
        pause(1.0);

    // What you
        playNote(dSharp, .5);
        pause(1);

        playNote(dSharp, .5);
        pause(1.0);

    // are
        playNote(areC, .8);
        pause(1.5);
}
    public void segment3(){
    // up above the
        playNote(gSharp, .5);
        pause(1.0);
        playNote(gSharp, .5);
        pause(1.0);

        playNote(fSharp, .5);
        pause(1);

        playNote(fSharp, .5);
        pause(1);

    // world so high
        playNote(eSharp, .5);
        pause(1);

        playNote(eSharp, .5);
        pause(1.0);

        playNote(dSharp, .5);
        pause(1);

    }
public void segment4(){
    // like a diamond
        playNote(gSharp, .5);
        pause(1.0);
        playNote(gSharp, .5);
        pause(1.0);

        playNote(fSharp, .5);
        pause(1);

        playNote(fSharp, .5);
        pause(1);

    // in the sky
        playNote(eSharp, .5);
        pause(1);

        playNote(eSharp, .5);
        pause(1.0);

        playNote(dSharp, .5);
        pause(1);
}

}