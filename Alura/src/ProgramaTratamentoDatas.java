/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnny
 */

import java.time.*;
import java.time.chrono.JapaneseDate;

public class ProgramaTratamentoDatas {
    public static void main (String args[]){
        LocalDate date = LocalDate.now();
        System.out.println(date);
        
        JapaneseDate jDate = JapaneseDate.from(date);
        System.out.println(jDate);
        
        LocalDate date2 = LocalDate.of(2021,03,30);
        System.out.println(date2);
        
    }
    
}
