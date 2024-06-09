package com.aideveloper.devices_price_classification.service;

import com.aideveloper.devices_price_classification.entity.Device;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeviceService {

    private final List<Device> devices = new ArrayList<>();

    public List<Device> getAllDevices() {
        return devices;
    }

    public Device getDeviceById(Long id) {
        // Implement logic to retrieve a device by its ID
        return null;
    }

    public Device addDevice(Device device) {
        devices.add(device);
        return device;
    }
}
