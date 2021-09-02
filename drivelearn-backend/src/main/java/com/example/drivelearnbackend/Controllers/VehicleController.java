package com.example.drivelearnbackend.Controllers;

import com.example.drivelearnbackend.Controllers.DTO.VehicleDTO;
import com.example.drivelearnbackend.Sevices.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "vehicle")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

//    {
//        "regiNumner":"ABC-1234",
//            "ChacieNumber":"rkvd4234243",
//            "startingMilage":2000,
//            "status":1,
//            "branchName":"mathugama",
//            "vehicleType":"bike"
//    }
//    this is called when the function initially loading
    @PostMapping(value = "addvehicle")
    public void addVehicle(@RequestBody VehicleDTO dto){
        vehicleService.addVehicle(dto);
    }

    
}
