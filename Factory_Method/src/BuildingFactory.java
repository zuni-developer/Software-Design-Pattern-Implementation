public class BuildingFactory {

    // use getBuilding method to get object of type Building
    public Building getBuilding(String buildingType) {
        if(buildingType == null){
            return null;
        }
        if(buildingType.equalsIgnoreCase("HOME")) {
            return new Home();
        }
        else if(buildingType.equalsIgnoreCase("HOUSE")) {
            return new House();
        }
        else if(buildingType.equalsIgnoreCase("HUT")) {
            return new Hut();
        }
        return null;
    }
}
