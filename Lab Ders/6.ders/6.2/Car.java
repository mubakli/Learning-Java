public class Car implements ElectronicComponents,MotorComponents{
    private static boolean engineIsStarted = false;
    @Override
    public void openRadio() {
        System.out.println("Radio is on.");
    }

    @Override
    public void closeRadio() {
        System.out.println("Radio is off.");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume up.");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume down.");
    }

    @Override
    public void wipersOn() {
        System.out.println("Wipers is on.");
    }

    @Override
    public void wipersOff() {
        if(engineIsStarted){
        System.out.println("wipers is off.");}
        else
            System.out.println("Engine is not started!!");
    }

    @Override
    public void engineStart() {
        if(!engineIsStarted) {
            System.out.println("Engine Started.");
            engineIsStarted = true;
        }
        else{
            System.out.println("Engine already started!!");
        }
    }

    @Override
    public void engineStop() {
        System.out.println("Engine stopped.");
    }
}
