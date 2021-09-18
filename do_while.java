public class do_while{
	public static void main(String args[]){
		int i = 1;
		int total = 0;
		do{
			/*if(i % 3 == 0 && i % 5 != 0){
				System.out.println(i);
				total = total + i;
				
			}*/
			total = total + i;
			i++;
		}
		while(i <= 20);
		System.out.println("Total is "+total);
	}
}