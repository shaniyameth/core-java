class RobotFactory {

    public static void main(String[] args) {

        
        double powerConsumption;
        boolean productionActive;
        int robotQuantity;
        char factoryZone;
        String modelName;

        
        powerConsumption = 45678.90;
        productionActive = true;
        robotQuantity = 120;
        factoryZone = 'C';
        modelName = "RX-900";

       
        System.out.println("Model Name: " + modelName);
        System.out.println("Robot Quantity: " + robotQuantity);
        System.out.println("Power Consumption: " + powerConsumption);
        System.out.println("Factory Zone: " + factoryZone);
        System.out.println("Production Active: " + productionActive);

       
        powerConsumption = 38900.55;
        productionActive = false;
        robotQuantity = 75;
        factoryZone = 'A';
        modelName = "ZX-300";

        System.out.println("---- After Production Update ----");

        System.out.println("Model Name: " + modelName);
        System.out.println("Robot Quantity: " + robotQuantity);
        System.out.println("Power Consumption: " + powerConsumption);
        System.out.println("Factory Zone: " + factoryZone);
        System.out.println("Production Active: " + productionActive);
    }
}