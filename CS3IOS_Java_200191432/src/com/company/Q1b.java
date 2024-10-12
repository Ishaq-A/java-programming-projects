package com.company;

public class Q1b {

    public static int period(int sh, int sm, int eh, int em){

        if(sm>em){

            em+=60;

            if(sh>eh){
                sh-=12;
            }

            int totalH = eh-sh-1;

            int totalM = (em-sm);

            int finalM = (totalH*60)+totalM;

            return finalM;

        }else {

            if (sh>eh) {
                sh-=12;
            }

            int totalH = eh-sh;

            int totalM = (em-sm);

            int finalM = (totalH*60)+totalM;

            return finalM;

        }
    }
}
