public class Array {
   
    
    
   
   
    public static void main(String[] args){
    

        System.out.println("way 1");
        int arr[]={1,24,5,6,7};
        int n=arr.length;

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

      System.out.println();
      System.out.println("way 2");

      // this will allocate the memory and with 5 elemnet and its default value is 0
      int[] arr2=new int[5];

      for(int i=0;i<5;i++){
        System.out.print(arr2[i]+" ");
      }




      // multi - dimensiom array
      System.out.println();
      System.out.println("multi dimension");

      int[][] multiArray = new int[][]{{1,2,4},{2,4,6}};

      int n1=multiArray.length;
      for(int i=0;i<n1;i++){
        //for each loop
        System.out.println();
        for(int it : multiArray[i]){
          System.out.print(it+" ");
        }
    }
      

      




    }



}
