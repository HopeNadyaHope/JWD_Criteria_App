package by.tc.task01.entity;

public class TabletPC implements Appliance{
	private double batteryCapacity;
	private double displayInch;
	private int memoryROM;
	private int flashMemoryCapacity;
	private String color;
	
	public TabletPC() {
		super();
	}

	////////////////////////////////////////////////////////////
	
	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}


	public void setDisplayInch(double displayInch) {
		this.displayInch = displayInch;
	}


	public void setMemoryROM(int memoryROM) {
		this.memoryROM = memoryROM;
	}


	public void setFlashMemoryCapacity(int flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}


	public void setColor(String color) {
		this.color = color;
	}

	////////////////////////////////////////////////////////////
	
	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public double getDisplayInch() {
		return displayInch;
	}

	public int getMemoryROM() {
		return memoryROM;
	}

	public int getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}

	public String getColor() {
		return color;
	}
	
	////////////////////////////////////////////////////////////

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(batteryCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		temp = Double.doubleToLongBits(displayInch);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + flashMemoryCapacity;
		result = prime * result + memoryROM;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof TabletPC))
			return false;
		TabletPC other = (TabletPC) obj;
		if (batteryCapacity != other.batteryCapacity)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (displayInch != other.displayInch)
			return false;
		if (flashMemoryCapacity != other.flashMemoryCapacity)
			return false;
		if (memoryROM != other.memoryROM)
			return false;
		return true;
	}
}