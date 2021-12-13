package ru.mirea.task28;

public class Automobile {
    public enum TireType {
        Studded,
        OffRoad,
        Road,
        RacingSlick
    }

    public enum TransmissionType {
        Robot,
        Mechanical,
        VariableSpeedDrive,
        AutomaticTransmission
    }

    public static class Wheel {
        private double wheelPressure;
        private TireType type;

        public Wheel(double wheelPressure, TireType type) {
            this.wheelPressure = wheelPressure;
            this.type = type;
        }

        public double getWheelPressure() {
            return wheelPressure;
        }

        public void setWheelPressure(double wheelPressure) {
            this.wheelPressure = wheelPressure;
        }

        public TireType getType() {
            return type;
        }

        public void setType(TireType type) {
            this.type = type;
        }
    }

    public static class Engine {
        private double volume;
        private int pointsOfHorsePower;

        public Engine(double volume, int pointsOfHorsePower) {
            this.volume = volume;
            this.pointsOfHorsePower = pointsOfHorsePower;
        }

        public double getVolume() {
            return volume;
        }

        public void setVolume(double volume) {
            this.volume = volume;
        }

        public int getPointsOfHorsePower() {
            return pointsOfHorsePower;
        }

        public void setPointsOfHorsePower(int pointsOfHorsePower) {
            this.pointsOfHorsePower = pointsOfHorsePower;
        }
    }

    public static class Transmission {
        private int adhesionDegree;
        private TransmissionType transmissionType;

        public Transmission(int adhesionDegree, TransmissionType transmissionType) {
            this.adhesionDegree = adhesionDegree;
            this.transmissionType = transmissionType;
        }

        public int getAdhesionDegree() {
            return adhesionDegree;
        }

        public void setAdhesionDegree(int adhesionDegree) {
            this.adhesionDegree = adhesionDegree;
        }

        public TransmissionType getTransmissionType() {
            return transmissionType;
        }

        public void setTransmissionType(TransmissionType transmissionType) {
            this.transmissionType = transmissionType;
        }
    }

    private Wheel wheel;
    private Engine engine;
    private Transmission transmission;

    public Automobile(Wheel wheel, Engine engine, Transmission transmission) {
        this.wheel = wheel;
        this.engine = engine;
        this.transmission = transmission;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
}
