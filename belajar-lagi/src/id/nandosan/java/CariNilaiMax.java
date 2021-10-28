package id.nandosan.java;

public class CariNilaiMax {

    public static void main(String[] args) {
        int [] data = {7,5,3,9,1,4,8};

        int exampleVar = 0;
        //       5
        for(int value : data){
            //  5    >  7
            if(value > exampleVar){
                exampleVar = value;
            }

        }

        System.out.println(exampleVar);
    }
}
