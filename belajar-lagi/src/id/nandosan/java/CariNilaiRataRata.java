package id.nandosan.java;

public class CariNilaiRataRata {
    public static void main(String[] args) {
        int [] data = {7,5,3,9,1,4,8};

        double temp1 = 0;
        double temp2 = 0;
        double nilaiRata2 = 0;

        //       7
        for(int value : data){
            // temp1 = 0 + 7
            // temp1 = 7 + 5 ......
            temp1 += value;
        }

        temp2 = data.length;

        nilaiRata2 = temp1/temp2;

        System.out.println(nilaiRata2);
    }
}
