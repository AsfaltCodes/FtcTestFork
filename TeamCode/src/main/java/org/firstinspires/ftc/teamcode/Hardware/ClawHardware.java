package org.firstinspires.ftc.teamcode.Hardware;

import android.annotation.SuppressLint;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class ClawHardware {

    public Servo clawServo1;
    public Servo clawServo2;


    public ClawHardware(HardwareMap hardwareMap){

        clawServo1 = hardwareMap.get(Servo.class, "cl1");

        clawServo2 = hardwareMap.get(Servo.class, "cl2");

    }

}
