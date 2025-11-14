package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class IntroTeleOP extends LinearOpMode {

    DcMotor dcMotor;


    @Override
    public void runOpMode() throws InterruptedException {

        dcMotor = hardwareMap.dcMotor.get("test");
        waitForStart();
        while (opModeIsActive()){

            dcMotor.setPower(1);


        }

    }
}
