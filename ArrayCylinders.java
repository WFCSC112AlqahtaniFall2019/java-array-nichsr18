import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayCylinders {

    public static void main ( String [] args ){
       Scanner in = new Scanner(System.in);
       Cylinder list []= new Cylinder[5] ;
       //1) fill the information for each Cylinder from the user
        for(int i=0;i<5;i++){
            list[i]=new Cylinder(in.nextInt(),in.nextInt());

        }


        // 2)print the information of all Cylinders
        for(int i=0; i<5;i++) {
            list[i].print();
        }


    }
 }

