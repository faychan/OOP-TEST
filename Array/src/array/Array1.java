/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Faychan
 */
public class Array1 {
    public static void main(String[] args) {
        int nilai [] = new int [3];
        nilai [0] = 70;
        nilai [1] = 80;
        nilai [2] = 65;
        double avg = 0.0;
        
        for (int i=0; i<nilai.length; i++)avg+=nilai[i];
        avg/=nilai.length;
        System.out.println("Nilai rata-rata = "+ avg);
    } //Farah Noriffat
}       //XIRPL1/13 
