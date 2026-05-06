package frc.robot.utils;

import edu.wpi.first.wpilibj.RobotBase;

public class RobotMode {

    public enum Mode{
        REAL,
        SIM,
        REPLAY
    }

    public static final Mode simMode = Mode.SIM;
    public static final Mode currentMode = RobotBase.isReal() ? Mode.REAL : simMode;

}
