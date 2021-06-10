/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnny
 */
public class ProgramaArrayBiDimensional {
    public static void main (String argas[]){
        
        int[][] notas = new int[2][2];
        String[] aluno = new String[2];
        
        notas[0][0] = 10;
        notas[0][1] = 9;
        notas[1][0] = 9;
        notas[1][1] = 8;
        aluno[0] = "Silmara";
        aluno[1] = "João";
        
//        System.out.println("Notas do Aluno 1 - Portugues: " + notas[0][0] + " e Matematica: " + notas[0][1]);
//        System.out.println("Notas do Aluno 1 - Portugues: " + notas[1][0] + " e Matematica: " + notas[1][1]);
        
        for(int x = 0; x < notas.length; x++){
            System.out.print("Notas do aluno: " + aluno[x] + ": ");
            for(int y = 0; y < notas[0].length; y++){
                if(y == 0)
                    System.out.print(" de Matematica: " +  notas[x][y]);
                 else 
                    System.out.print(" e de Portugues: "  + notas[x][y]);
                
            System.out.println("");
            }
        }
    }
}
