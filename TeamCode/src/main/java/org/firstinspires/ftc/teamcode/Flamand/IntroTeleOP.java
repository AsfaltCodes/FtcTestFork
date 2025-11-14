package org.firstinspires.ftc.teamcode.Flamand;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/* Clasa asta are scopul de a misca bratu.... */


public class IntroTeleOP extends LinearOpMode {
//declarari motooare
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
