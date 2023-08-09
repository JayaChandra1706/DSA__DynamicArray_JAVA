import java.util.Scanner;
public class Array {
	private int arr[];
    private Scanner scan=new Scanner(System.in);
    public Array(int len) {
    	arr=new int[len];
    }
    public void insert() {
    	System.out.print("Enter the position to Insert Element from 0 to"+(arr.length-1)+" :");
    	int pos=scan.nextInt();
    	System.out.println();
    	System.out.print("Enter the Element to Insert:");
    	int ele=scan.nextInt();
    	System.out.println();
    	arr[pos]=ele;
    		System.out.println("Insertion of "+ele+" at "+pos+" is successfully completed");
    		
    
    }
    public void delete() {
    	System.out.print("Enter position to delete Element:");
    	int pos=scan.nextInt();
    	System.out.println();
    	if(arr[pos]==0) {
    		System.out.println("There is no Element to Delete choose Another Position");
    		System.out.println();
    	}else {
            System.out.println("Deletion of "+arr[pos]+" at "+pos+" is successfully completed");
    		arr[pos]=0;	
    	}
    }
    public void display() {
    	System.out.println();
    	System.out.println();
    	System.out.println();
    	System.out.println();
    	System.out.println("Array Elements are.......");
    	for(int i=0;i<=arr.length-1;i++) {
    		System.out.print(arr[i]+" ");	
    	}
        System.out.println();
    	System.out.println();
    	System.out.println();
    	System.out.println();
    }
	
}
