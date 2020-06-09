package com.codecool.wasterecycling;

import java.awt.print.Paper;

public class Main {

    public static void main(String[] args) {
            Dustbin myBin = new Dustbin("Red");
            Garbage lettuce = new Garbage("Half-eaten lettuce");
            PlasticGarbage foil = new PlasticGarbage("Wrapper foil", true);
            PaperGarbage exam = new PaperGarbage("Failed exam", true);
            myBin.throwOutGarbage(lettuce);
            myBin.throwOutGarbage(foil);
            myBin.throwOutGarbage(exam);
            myBin.displayContents();
            myBin.emptyContents();
            myBin.displayContents();
            PlasticGarbage dirtyFoil = new PlasticGarbage("Dirty wrapper foil", false);
            myBin.throwOutGarbage(dirtyFoil);
            myBin.displayContents();
            dirtyFoil.clean();
            myBin.throwOutGarbage(dirtyFoil);
            myBin.displayContents();

    }
}
