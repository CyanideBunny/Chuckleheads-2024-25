package synchropather.systems.__util__;

/**
 * An Object that stores the duration, start, and end timestamps for a Movement.
 */
public class TimeSpan {
	
	private final double startTime, endTime, duration;
	
	/**
	 * Creates a new TimeSpan object with the given start and end timestamps.
	 * @param startTime >= 0.
	 * @param endTime >= startTime.
	 */
	public TimeSpan(double startTime, double endTime) {
		this.startTime = Math.max(0, startTime);
		this.endTime = Math.max(this.startTime, endTime);
		this.duration = this.endTime - this.startTime;
	}

	/**
	 * @return the start timestamp.
	 */
	public double getStartTime() {
		return startTime;
	}

	/**
	 * @return the end timestamp.
	 */
	public double getEndTime() {
		return endTime;
	}

	/**
	 * @return the duration (positive difference between start and end timestamps).
	 */
	public double getDuration() {
		return duration;
	}

}
