/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Condition2 {
static int hitung(int nilai) {
 int bayar=20000;
 nilai=nilai-10;
 
 //pengitungan 10 kedua
 if (nilai>10){
 bayar=bayar+30000;
 nilai=nilai-10;
 }
 else {
 bayar=bayar+3000*nilai;
 nilai=0;
 }
 
 //pengitungan 10 ketiga
 if (nilai>10){
 bayar=bayar+40000;
 nilai=nilai-10;
 }
 else {
 bayar=bayar+4000*nilai;
 nilai=0;
 }
 
 //pengitungan selanjutnya
 if (nilai>10){
 bayar=bayar+3000*nilai;
 }
 
 return bayar;
 }
    public static void main(String[] args) {
        int id[]={1,2,3,4,5};
    }
    
}
