package com.aideveloper.devices_price_classification.controller;

import com.aideveloper.devices_price_classification.entity.Device;
import com.aideveloper.devices_price_classification.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/devices")
public class DeviceController {

    private final DeviceService deviceService;
    private final RestTemplate restTemplate;

    @Autowired
    public DeviceController(DeviceService deviceService, RestTemplate restTemplate) {
        this.deviceService = deviceService;
        this.restTemplate = restTemplate;
    }

    @PostMapping("/predict/{deviceId}")
    public ResponseEntity<String> predictPrice(@PathVariable Long deviceId) {
        // Fetch device details from the database using deviceId
        Device device = deviceService.getDeviceById(deviceId);

        if (device == null) {
            return ResponseEntity.notFound().build();
        }

        // Prepare the request body
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("battery_power", device.getBatteryPower());
        requestBody.put("blue", device.isBlue());
        // Add other device attributes as needed

        // Make a POST request to the Flask API to predict the price
        String predictionUrl = "http://127.0.0.1:5000/predict";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Map<String, Object>> requestEntity = new HttpEntity<>(requestBody, headers);
        ResponseEntity<String> responseEntity = restTemplate.exchange(predictionUrl, HttpMethod.POST, requestEntity, String.class);

        return responseEntity;
    }
}
