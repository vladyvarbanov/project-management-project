package com.mycompany.propertymanagement.service;

import com.mycompany.propertymanagement.dto.PropertyDTO;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PropertyService {

    PropertyDTO saveProperty(PropertyDTO propertyDTO);
    List<PropertyDTO> getAllProperties();
    PropertyDTO updateProperty( PropertyDTO propertyDTO, Long propertyID);
    PropertyDTO updatePropertyDescription(@RequestBody PropertyDTO propertyDTO, Long propertyID);
    PropertyDTO updatePropertyPrice(@RequestBody PropertyDTO propertyDTO, Long propertyID);
    void deleteProperty(Long propertyID);
}
