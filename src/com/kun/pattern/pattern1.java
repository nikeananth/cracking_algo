package com.kun.pattern;

public class pattern1 {

    public static void main(String[] args) {
        pattern(5);
        pattern4(5);
        pattern5(5);
        pattern28(5);
        pattern30(5);
        pattern17(5);
    }

    static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern4(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println("");
        }
    }

    static void pattern5(int n){
        for(int row=0;row<2*n;row++){
        int totalColsRow= row>n?2*n-row:row;

            for(int col=0;col<totalColsRow;col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }


    static void pattern28(int n){
        for(int row=0;row<2*n;row++){
            int totalColsRow= row>n?2*n-row:row;
            int noOfSpaces=n-totalColsRow;
            for(int s=0;s<noOfSpaces;s++){
                System.out.print(" ");
            }
            for(int col=0;col<totalColsRow;col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern30(int n){
        for(int row=1;row<=n;row++){
            int noOfSpaces=n-row;
            for(int s=0;s<noOfSpaces;s++){
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col);
            }
            for(int col=2;col<=row;col++) {
                System.out.print(col);
            }

            System.out.println(" ");

        }
        }

    static void pattern17(int n){
        for(int row=1;row<=2*n;row++){
            int totalColsRow= row>n?2*n-row:row;

            int noOfSpaces=n-totalColsRow;

            for(int s=0;s<noOfSpaces;s++){
                System.out.print(" ");
            }
            for(int col=totalColsRow;col>=1;col--){
                System.out.print(col);
            }
            for(int col=2;col<=totalColsRow;col++) {
                System.out.print(col);
            }
            System.out.println("");
        }
    }


    static void pattern31(int n){
        for(int row=0;row<=2*n-1;row++){
            for(int col=0;col<=2*n-1;col++) {
                System.out.println();
            }
            System.out.println();
         }

        }
    }

