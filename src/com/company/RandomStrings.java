package com.company;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.Comparator;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RandomStrings {
    private String[] Strings;
    private int Count;
    private int Length;


    @JsonProperty("Strings")
    public String[] getStrings() {
        return Strings;
    }

    public void setStrings(String[] strings) {
        this.Strings = strings;
    }

    @JsonProperty("Count")
    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        this.Count = count;
    }

    @JsonProperty("Length")
    public int getLength() {
        return Length;
    }

    public void setLength(int length) {
        this.Length = length;
    }

    public RandomStrings(String[] strings, int count, int length) {
        this.Strings = strings;
        this.Count = count;
        this.Length = length;
    }

    public RandomStrings() {
    }

    @Override
    public String toString() {
        return "RandomString{" +
                "Strings=" + Arrays.toString(Strings) +
                ", Count=" + Count +
                ", Length=" + Length +
                '}';
    }

    public static Comparator<RandomStrings> byCount = (s1, s2) -> Integer.compare(s1.getCount(), s2.getCount());
    public static Comparator<RandomStrings> byLength = (s1, s2) -> Integer.compare(s1.getLength(), s2.getLength());
}
