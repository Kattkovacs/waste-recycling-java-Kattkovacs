package com.codecool.wasterecycling;

public class PlasticGarbage extends Garbage {
        private boolean clean;

        public PlasticGarbage(String name, boolean clean) {
                super(name);
                this.clean = clean;
        }

        public boolean isClean() {
                return clean;
        }

        public void clean(){
                this.clean = true;
        }
}
