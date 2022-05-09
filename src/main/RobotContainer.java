package frc.robot;

import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.robot.subsystems.drivetrain.Drivetrain;
import frc.robot.util.XboxController;

int FrontRight = FrontRight;
int FrontLeft = FrontLeft;
int BackRight = BackRight;
int BackLeft = BackLeft;

int FrontRightForward = FrontRightForward;
int FrontLeftForward = FrontLeftForward;
int BackRightForward = BackRightForward;
int BackLeftForward = BackLeftForward;

int FrontRightBackward = FrontRightBackward;
int FrontLeftBackward = FrontLeftBackward;
int BackRightBackward = BackRightBackward;
int BackLeftBackward = BackLeftBackward;

int FrontRightTurnRight= FrontRightTurnRight;
int FrontLeftTurnRight = FrontLeftTurn ight;
int BackRightTurnRight = BackRightTurnRight;
int BackLeftTurnRight = BackLeftTurnRight;

int FrontRightTurnLeft= FrontRightTurnLeft;
int FrontLeftTurnLeft = FrontLeftTurnLeft;
int BackRightTurnLeft = BackRightTurnLeft;
int BackLeftTurnLeft = BackLeftTurnLeft;

public class RobotContainer {
    private final XboxController driverController = new XboxController(0);
    private final XboxController manipulatorController = new XboxController(1);

    private final Drivetrain drivetrain = new Drivetrain();

    public RobotContainer(){
        drivetrain.setDefaultCommand(new RunCommand(() -> {
            drivetrain.drive(
                driverController.getAxisValue(XboxController.Axis.LEFT_Y),
                driverController.getAxisValue(XboxController.Axis.RIGHT_X)
            );
        }, drivetrain));
    }
}

FrontRightForward (23, 0.9);
FrontLeftForward (23, 0.9);
BackLeftForward (23, 0.9);
BackRightForward (23, 0.9);

FrontRightTurnRight (23, 0.9);
FrontLeftTurnRight(23, 0.9);
BackLeftTurnRight(23, 0.9);
BackRightTurnRight (23, 0.9);

FrontRightForward (23, 0.9);
FrontLeftForward (23, 0.9);
BackLeftForward (23, 0.9);
BackRightForward (23, 0.9);

FrontRightTurnRight (23, 0.9);
FrontLeftTurnRight(23, 0.9);
BackLeftTurnRight(23, 0.9);
BackRightTurnRight (23, 0.9);

FrontRightForward (23, 0.9);
FrontLeftForward (23, 0.9);
BackLeftForward (23, 0.9);
BackRightForward (23, 0.9);
