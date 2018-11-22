package com.hava.eigth.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppTest {
    private static final Logger log  = LoggerFactory.getLogger(TestApplication.class);

    public static void main(String [] args){
        System.out.println("xxx");

        log.info("CALTEST => " + calTest(6,1,0));

    }

    public static void runtest(int n, int sf){
        for (int j=0;j<n;j++){
            calTest(sf,j,j+1);
        }
    }
/* 2
* 0,1,2,3,4,5,6
* 1 1
*  1 2
*  1 +1
* */
    public static int calTest(int sf, int iv,int jv ){
        int s = 0; int cont = 0;
        int sumRoll [] = new int[100];
        sumRoll[0] = 1;

        for (int i= 0; i < sf ;i++){
            for(int j = 1;j < i;j++){
                sumRoll[j] = sumRoll[j-1] + j;
                while(sumRoll[j] <= sf ) {
                    sumRoll[j] += j;
                }
                /*
                if(sumRoll[i] <= sf){
                    if(sumRoll[i] == sf)
                        cont++;
                    calTest(sf,i,j);
                }else if(s > sf){
                    return cont;
                }
                */
            }
        }
        return s;
    }
}
