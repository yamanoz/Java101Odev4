import java.util.Scanner;

public class Main {

    public static boolean isPolidrom(int number){


        int temp=number,reverseNumber,reverse=0;
        while(temp>0){
            reverseNumber =temp%10;
            reverse =reverse*10+reverseNumber;
            temp=temp/10;
        }
        if(number==reverse){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
       System.out.print("Sayi giriniz :");
        int number=sc.nextInt();
         String durum=isPolidrom(number)? "Polidrom":"Polidrom Degil!!!";
         System.out.print(number+". Sayisi :"+durum);




    }
}
