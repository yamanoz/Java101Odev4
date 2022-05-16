import java.util.Scanner;



public class Main {
/*

    public static void plus(int a,int b)
    {
        System.out.println("Toplam :"+(a+b));
    }
    public static void minus(int a,int b){
        System.out.println("Cikarma "+(a-b));
    }
    public static void times(int a,int b)
    {
        System.out.println("Sonuc :"+(a*b));
    }
    public static void divided(int a,int b){
        if(b==0)
        {
            System.out.println("b degeri sifir olamaz!!!");
        }
        else {
            System.out.print("Sonuc :"+(a/b));
        }
    }
    public static void power(int a,int b){
        int result=1;
        for(int i=1;i<=b;i++){
            result *=a;
        }
        System.out.println("Sonuc :"+result);
    }

    public static void factorial(int a){
        int result=0;
        for(int i=1;i<=a;i++){
            result =result*i;
        }
        System.out.println("Sonuc :"+result);
    }
    public static void alanCevre(int a,int b){
        int cevre=2*(a+b);
        int alan=a*b;
        System.out.println("Cevre :"+cevre+"\n"+"Alan :"+alan);
    }

    public static void modAlma(int a,int b){
        System.out.println("Sonuc :"+(a%b));
    }
 */


    public static int usAlma(int taban,int us){
        if(us==0){
            return 1;
        }
        return taban*usAlma(taban,us-1);

    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int us,taban;
        do{
            System.out.print("Taban sayisina giriniz :");
            taban=sc.nextInt();
            System.out.print("Us sayisina giriniz :");
            us=sc.nextInt();
            if(us==0&&taban==0){
                System.out.print("Tanimsiz deger girdiniz !!!");
            }else {
                System.out.println("Sonuc :"+usAlma(taban,us));
            }

        }while (us!=0 && taban!=0);




















    /*private static void hesapMakinasi() {
        Scanner sc=new Scanner(System.in);
        int select=1;
        String menu="1-Toplama Islemi\n"
                +"2-Cikarma Islemi\n"
                +"3-Carpma Islemi|n"
                +"4-Bolme Islemi\n"
                +"5-Uslu Sayi Hesaplama\n"
                +"6-Faktoriyel Hesaplama\n"
                +"7-Diktorgen Alan ve Cevre Hesabi\n"
                +"8-Mod Alma\n"
                +"0-Cikis\n";
        while(select!=0){
            System.out.print(menu);
            System.out.print("Lütfen Bir islem seciniz :");
            select=sc.nextInt();
            System.out.print("Sayi 1 :");
            int a=sc.nextInt();
            System.out.print("Sayi 2 :");
            int b=sc.nextInt();
            switch (select){
                case 1:
                    plus(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    factorial(a);
                    break;
                case 7:
                    alanCevre(a,b);
                    break;
                case 8:
                    modAlma(a,b);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlis deger girdiniz !!! Lutfen tekrar deneyiniz.");





            }
        }

     */
    }
}
