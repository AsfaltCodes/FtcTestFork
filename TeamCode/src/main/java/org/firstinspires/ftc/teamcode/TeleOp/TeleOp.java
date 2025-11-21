package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Subsystems.Claw;

public class TeleOp extends LinearOpMode {

    public Claw claw;

    @Override
    public void runOpMode() throws InterruptedException {

        claw = new Claw();

        waitForStart();
        while (opModeIsActive()){

                if(gamepad1.a) claw.ClawOpen();

                if (gamepad1.b) claw.ClawClose();


        }
    }
}
