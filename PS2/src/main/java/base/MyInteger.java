package base;

public class MyInteger {
	
	public MyInteger(int a){
		setiValue(a);
	}
	private int iValue;
	
	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}

	public boolean isEven() {
		if (iValue % 2 == 0){
			return true;
		}
		else
			return false;
	}
	public boolean isOdd() {
		if (iValue % 2 == 1){
			return true;
		}
		else
			return false;
		
	}
	
	public boolean isPrime() {
		for (int i = 2; i < (.5 * iValue); i++){
			if (iValue % i == 0)
				return false;
		}
		return true;
		
	}
	
	public static boolean isEven(int x) {
		if (x % 2 == 0){
			return true;
		}
		else
			return false;
	}
	
	public static boolean isOdd(int x){
		if (x % 2 == 1){
			return true;
		}
		else
			return false;
	}
	
	public static boolean isPrime(int x){
		for (int i = 2; i < (.5 * x); i++){
			if (x % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(MyInteger number){
		if (number.getiValue() % 2 == 0){
			return true;
		}
		else
			return false;
	}
	
	public static boolean isOdd(MyInteger number){
		if (number.getiValue() % 2 == 1){
			return true;
		}
		else
			return false;
	}
	
	public static boolean isPrime(MyInteger number){
		for (int i = 2; i < (.5 * number.getiValue()); i++){
			if (number.getiValue() % i == 0)
				return false;
		}
		return true;
	}
	
	public boolean equals(int x){
		if (x == 5){
			return false;
		}
		return false;
	}
	
	public boolean equals(MyInteger number){
		if (number.getiValue() == 5){
			return true;
		}
		return false;
	}
	
}
