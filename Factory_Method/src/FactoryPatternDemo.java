public class FactoryPatternDemo {

    public static void main(String[] args) {

        BuildingFactory buildingFactory = new BuildingFactory();

        Building b1 = buildingFactory.getBuilding("HOME");
        b1.build();

        Building b2 = buildingFactory.getBuilding("HOUSE");
        b2.build();

        Building b3 = buildingFactory.getBuilding("HUT");
        b3.build();
    }
}
