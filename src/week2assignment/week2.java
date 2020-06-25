//Daisy Murillo
//Wed. June 24, 2020

package week2assignment;

public class week2 {

	public static void main(String[] args) {
		//Boolean Variables
		boolean isHotOutside = true;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = false; 
		
		
		//Not Boolean Variables 
		double costOfMilk = 2.99;
		double moneyInWallet = 0.00;
		int thirstLevel = 4; 

		//Created Variables with Above Variables 
		boolean shouldBuyIceCream = isHotOutside && hasMoneyInPocket; //false
		boolean willGoSwimming = isHotOutside && !isWeekday;  //false
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday; //false
		boolean willBuyMilk = moneyInWallet >= 2*costOfMilk && thirstLevel >=4 && isHotOutside; // false 
		

	}

}


