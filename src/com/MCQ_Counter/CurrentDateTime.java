package com.MCQ_Counter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author User
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {

    public static void main(String[] args) {
        time();
    }

    public static String time() {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        return String.valueOf(now);
    }
}
