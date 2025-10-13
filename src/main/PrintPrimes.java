
public class PrintPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPrime;

		for(int i=2;i<=50;i++){
			isPrime = true;
			for(int j = 2; j*j<=i;j++){
				if(i%j == 0){
					isPrime=false;
					break;
				}
		}

		if(isPrime){
			System.out.print(i+" ");
		  }

		}

		 System.out.println();


	}

}
