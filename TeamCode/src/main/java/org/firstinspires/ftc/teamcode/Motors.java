package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
class MecanumTeleOp extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor flMotor = hardwareMap.dcMotor.get("frontLeftMotor");
        DcMotor blMotor = hardwareMap.dcMotor.get("backLeftMotor");
        DcMotor frMotor = hardwareMap.dcMotor.get("frontRightMotor");
        DcMotor brMotor = hardwareMap.dcMotor.get("backRightMotor");
    }
}