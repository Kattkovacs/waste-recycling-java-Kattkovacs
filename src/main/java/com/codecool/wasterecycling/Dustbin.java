package com.codecool.wasterecycling;

import java.util.ArrayList;

public class Dustbin {
        private final String color;
        private final ArrayList<Garbage> bin;

        public Dustbin(String color) {
                this.color = color;
                bin = new ArrayList<>();
        }

        public String getColor() {
                return color;
        }

        public void throwOutGarbage(Garbage garbage){
                   try {
                           if (garbage instanceof PaperGarbage &&
                                   !((PaperGarbage) garbage).isSueezed()) throw new DustbinContentException();
                           if (garbage instanceof PlasticGarbage &&
                                   !((PlasticGarbage) garbage).isClean()) throw new DustbinContentException();
                   } catch (DustbinContentException e){
                           System.out.println("Clean and squeeze your garbage!");
                           return;
                   }
                   bin.add(garbage);
        }

        public int getHouseWasteCount(){
                int count = 0;
                for (Garbage garbage: bin){
                        if (!(garbage instanceof PaperGarbage) &&
                                !(garbage instanceof PlasticGarbage)){
                                        count++;
                        }
                }
                return count;
        }

        public int getPaperCount(){
                int count = 0;
                for (Garbage garbage: bin){
                        if (garbage instanceof PaperGarbage){
                                count++;
                        }
                }
                return count;
        }

        public int getPlasticCount(){
                int count = 0;
                for (Garbage garbage: bin){
                        if (garbage instanceof PlasticGarbage){
                                count++;
                        }
                }
                return count;
        }

        public void emptyContents(){
                bin.clear();
        }

        @Override
        public String toString() {
                StringBuilder builder = new StringBuilder();
                builder.append(getColor()).append(" Dustbin!\n");
                builder.append("House waste content: " +
                        getHouseWasteCount() + " item(s)\n");
                int counter = 0;
                for (Garbage garbage: bin){
                        if (!(garbage instanceof PaperGarbage) &&
                                !(garbage instanceof PlasticGarbage)){
                                builder.append(garbage.getName()   +
                                        " nr.").append(++counter).append("\n");
                        }
                }
                builder.append("Paper content: " +
                        getPaperCount() + " item(s)\n");
                counter = 0;
                for (Garbage garbage: bin){
                        if (garbage instanceof PaperGarbage){
                                builder.append(garbage.getName()   +
                                        " nr.").append(++counter).append("\n");
                        }
                }
                builder.append("Plastic content: " +
                        getPlasticCount() + " item(s)\n");
                counter = 0;
                for (Garbage garbage: bin){
                        if (garbage instanceof PlasticGarbage){
                                builder.append(garbage.getName()   +
                                        " nr.").append(++counter).append("\n");
                        }
                }
                return builder.toString();



        }

        public void displayContents(){
                System.out.println(this);
        }
}
