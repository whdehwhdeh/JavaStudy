package ch05;

public class Arr1 {
	public static void main(String[] args) {
		int last = scores[ scores.length - 1];
		
		
		//5개 공간의 배열 생성
		int[] arr= new int[5]; //0 0 0 300 0 
		arr[3] = 300;
		
		for(int i = 0; i <arr.length; i++) {
			
		}
		//Ctrl + / : 주석 or Shift + Ctrl +C
		
		System.out.println(arr[0]);
		System.out.println(arr[3]);
		System.out.println(arr[9]); // Index Error
		
	}
}
