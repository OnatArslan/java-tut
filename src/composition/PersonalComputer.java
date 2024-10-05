package composition;

public class PersonalComputer extends Product {
    /* This is like using models in model like one to many or many-to-many relationships */
    private Monitor monitor;
    private Motherboard motherboard;
    private ComputerCase computerCase;

    public PersonalComputer(String model, String manufacturer, Monitor monitor, Motherboard motherboard, ComputerCase computerCase) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.computerCase = computerCase;
    }

    public PersonalComputer(String model, String manufacturer) {
        super(model, manufacturer);
    }

   /* public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }*/

    private void drawLogo(){
        this.monitor.drawPixelAt(1200, 50, "yellow");
    }

    public void powerUp() {
        this.computerCase.pressPowerButton();
        this.drawLogo();
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "monitor=" + monitor +
                ", motherboard=" + motherboard +
                ", computerCase=" + computerCase +
                "} " + super.toString();
    }
}
