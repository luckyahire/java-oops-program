package project1;




class CommercialBill extends ElectricityBill {
	
	@Override
	public long billAmount(long units) {
		long totalAmount = 0;
		
		if (units <= 100)
		{ // units consume for 100 rate is 100 rupees = 2rs
			totalAmount = units * 2;
		}
		else if (units > 100 && units <= 200) 
		{ // units consume for 100  to 200 rupees and charges = 4.5 rs 
			totalAmount = (units - 100) * 9 / 2 + (100 * 2);
			}
		else if (units > 200 && units <= 500) {
			// units consume for 200  to 500 rupees and charges = 6 rs 
			totalAmount = (units - 200) * 6 + (100 * 9 / 2) + (100 * 2);
		}
		else if (units > 500) {
			// units consume above 500 rupees and charges = 7 rs 
			totalAmount = (units - 500) * 7 + (300 * 6) + (100 * 9 / 2) + (100 * 2);
		}
		return totalAmount;
	}



	
}