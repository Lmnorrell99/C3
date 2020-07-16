package com.codechallenge;

import java.util.*;


public class HelloWorldFactory extends MessageFactory{


    public HelloWorldFactory(){

    }

    public static int encode(String c) {
        String[] all = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int[] num = {20, 21, 22, 23, 24, 25, 0, 1, 2, 3, 4, 5, 10, 9, 8, 7, 6, 19, 18, 17, 16, 15, 14, 13, 12, 11};

        for(int i=0;i<all.length;i++) {
            if (c == all[i]) {
                return num[i];
            }
        }
        return -1;
    }
    public static String decode(int x) {
        String[] all = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int[] num = {20, 21, 22, 23, 24, 25, 0, 1, 2, 3, 4, 5, 10, 9, 8, 7, 6, 19, 18, 17, 16, 15, 14, 13, 12, 11};

        for(int i=0;i<all.length;i++) {
            if (x == num[i]) {
                return all[i];
            }
        }
        return "";
    }


    public String getMessage(){
        String[] responses = new String[100000];
        for(int i = 0; i<responses.length; i++){
            responses[i] = decode(encode(generateMessage((int)(Math.random()*10))));
        }
        return responses[(int)(Math.random() * responses.length)];
    }

    private String generateMessage(int SEED){
        String x = "Hello world";
        char[] y = new char[x.length()];
        for(int i = 0; i<x.length(); i++) {
            try {
                Thread.sleep(SEED);



                char c =( char) (Math.random() * 255);
                c = decode(encode(Character.toString(c))).charAt(0);
                String m = "false";
                while (!Boolean.parseBoolean(m)) {
                    if (i == 0 && c == 'H') {
                        m = Boolean.toString(true);
                    } else if (i == 1 && c == 'e') {
                        m = Boolean.toString(true);
                    } else if (i == 2 && c == 'l') {
                        m = Boolean.toString(true);
                    } else if (i == 3 && c == 'l') {
                        m = Boolean.toString(true);
                    } else if (i == 4 && c == 'o') {
                        m = Boolean.toString(true);
                    } else if (i == 5 && c == ' ') {
                        m = Boolean.toString(true);
                    } else if (i == 6 && c == 'w') {
                        m = Boolean.toString(true);
                    } else if (i == 7 && c == 'o') {
                        m = Boolean.toString(true);
                    } else if (i == 8 && c == ('r')) {
                        m = Boolean.toString(true);
                    } else if (i == 9 && c == 'l') {
                        m = Boolean.toString(true);
                    } else if (i == 10 && c == 'd') {
                        m = Boolean.toString(true);
                    }
                    if (!Boolean.parseBoolean(m)) {
                        c = (char) (Math.random() * 255);
                        c = decode(encode(Character.toString(c))).charAt(0);
                    }
                }
                y[i] = c;
            } catch (Exception e) {
            }
        }
        String f = "";
        for (int i = 0; i<x.length(); i++){
            f += new StringBuilder(new StringBuilder(new StringBuilder(y[i]).toString()).toString()).toString();
        }
        return f;
    }
}
