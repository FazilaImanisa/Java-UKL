/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;
import java.util.Scanner;

public class Condition {
    public static void main(String[]args){
     int id[]={1,2,3,4,5};
     String nama[]={"Ali", "Budi", "Dani", "Edi", "Umar"};
     String cottage[]={"Sawojajar","Kedung kandang","Ijen","Dinoyo"};
     String jalur[]={"SBMPTN","SNMPTN","Mandiri","SBMPTN"};
 
     Scanner userInput=new Scanner(System.in);
        System.out.print("Masukkan tipe cottage =");
        int idm = userInput.nextInt();
        int iId=Integer.valueOf(idm);
        System.out.print("Lama Menginap = ");
        int jal = userInput.nextInt();
        System.out.print("golongan hari = ");
        int gol = userInput.nextInt();
     
     
     if (jal==1&&gol==1){
           System.out.println("DSP = 5 juta");
           System.out.println("SPP = 500 ribu");
        }
     if (jal==1&&gol==2){
           System.out.println("DSP = 15 juta");
           System.out.println("SPP = 1 juta");
        }
     if (jal==1&&gol==3){
           System.out.println("DSP = 30 juta");
           System.out.println("SPP = 2 juta");
        }
     if (jal==2&&gol==1){
           System.out.println("DSP = 7 juta");
           System.out.println("SPP = 500 ribu");
        }
     if (jal==2&&gol==2){
           System.out.println("DSP = 17 juta");
           System.out.println("SPP = 1 juta");
        }
     if (jal==2&&gol==3){
           System.out.println("DSP = 35 juta");
           System.out.println("SPP = 2 juta");
        }
     if (jal==3&&gol==1){
           System.out.println("DSP = 10 juta");
           System.out.println("SPP = 1 juta");
        }
     if (jal==3&&gol==2){
           System.out.println("DSP = 25 juta");
           System.out.println("SPP = 12juta");
    }
     if (jal==3&&gol==3){
           System.out.println("DSP = 50 juta");
           System.out.println("SPP = 3 juta");
    }
     
     char kategori;
     System.out.print("Kategori pendapatan :");
     kategori = userInput.next().charAt(0);
     if(kategori == 'A'){
         System.out.println("<2 juta");
     }
     else if (kategori == 'B'){
         System.out.println("2 juta s.d 10 juta");
     }
     else if (kategori == 'C'){
         System.out.println(">10 juta");
    
}
     System.out.println("\n Print Out Identitas");
     System.out.println("ID:" + idm);
     System.out.println("Nama:" + nama[iId-1]);
     System.out.println("Alamat:" + alamat[iId-1]);
     System.out.println("Jalur: "+ jalur[iId-1]);
       
    }
    
}
