package com.company;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {
        JSONGetter jsonGetter = new JSONGetter();
        RandomStringList randomStringList = new RandomStringList();
        final int N = 1;
        for (int i = 0; i < N; i++) {
            JSONGetter.url = "https://ciprand.p3p.repl.co/api?len=" + ((int) (Math.random() * 20) + 1) +"&count=" + ((int) (Math.random() * 20) + 1);
            jsonGetter.run();
            RandomStrings randomString =  new ObjectMapper().readValue(jsonGetter.jsonIn, RandomStrings.class);
            randomStringList.add(randomString);
        }

        System.out.println(randomStringList);
        System.out.println("By count");
        randomStringList.getList().sort(RandomStrings.byCount);
        System.out.println(randomStringList);
    }
}
