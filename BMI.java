/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kalkulatorbmi;

import java.util.Scanner;
public class BMI {
public static void main (String[]args){
 Scanner alim = new Scanner(System.in);
 int beratbadan;
 float tinggibadan;
 double bmi;
 
 System.out.println("TAMBAKAN BERAT BADAN:");
 beratbadan = alim.nextInt();
 
 System.out.println("TAMBAKAN TINGGI BADAN:");
 tinggibadan = alim.nextFloat();
 
 bmi= beratbadan/(tinggibadan*tinggibadan);
 System.out.println("BMI ANDA ADALAH\t:"+bmi);
 
 if (bmi<19.5){
     System.out.println("BERAT BADAN ANDA KURANG");
 }
 else if(bmi<24.9){
   System.out.println("BERAT BADAN ANDA NORMAL IDEAL");  
 }
 else if (bmi<28.9){
    System.out.println("BERAT BADAN ANDA LEBIH");   
 }
 else{
    System.out.println("OBESITAS");  
 }
 
}
    
}
