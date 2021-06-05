/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnny
 */
public class ProgramaCalculaIdadeDiasHorasMInutos {
    
    public static int age = 39;
    
    public static void main (String args[]){
        
        // variaveis dias(int) horas(long) minutos(long)
        
        int days = 365;
        int hours = 24;
        int minutes = 60;
        int seconds = 60;
        
        int daysOfLife = age * days;
        
        System.out.println("Quantos dias de vida eu tenho?");
        System.out.println("Resp.: " + daysOfLife + " dias de vida.");
        
        int hoursOfLife = daysOfLife * hours;
        
        System.out.println("Quantos horas de vida eu tenho?");
        System.out.println("Resp.: " + hoursOfLife + " horas de vida.");
        
        int minutesOfLife = hoursOfLife * minutes;
        
        System.out.println("Quantos minutos de vida eu tenho?");
        System.out.println("Resp.: " + minutesOfLife + " horas de vida.");
        
        int secondsOfLife = minutesOfLife * seconds;
        
        System.out.println("Quantos segundos de vida eu tenho?");
        System.out.println("Resp.: " + secondsOfLife + " horas de vida.");
        
    }
    
}
