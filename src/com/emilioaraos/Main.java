package com.emilioaraos;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if (value== 10){
            System.out.println("Value is 10");
        }else if(value== 2){
            System.out.println("Value is 2");
        }else{
            System.out.println("Value was not 10 nor 2");
        }




        int switchValue = 7;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
                System.out.println("Value was 3");
                break;

            case 4:
                System.out.println("Value was 4");
                break;

            case 5:
                System.out.println("Value was 5");
                break;

            case 6: case 7: case 8:
                System.out.println("Was case 6, or case 7, or case 8");
                break;

            default:

                System.out.println("Values was not found");
                break;
        }
//more code here after the break
        char letra = 'j';
        switch(letra){
            case 'j':
                System.out.println("It was Char j");
                break;
            case't':
                System.out.println("It was Char t");
                break;
            case'o':
                System.out.println("It was Char 3");
                break;
            case 'U':
                System.out.println("It was Char U");
                break;
            default:
                System.out.println("Char was not found");
                break;
        }



    }



}
