package better_example;

import better_example.abstraction.InsuranceSurveyor;

public class VehicleInsuranceSurveyor extends InsuranceSurveyor {
    public boolean isValidClaim() {
        System.out.println("VehicleInsuranceSurveyor: Validating vehicle insurance claim...");
        return true;
    }
}
