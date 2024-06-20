package synchropather.systems.rotation;

import synchropather.systems.MovementType;
import synchropather.systems.__util__.superclasses.RobotState;

/**
 * Object containing a the global heading value of a robot on the field.
 */
public class RotationState extends RobotState {
	
	private final double heading, normalizedHeading;
	
	/**
	 * Creates a new RotationState object with given heading.
	 * @param heading radians
	 */
	public RotationState(double heading) {
        this.heading = heading;
	    this.normalizedHeading = normalizeAngle(heading);
	}

	/**
	 * @return the heading in radians.
	 */
	public double getHeading() {
		return heading;
	}

	/**
	 * @return the normalized heading in radians.
	 */
	public double getNormalizedHeading() {
		return normalizedHeading;
	}

	/**
	 * @return the absolute value of the heading in radians.
	 */
	public double abs() {
		return Math.abs(heading);
	}

	/**
	 * @return the sign value of the heading as a double.
	 */
	public double sign() {
		return Math.signum(heading);
	}
	
	/**
	 * Adds two RotationStates.
	 * @param addend
	 * @return the sum as a RotationState.
	 */
	public RotationState plus(RotationState addend) {
		return new RotationState(heading + addend.getHeading());
	}
	
	/**
	 * Subtracts two RotationStates.
	 * @param subtrahend
	 * @return the difference as a RotationState.
	 */
	public RotationState minus(RotationState subtrahend) {
		return new RotationState(heading - subtrahend.getHeading());
	}
	
	/**
	 * Multiplies by a constant factor.
	 * @param factor
	 * @return the product as a RotationState.
	 */
	public RotationState times(double factor) {
		return new RotationState(heading * factor);
	}

	@Override
	/**
	 * @return a String containing the heading in radians (not normalized).
	 */
	public String toString() {
		return String.format("%srad", heading);
	}

	@Override
	/**
	 * @return "Rotation"
	 */
	public String getDisplayName() {
		return "Rotation";
	}
	
	/**
	 * Normalizes a given angle to [-pi,pi) radians.
	 * @param degrees the given angle in radians.
	 * @return the normalized angle in radians.
	 */
	private double normalizeAngle(double degrees) {
	    double angle = degrees;
	    while (angle <= -Math.PI) //TODO: opMode.opModeIsActive() && 
	        angle += 2*Math.PI;
	    while (angle > Math.PI)
	        angle -= 2*Math.PI;
	    return angle;
	}

}
