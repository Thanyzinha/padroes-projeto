public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("A123", "Scania R500", 2022);

        OldVehicleStorage legacyStorage = new OldVehicleStorage();

        IVehicleStorage storage = new VehicleStorageAdapter(legacyStorage);

        storage.saveVehicleData(vehicle);
    }
}
