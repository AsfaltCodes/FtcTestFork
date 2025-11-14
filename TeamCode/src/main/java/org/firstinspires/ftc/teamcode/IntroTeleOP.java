package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class IntroTeleOP extends LinearOpMode {

    DcMotor prMotor;


    @Override
    public void runOpMode() throws InterruptedException {

        prMotor = hardwareMap.dcMotor.get("test");
        while (opModeIsActive()){

            float x;

            x = gamepad1.left_stick_x;

            prMotor.setPower(x);

        }

    }
}
