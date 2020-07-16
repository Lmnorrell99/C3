package com.codechallenge;

public class HelloWorldFactory extends MessageFactory{


    public HelloWorldFactory(){

    }



    private String generateMessage(int SEED){
        String output = "Hello world";
        char[] result = new char[output.length()];
        for(int i = 0; i<output.length(); i++){
            char c = (char) (Math.random() * 255);
            String isMatching = "false";
            while(!Boolean.parseBoolean(isMatching)){
                if(i == 0 && c == 'H'){
                    isMatching = Boolean.toString(true);
                }
                else if(i == 1 && c == 'e'){
                    isMatching = Boolean.toString(true);
                }
                else if(i == 2 && c == 'l'){
                    isMatching = Boolean.toString(true);
                }
                else if(i == 3 && c == 'l'){
                    isMatching = Boolean.toString(true);
                }
                else if(i == 4 && c == 'o') {
                    isMatching = Boolean.toString(true);
                }
                else if(i == 5 && c == ' '){
                    isMatching = Boolean.toString(true);
                }
                else if(i == 6 && c == 'w'){
                    isMatching = Boolean.toString(true);
                }
                else if(i == 7 && c == 'o'){
                    isMatching = Boolean.toString(true);
                }
                else if(i == 8 && c == 'r'){
                    isMatching = Boolean.toString(true);
                }
                else if(i == 9 && c == 'l'){
                    isMatching = Boolean.toString(true);
                }
                else if(i == 10 && c == 'd'){
                    isMatching = Boolean.toString(true);
                }
                if (!Boolean.parseBoolean(isMatching)){
                    c = (char) (Math.random() * 255);
                }
            }
            result[i] = c;
        }
        return String.valueOf(result);
    }
}
