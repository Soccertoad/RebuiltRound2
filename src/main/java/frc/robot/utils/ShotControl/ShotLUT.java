package frc.robot.utils.ShotControl;

import edu.wpi.first.math.interpolation.InterpolatingTreeMap;
import edu.wpi.first.math.interpolation.InverseInterpolator;

public class ShotLUT extends InterpolatingTreeMap<Double, ShotParms> {

  public ShotLUT(){
    super(InverseInterpolator.forDouble(), ShotParms.interpolate());
  }

  public void put(double distance, ShotParms parms){
    super.put(distance, parms);
  }

  public ShotParms get(double distance){
    return super.get(distance);
  }

  public void clear(){
    super.clear();
  }
}
