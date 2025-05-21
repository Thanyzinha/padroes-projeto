public class VehicleStorageAdapter implements IVehicleStorage {

    private OldVehicleStorage oldStorage;

    public VehicleStorageAdapter(OldVehicleStorage oldStorage) {
        this.oldStorage = oldStorage;
    }

    @Override
    public void saveVehicleData(Vehicle vehicle) {
        String legacyData = formatForLegacy(vehicle);
        oldStorage.storeVehicleData(legacyData);
    }

    private String formatForLegacy(Vehicle v) {
        return String.format("ID=%s|MODEL=%s|YEAR=%d", v.getId(), v.getModel(), v.getYear());
    }
}
