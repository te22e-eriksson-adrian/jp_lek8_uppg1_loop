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
            System.out.print("Skriv in tal "+(i+1)+" här: ");
            array[i] = tangentbord.nextInt();
            tangentbord.nextLine();
        }
        System.out.println("     ");
        for (int i2=0; i2<5; i2++){
            System.out.println("Tal nummer "+(i2+1)+" är: "+array[i2]);
        }

        //H
        System.out.println("     ");
        for (int i3=4; i3>=0; i3--){
            System.out.println("Tal nummer "+(i3+1)+" är: "+array[i3]);
        }

        //I
        System.out.println("     ");
        System.out.print("Skriv antalet stjärnor du vill ska skrivas ut här: ");
        int amount_star = tangentbord.nextInt();
        tangentbord.nextLine();
        for (int i4=-1; i4<=amount_star; i4++){
            System.out.print("*");
        }
        tangentbord.close();
    }
}
