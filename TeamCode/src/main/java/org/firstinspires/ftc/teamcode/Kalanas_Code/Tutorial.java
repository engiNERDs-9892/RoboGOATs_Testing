package org.firstinspires.ftc.teamcode.Kalanas_Code;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp (name = "tutorial", group = "linear OpMode")
public class Tutorial extends LinearOpMode {

    @Override
    public void runOpMode() {
        telemetry.addData("status", "Init");
        telemetry.update();

        waitForStart();

        while (opModeIsActive()) {
            telemetry.addData("Hello", "my name is Kalana");
            telemetry.update();
        }

    }
}