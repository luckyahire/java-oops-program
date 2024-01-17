package project1;

abstract class ElectricityBill {
	
	long consNo;
	String consumerName;
	protected long prevReading;
	protected long currReading;
	String ebtype;
	
	/*
	 * this method calculate unit consume by the coustumer
	 * input parameter are current metter reading and previous meter reading
	 * output value is total no of unit consume
	 * 
	 */
	public long calculateunitconsume(long current,long previous) {
		
		
		long unitConsume = current - previous;
		return unitConsume;
	}
	
	protected abstract long billAmount(long units);
	
	
}
