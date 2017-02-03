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
public class Array4{
        int nis [][] = {{4712},{1431},{0171}};
        String nama [][] = {{"Fay"},{"Lorelei"},{"Jimin"}};
        
        public void tampil(String n){
            System.out.println("99th Students Identity");
        }
        
        public void namanis (int n){
            for (int i = 0; i < 1; i++){
                for (int j = 0; j < 2; j++){
                    System.out.println(nama[2][j]+":"+nis[0][j]);
                }
            }
        }
        
        public static void main (String[]args){
            Array4 siswa = new Array4();
            siswa.tampil(null);
            siswa.namanis(0);
        }
    }
