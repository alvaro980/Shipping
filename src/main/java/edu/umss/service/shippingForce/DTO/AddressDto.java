package edu.umss.service.shippingForce.DTO;

import edu.umss.service.shippingForce.model.Address;

public class AddressDto extends DtoBase<Address> {
    private String city;
    private Long stateProvinceID;
    private Long postCode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getStateProvinceID() {
        return stateProvinceID;
    }

    public void setStateProvinceID(Long stateProvinceID) {
        this.stateProvinceID = stateProvinceID;
    }

    public Long getStatePostCode() {
        return postCode;
    }

    public void setStatePostCode(Long postCode) {
        this.postCode = postCode;
    }
}
