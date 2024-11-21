package chp12.ex12_1;

public class MainException12_1 {
    String[] arr={};

    public static void main(String[] args) {
        String[] arr={"봄","여름","가을","겨울"};
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        for(String season:arr){
            System.out.println(season+" ");
        }
        System.out.println();

        try{System.out.println(arr[5]);
    }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("배열의 인덱스 번호가 너무 크네요");
        }
    }
}
