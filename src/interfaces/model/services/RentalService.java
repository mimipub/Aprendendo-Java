package interfaces.model.services;

import interfaces.model.entities.CarRental;
import interfaces.model.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private Double priceperhour;
    private Double priceperday;

    private TaxServices brazilTaxService;

    public RentalService(Double priceperhour, Double priceperday, TaxServices brazilTaxService) {
        this.priceperhour = priceperhour;
        this.priceperday = priceperday;
        this.brazilTaxService = brazilTaxService;
    }

    public Double getPriceperhour() {
        return priceperhour;
    }

    public void setPriceperhour(Double priceperhour) {
        this.priceperhour = priceperhour;
    }

    public Double getPriceperday() {
        return priceperday;
    }

    public void setPriceperday(Double priceperday) {
        this.priceperday = priceperday;
    }

    public void setBrazilTaxService(BrazilTaxService brazilTaxService) {
        this.brazilTaxService = brazilTaxService;
    }

    public void processInvoice(CarRental carRental){
        double duration = Duration.between(carRental.getStart(),carRental.getFinish()).toMinutes();
        double hours = duration/60;

        double basicPay;
        if( hours < 12){
            basicPay = priceperhour*Math.ceil(hours);
        }else{
            basicPay = priceperhour*Math.ceil(hours/24.0);
        }

        double tax = brazilTaxService.Tax(basicPay);

        carRental.setInvoice(new Invoice(basicPay,tax));
    }
}
