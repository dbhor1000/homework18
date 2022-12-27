class DriverCategoryB extends Driver{       //Подкласс водителей с правами категории Б

    String driverLicenseCategory;


    public DriverCategoryB(String driverName, boolean haveDriverLicense, int driverExperience) {
        super(driverName, haveDriverLicense, driverExperience);


        this.driverLicenseCategory = "B";

    }

}