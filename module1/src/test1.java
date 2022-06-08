import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        Print p1 = new Print("hhhh");
        p1.printName();
    }

}

class Print{
    String name1 = "yaoliuchang";

    Print(){

    }

    public Print(String name1){
        this.name1 = name1;
    }

    public void printName(){
        int[] arr = {-1, 2, 8,1,0};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}

class PringSon extends Print{

    public PringSon(String name1) {

    }
}
