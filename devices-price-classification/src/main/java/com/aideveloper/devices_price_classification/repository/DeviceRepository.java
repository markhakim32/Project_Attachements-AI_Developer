package com.aideveloper.devices_price_classification.repository;

import com.aideveloper.devices_price_classification.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {
}
