package better_example;

import better_example.abstraction.InsuranceSurveyor;

public class HealthInsuranceSurveyor extends InsuranceSurveyor {
    public boolean isValidClaim() {
        System.out.println("HealthInsuranceSurveyor: Validating health insurance claim...");
        return true;
    }
}
