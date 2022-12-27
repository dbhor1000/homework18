
class DriverCategoryC extends Driver{

    String driverLicenseCategory;

    public DriverCategoryC(String driverName, boolean haveDriverLicense, int driverExperience) {
        super(driverName, haveDriverLicense, driverExperience);


        this.driverLicenseCategory = "C";
    }

}