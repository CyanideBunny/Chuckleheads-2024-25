// package org.firstinspires.ftc.teamcode.HuskyLens;

// import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
// import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
// import com.qualcomm.robotcore.eventloop.opmode.Disabled;
// import com.qualcomm.robotcore.hardware.DcMotor;
// import com.qualcomm.robotcore.util.ElapsedTime;
// import com.qualcomm.robotcore.util.Range;
// import org.firstinspires.ftc.teamcode.HuskyLens.*;

// @TeleOp(name="Concept", group="Linear Opmode")

// public class Concept extends LinearOpMode {
    
//     HuskyLens husky;

//     @Override
//     public void runOpMode() {

//         husky = hardwareMap.get(HuskyLens.class, "husky");

//         telemetry.addData("Status", "Initialized");
//         telemetry.update();
//         // Wait for the game to start (driver presses PLAY)
//         waitForStart();
//         husky.cmdRequestAlgorithm(husky.);
//         // run until the end of the match (driver presses STOP)
//         while (opModeIsActive()) {

//             husky.cmdRequest(husky.BLOCKS);
            
//             int l = husky.blocks.length;
//             telemetry.addData("blocks", l);
//             for (int i = 0; i < l; i++) {
//                 telemetry.addData("block" + i, husky.blocks[i].id());
//             }
//             telemetry.update();
//         }
//     }
// }
