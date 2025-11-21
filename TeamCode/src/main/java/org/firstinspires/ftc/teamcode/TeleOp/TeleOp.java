package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Constants.Constants;
import org.firstinspires.ftc.teamcode.Subsystems.Claw;

public class TeleOp extends LinearOpMode {

    public Claw claw;
    public Constants constants;

    @Override
    public void runOpMode() throws InterruptedException {

        claw = new Claw();
        claw.ClawAngle(constants.clawAngle);
        waitForStart();
        while (opModeIsActive()){

                if(gamepad1.a) claw.ClawOpen();

                if (gamepad1.b) claw.ClawClose();

                while (gamepad1.dpad_up) {
                    constants.clawAngle+=0.1;
                    claw.ClawAngle(constants.clawAngle);
                }
                while (gamepad1.dpad_down) {
                    constants.clawAngle-=0.1;
                    claw.ClawAngle(constants.clawAngle);
                }

        }
    }
}
