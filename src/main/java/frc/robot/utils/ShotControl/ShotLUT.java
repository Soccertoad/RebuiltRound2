package frc.robot.utils.ShotControl;

import edu.wpi.first.math.interpolation.InterpolatingTreeMap;
import edu.wpi.first.math.interpolation.InverseInterpolator;

public class ShotLUT{

  private InterpolatingTreeMap<Double, ShotParms> shotMap;

  public ShotLUT(){
    shotMap = new InterpolatingTreeMap<>(InverseInterpolator.forDouble(), ShotParms.interpolate());
  }

  public void put(double distance, ShotParms parms){
    shotMap.put(distance, parms);
  }

  public void put(double distance, double rps, double hoodAngle, double toF){
    put(distance, new ShotParms(rps, hoodAngle, toF));
  }

  public ShotParms get(double distance){
    return shotMap.get(distance);
  }

  public double getShotRPS(double distance){
    return shotMap.get(distance).rps();
  }

  public double getShotHoodAngle(double distance){
    return shotMap.get(distance).hoodAngle();
  }

  public double getShotToF(double distance){
    return shotMap.get(distance).toF();
  }

  public void clear(){
    shotMap.clear();
  }
}
