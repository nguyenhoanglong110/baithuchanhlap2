package baitap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BaiTapThaoTacCacToanTu {

public static void main(String[] args) {
    scanner scanner = new scanner(System.in);
    DecimalFormat decimalFormat = new DecimalFormat("#.##");

System.out.printlt("Nhập vào số thứ nhất: ");
int first number = scanner.nextInt();
System.out.printlt("Nhập vào số thứ hai: ");
int Secondnumber = scanner.nextInt();

// 1. Tính tổng, hiệu, tích, thương, phép chia lấy dư của 2 số đó.
int tong = firstNumber + secondNumber;
System.out.printlt(firstNumber + " + " + secondNumber + " = " + tong); 

int hieu = firstNumber - secondNumber;
System.out.printlt(firstNumber + " - " + secondNumber + " = " + hieu);

int tich = firstNumber * secondNumber;
System.out.printlt(firstNumber + " * " + secondNumber + " = " + tich);

float thuong = (float) first number / secondNumber;
System.out.println(firstNumber + " / " + secondNumber + " = " + 
decimalFormat.format(thuong));  // làm tròn thương đến 2 chữ số thập phân

int phanDu = firstNumber % secondNumber;
 System.out.println(firstNumber + " % " + secondNumber + " = " + phanDu);

 // 2. Sử dụng các toán tử so sánh đã học để so sánh 2 số đó.
  System.out.println("Kết quả so sánh bằng 2 số " + firstNumber + " và " + 
          secondNumber + " là " + (firstNumber == secondNumber));
  System.out.println("Kết quả so sánh không bằng 2 số " + firstNumber + " và " + 
          secondNumber + " là " + (firstNumber != secondNumber));
  System.out.println("Kết quả so sánh lớn hơn 2 số " + firstNumber + " và " +  
          secondNumber + " là " + (firstNumber > secondNumber));
  System.out.println("Kết quả so sánh lớn hơn hoặc bằng 2 số " + firstNumber + " và " +
        secondNumber + " là " + (firstNumber >= secondNumber));
  System.out.println("Kết quả so sánh nhỏ hơn 2 số " + firstNumber + " và " + 
        secondNumber + " là " + (firstNumber < secondNumber));
  System.out.println("Kết quả so sánh nhỏ hơn hoặc bằng 2 số " + firstNumber + " và " + 
        secondNumber + " là " + (firstNumber <= secondNumber));
            }

    }