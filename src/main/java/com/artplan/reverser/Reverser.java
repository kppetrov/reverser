package com.artplan.reverser;

import java.util.Objects;

public class Reverser {

    private String str;

    public void setStr(String str) {
        this.str = str;
    }
    
    public Reverser(String str) {

        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public String getReverse() {
        
        if (Objects.isNull(str)) {
            throw new IllegalArgumentException("The str cannot be null");
        }

        if (str.trim().isEmpty()) {
            return str;
        }

        char[] ch = str.toCharArray();

        int startIndex = 0;
        int finalIndex = ch.length - 1;

        while (startIndex < finalIndex) {

            char tmp = ch[startIndex];
            ch[startIndex] = ch[finalIndex];
            ch[finalIndex] = tmp;

            startIndex++;
            finalIndex--;

        }

        return new String(ch);
    }

}
