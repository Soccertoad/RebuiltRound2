package frc.robot;

import frc.robot.utils.ShotControl.ShotLUT;

public final class Constants {
    public static final class SuperStructureConstants{
      public static final ShotLUT SHOT_TABLE = new ShotLUT();
      static{
        SHOT_TABLE.put(1.6172356882170904, 39.5, 65, 6.81 - 5.64);
        SHOT_TABLE.put(1.977663678422591, 40.7, 65, 3.55 - 2.7);
        SHOT_TABLE.put(2.2378909448326656, 43.0, 65, 3.64 - 2.7);
        SHOT_TABLE.put(2.5213633269563562, 44.7-.5, 65, SHOT_TABLE.getShotToF(2.5213633269563562));
        SHOT_TABLE.put(3.091547381937533, 49.5-.5, 65, 3.05 - 2.0);
        SHOT_TABLE.put(3.6371098950713048, 54d-.5, 65, 3.33 - 2.08);
        SHOT_TABLE.put(3.8381558375194516, 55.9-.6, 65, 3.55 - 2.26);
        SHOT_TABLE.put(4.228989917893823, 57.9-.8, 65, 4.12 - 2.78);
        SHOT_TABLE.put(4.611644034532603, 60.4-1, 65, SHOT_TABLE.getShotToF(4.611644034532603));
        SHOT_TABLE.put(4.806505964322358, 63.5-1, 65, 3.85 - 2.41);
        SHOT_TABLE.put(5.0866738021581, 64.8d-.8, 65, 5.51 - 3.99);
        SHOT_TABLE.put(5.843456367540876, 73d-.3, 65, SHOT_TABLE.getShotToF(5.843456367540876));
      }
    }
}
