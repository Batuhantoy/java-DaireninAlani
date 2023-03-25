import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenler
        int r,aci;
        double pi=3.14;
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan bilgileri al
        System.out.print("Yarıçapı giriniz : ");
        r=input.nextInt();

        System.out.print("Merkez açısının ölçüsünü giriniz : ");
        aci=input.nextInt();

        //Hesapla
        double alan = (pi*(r*r)*aci)/360;

        System.out.println("Dairenin Alanı : "+alan);


    }
}