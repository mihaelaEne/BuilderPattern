public class MotorCycleBuilder implements Builder{
    MotorCycle motorCycle;
    public MotorCycleBuilder() {



        motorCycle=new MotorCycle("Honda");     }
    @Override
    public Builder addBrandName() {
        motorCycle.add(" Adding the brand name: " +
                motorCycle.brandName);
        return this;
    }

    @Override
    public Builder buildbody() {
        motorCycle.add(" Making the body of the motorcycle.");
        return this;

    }
    @Override
    public Builder insertWheels() {
        motorCycle.add(" 2 wheels are added to the motorcycle.");
        return this;
    }
    @Override
    public Vehicle getVehicle() {
        return motorCycle;
    }
}

