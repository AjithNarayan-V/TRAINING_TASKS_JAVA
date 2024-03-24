import java.util.*;
public class celebrity_problem {
    public int celebrityFindereffi(int arr[][]){
        Stack<Integer> s=new Stack<>();
        int i,n=arr.length;
        for(i=0;i<n;i++){
            s.push(i);
        }
        while(s.size()>1){
            int a=s.pop(),b=s.pop();
            if(arr[a][b]==1){
                s.push(b);
            }
            else{
                s.push(a);
            }
        }
        int element=s.pop();
        for(i=0;i<n;i++){
            if((arr[element][i]==1) || (arr[i][element]==0 && i!=element)){
                return -1;
            }
        }
        return element;
    }
    public int celebrityFinder(int arr[][]){
        int i,j,n=arr.length,knows[]=new int[n],knownby[]=new int[n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(arr[i][j]==1){
                    knows[i]++;
                    knownby[j]++;

                }
            }
        }
        for(i=0;i<n;i++){
            if(knows[i]==0 && knownby[i]==n-1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        celebrity_problem c=new celebrity_problem();
        System.out.println("Enter the size of the 2d array:");
        int i,j,n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.printf("Enter the value of arr[%d][%d]:\t",i,j);
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("");
        sc.close();
        System.out.println("The Entered Array is:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        int ans=c.celebrityFindereffi(arr);
        if(ans!=-1){
            System.out.println("The celebrity in the Array is "+ans);
        }
        else{
            System.out.println("There is no celebrity in the Array");
        }
        
    }
}