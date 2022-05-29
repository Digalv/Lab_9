package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RandomStringList {
    private final List<RandomStrings> randomStringList;

    public RandomStringList(){
        this.randomStringList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Stringlist: " + randomStringList;
    }
    public void add(RandomStrings randomString){
        this.randomStringList.add(randomString);
    }
    public void remove(int number){
        if(number >= 0 && number < this.randomStringList.size()){this.randomStringList.remove(number);}
    }
    public void remove(RandomStrings randomString){
        this.randomStringList.remove(randomString);
    }

    public List<RandomStrings> getList() {
        return randomStringList;
    }

    /*public RandomStringList countOver(int count){
        RandomStringList result = new RandomStringList();
        for (RandomStrings randomString : this.randomStringList) {
            if(randomString.getCount() > count){result.add(randomString);}
        }
        return result;
    }
    public RandomStringList lengthOver(int length){
        RandomStringList result = new RandomStringList();
        for (RandomStrings randomString : this.randomStringList) {
            if(randomString.getLength() > length){result.add(randomString);}
        }
        return result;
    }*/
}
