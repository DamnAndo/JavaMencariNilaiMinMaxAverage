package id.nandosan.java;

public class CariNilaiMin {

    public static void main(String[] args) {
        int [] data = {7,5,3,9,1,4,8};

        int exampleVar = 100;

        for(int value : data){
            //  5    <  7
            if(value < exampleVar){
                // 5
                exampleVar = value;
            }
        }

        System.out.println(exampleVar);
    }
}
