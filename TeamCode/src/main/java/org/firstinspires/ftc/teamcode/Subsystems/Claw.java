package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Constants.Constants;
import org.firstinspires.ftc.teamcode.Hardware.ClawHardware;

public class Claw {
    public ClawHardware clawHardware;
    public Constants clawConstants;
    public HardwareMap hardwareMap;




    public Claw(){
        clawHardware = new ClawHardware(hardwareMap);
       clawConstants = new Constants();

    }

    public void ClawOpen(){

        clawHardware.clawServo1.setPosition(clawConstants.clawOpen);

        clawHardware.clawServo2.setPosition(clawConstants.clawOpen);

    }

    public void ClawClose(){

        clawHardware.clawServo1.setPosition(0);

        clawHardware.clawServo2.setPosition(0);

    }


}
