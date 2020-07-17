package by.tc.task01.entity;

public class Laptop implements Appliance{
	private double batteryCapacity;
	private String OS;
	private int memoryROM;
	private int systemMemory;
	private double SPU;
	private double displayInch;	
		
	public Laptop() {
		super();
	}
	
	////////////////////////////////////////////////////////////
	
	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public void setMemoryROM(int memoryROM) {
		this.memoryROM = memoryROM;
	}

	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}

	public void setSPU(double sPU) {
		SPU = sPU;
	}

	public void setDisplayInch(double displayInch) {
		this.displayInch = displayInch;
	}

	////////////////////////////////////////////////////////////
	
	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public String getOS() {
		return OS;
	}

	public int getMemoryROM() {
		return memoryROM;
	}

	public int getSystemMemory() {
		return systemMemory;
	}

	public double getSPU() {
		return SPU;
	}

	public double getDisplayInch() {
		return displayInch;
	}

	////////////////////////////////////////////////////////////
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((OS == null) ? 0 : OS.hashCode());
		long temp;
		temp = Double.doubleToLongBits(SPU);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(batteryCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(displayInch);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + memoryROM;
		result = prime * result + systemMemory;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Laptop))
			return false;
		Laptop other = (Laptop) obj;
		if (OS == null) {
			if (other.OS != null)
				return false;
		} else if (!OS.equals(other.OS))
			return false;
		if (SPU != other.SPU)
			return false;
		if (batteryCapacity != other.batteryCapacity)
			return false;
		if (displayInch != other.displayInch)
			return false;
		if (memoryROM != other.memoryROM)
			return false;
		if (systemMemory != other.systemMemory)
			return false;
		return true;
	}
}