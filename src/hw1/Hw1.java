package hw1;

public class Hw1 {
	public static void main(String[] args) {
		
		//1
//		System.out.println(12+6); 
//		System.out.println(12*6); 
		
		//2
//		System.out.println("雞蛋共是"+200/12+"打"+200%12+"顆"); 
		
		//3
		int day = 256559/86400;
		int hour = (256559%86400)/3600;
		int min = ((256559%86400)%3600)/60;
		int sec = ((256559%86400)%3600)%60;
		System.out.println(day+ "天" + hour + "小時" + min + "分鐘" + sec + "秒"); 
		
		 //4
//		double pi = 3.1415;
//		System.out.println("圓面積="+5*5*pi+", "+"圓周長="+2*5*pi);
		
		//5
//		int m = 1500000;
//		System.out.println(m*Math.pow(1.02, 10)); 
		
		//6
//		System.out.println(5 + 5); //數值間的相加
//		System.out.println(5 + '5'); //'5'被看成char型態的資料，對應到的ASCII是53，所以變成5+53
//		System.out.println(5 + "5"); //"5"是字串，因此會變成字串串接
	}

}
