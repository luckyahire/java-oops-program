package project1;

class DomesticBill extends ElectricityBill {

	@Override
	public long billAmount(long units) {
		long totalAmount = 0;

		if (units <= 100) {// units consume for 100 is 100 rupees
			totalAmount = units * 1;
		} 
		else if (units > 100 && units <= 200) // units consume for 100  to 200 rupees and charges = 2.5 rs 
		{
			totalAmount = (units - 100) * 5 / 2 + (100 * 1);
		} 
		else if (units > 200 && units <= 500) { // unit consume for 200 to 500 rupees and charges = 4 rs
			totalAmount = (units - 200) * 4 + (100 * 5 / 2) + (100 * 1);
		} 
		else if (units > 500) { // unit consume from above 500 rupees and charges = 6 rs
			totalAmount = (units - 500) * 6 + (300 * 4) + (100 * 5 / 2) + (100 * 1);
		}
		return totalAmount;
	}

}
