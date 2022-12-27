class DriverCategoryD extends Driver{

    String driverLicenseCategory;

    public DriverCategoryD(String driverName, boolean haveDriverLicense, int driverExperience) {
        super(driverName, haveDriverLicense, driverExperience);

        this.driverLicenseCategory = "D";
    }
}