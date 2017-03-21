import java.util.Scanner;

public class java0321 { 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("입력할 최대 실수의 갯수를 입력하세요. >> ");    
        Scanner input = new Scanner(System.in);  
        int size = input.nextInt();
        double sum = 0;
        
        System.out.println("\n중간에 0을 입력하면 이전 입력자료로 계산하고 종료합니다.");  
        System.out.print("실수 " + size + "개를 입력하세요. >> ");    
        	for (int i=1;i<=size;i++){
        		double type = input.nextDouble();
        		if (type == 0){
        			System.out.println("0 이나와서 프로그램을 종료합니다.");     			
        			break;
                }
        		sum= sum + type;
        	}
        	
        
        
        System.out.println("합: " + sum + ", 평균: " + sum/size);
    }
}
