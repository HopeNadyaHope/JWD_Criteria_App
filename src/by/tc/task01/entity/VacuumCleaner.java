package by.tc.task01.entity;

public class VacuumCleaner implements Appliance{
	private int powerConsumption;
	private String filterType;
	private String bagType;
	private String wandType;
	private int motorSpeedRegulation;
	private double cleaningWidth;
	
	public VacuumCleaner() {
		super();
	}

	////////////////////////////////////////////////////////////

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public void setBagType(String bagType) {
		this.bagType = bagType;
	}

	public void setWandType(String wandType) {
		this.wandType = wandType;
	}

	public void setMotorSpeedRegulation(int motorSpeedRegulation) {
		this.motorSpeedRegulation = motorSpeedRegulation;
	}

	public void setCleaningWidth(double cleaningWidth) {
		this.cleaningWidth = cleaningWidth;
	}
	
	////////////////////////////////////////////////////////////

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public String getFilterType() {
		return filterType;
	}

	public String getBagType() {
		return bagType;
	}

	public String getWandType() {
		return wandType;
	}

	public int getMotorSpeedRegulation() {
		return motorSpeedRegulation;
	}

	public double getCleaningWidth() {
		return cleaningWidth;
	}
	
	////////////////////////////////////////////////////////////

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bagType == null) ? 0 : bagType.hashCode());
		long temp;
		temp = Double.doubleToLongBits(cleaningWidth);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((filterType == null) ? 0 : filterType.hashCode());
		result = prime * result + motorSpeedRegulation;
		result = prime * result + powerConsumption;
		result = prime * result + ((wandType == null) ? 0 : wandType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof VacuumCleaner))
			return false;
		VacuumCleaner other = (VacuumCleaner) obj;
		if (bagType == null) {
			if (other.bagType != null)
				return false;
		} else if (!bagType.equals(other.bagType))
			return false;
		if (cleaningWidth != other.cleaningWidth)
			return false;
		if (filterType == null) {
			if (other.filterType != null)
				return false;
		} else if (!filterType.equals(other.filterType))
			return false;
		if (motorSpeedRegulation != other.motorSpeedRegulation)
			return false;
		if (powerConsumption != other.powerConsumption)
			return false;
		if (wandType == null) {
			if (other.wandType != null)
				return false;
		} else if (!wandType.equals(other.wandType))
			return false;
		return true;
	}
}