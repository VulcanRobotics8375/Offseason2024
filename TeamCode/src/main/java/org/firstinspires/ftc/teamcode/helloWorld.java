package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class helloWorld extends OpMode{
    @Override
    public void init()
    {
        int testing = 5000;
        telemetry.addLine("hello world!");
        telemetry.addData("erm what the scallop!",testing);
    }

    @Override
    public void loop()
    {

    }
}