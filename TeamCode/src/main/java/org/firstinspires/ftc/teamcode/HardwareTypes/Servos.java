package org.firstinspires.ftc.teamcode.HardwareTypes;

import com.qualcomm.robotcore.hardware.Servo;

public enum Servos {
    CLAW_RIGHT("claw r", Servo.Direction.FORWARD, ServoTypes.LINKED),
    CLAW_LEFT("claw l", Servo.Direction.REVERSE, ServoTypes.LINKED),
    ARM("arm", Servo.Direction.FORWARD, ServoTypes.INDEPENDENT);

    private final String configName;
    private final Servo.Direction direction;
    private final ServoTypes type;

    Servos(String configName, Servo.Direction direction, ServoTypes type) {
        this.configName = configName;
        this.direction = direction;
        this.type = type;
    }

    public String getConfigName() {
        return configName;
    }

    public Servo.Direction getDirection() {
        return direction;
    }

    public ServoTypes getType() {
        return type;
    }
}