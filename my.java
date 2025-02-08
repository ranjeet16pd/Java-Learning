public class my{


   static int  AddTwoNumber(int a,int b){
       return a+b;
    }

    static int SubTwoNumber(int a,int b){
        return b-a;
    }



    public static void main(String[] args){
        int ans1=AddTwoNumber(2,1);
        int ans2=SubTwoNumber(3, 6);

        System.out.print(ans1+","+ans2);
    }
    
}