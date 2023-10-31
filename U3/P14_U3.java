package com.mycompany.p14_u3;

public class P14_U3 {

    public static void main(String[] args) {
        int R;
        
        for(int i = 1; i <= 100; i++){
            R = i % 2;
            
            if(R == 0){
                System.out.println(i);
            }
        }
    }
}
