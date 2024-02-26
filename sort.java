import java.util.*;

  class sort
{
      static void SortArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
               int temp=0;
                if(arr[j]<arr[i])
                {
                  temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                }
            }
        }
        System.out.println("sorted array:- ");
        for(int k=0;k<arr.length;k++)
        System.out.print(arr[k]+" ");

    }


    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size");
        int size =s.nextInt();
        int ar[]=new int[size];

        for (int i=0;i<size;i++)
        { 
            System.out.print("Enter the element:");
            ar[i]=s.nextInt();
        }
         SortArray(ar);
         s.close();
    }
}
