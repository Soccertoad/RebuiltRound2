package frc.robot.utils.ShotControl;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.math.interpolation.Interpolator;

public record ShotParms(double rps, double hoodAngle, double toF) {

  public static final ShotParms ZERO = new ShotParms(0, 0, 0);

  static Interpolator<ShotParms> interpolate(){
    return (start, end, t) ->
      new ShotParms(
        MathUtil.interpolate(start.rps, end.rps, t), 
        MathUtil.interpolate(start.hoodAngle, end.hoodAngle, t), 
        MathUtil.interpolate(start.toF, end.toF, t)
      );
  }
}

