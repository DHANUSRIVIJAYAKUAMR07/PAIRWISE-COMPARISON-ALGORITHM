import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of runners in the track: ");
		int n=sc.nextInt();
		int[] speed=new int[n];
		int[] wins=new int[n];
		System.out.print("Enter the speed of each runner: ");
		for(int i=0;i<n;i++){
		    speed[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    for(int j=i+1;j<n;j++){
		        if(speed[i]>speed[j]){
		            wins[i]++;
		        }else{
		            wins[j]++;
		        }
		    }
		}
		for(int i=0;i<n;i++){
		    if(wins[i]==n-1){
		        System.out.println("Fastest runner : "+i);
		        return;
		    }
		}
		        System.out.println("No fastest runner is found");
		   
		}
		
	
}
