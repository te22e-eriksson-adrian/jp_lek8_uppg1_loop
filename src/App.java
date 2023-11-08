import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //A
        int varv = 0;
        while (varv<=5){
            System.out.println("Varv nummer: "+varv);
            varv++;
        }

        //B
        System.out.println("     ");
        int varv1 = 2;
        while (varv1<=5){
            System.out.println("Varv nummer: "+varv1);
            varv1++;
        }

        //C
        System.out.println("     ");
        for (int varv2=0; varv2<6; varv2++){
            System.out.println("Varv nummer: "+varv2);
        }

        //D
        System.out.println("     ");
        int varv3=2;
        do{
            System.out.println("Varv nummer: "+varv3);
            varv3++;
        }
        while (varv3<6);

        //E
        System.out.println("     ");
        int varv4 = 5;
        while (varv4>=0){
            System.out.println("Varv nummer: "+varv4);
            varv4--;
        }

        //F
        System.out.println("     ");
        for (int varv5=5; varv5>-1; varv5--){
            System.out.println("Varv nummer: "+varv5);
        }

        //G
        System.out.println("     ");
        Scanner tangentbord = new Scanner(System.in);
        int[] array = new int[5];
        for (int i=0; i<5; i++){
            System.out.print("Skriv in tal "+i+" här: ");
            array[i] = tangentbord.nextInt();
            tangentbord.nextLine();
        }
        System.out.println("     ");
        for (int i2=5; i2>-1; i2--){
            System.out.println("Tal nummer "+i2+" är: "+i2);
        }
        tangentbord.close();
    }
}
