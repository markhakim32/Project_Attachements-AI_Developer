# Project_Attachements-AI_Developer


## Spring Boot Project Setup

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Maven or Gradle
- Python 3.x
- Spring Boot

### Project Structure
The project consists of two main parts:
1. Python Project: This project is responsible for predicting the prices of devices based on their specifications.
2. Spring Boot Project: This project provides RESTful endpoints to interact with the Python project and manage device data.


#### Note
## I didn’t use Spring Boot before, so I used resources from the internet and AI to help with this project. I also tested the API endpoints without Spring Boot using Postman, focusing only on predicting the price.


### API Endpoints
The following RESTful endpoints are available:

POST /api/devices/: Retrieve a list of all devices.
GET /api/devices/{id}: Retrieve details of a specific device by ID.
POST /api/devices: Add a new device.
POST /api/predict/{deviceId}: Call the Python API to predict the price and save the result in the device entity.


### Dataset columns are as follows:
    ■ id - ID
    ■ battery_power - Total energy a battery can store in one time measured in mAh
    ■ blue - Has Bluetooth or not
    ■ clock_speed - The speed at which the microprocessor executes instructions
    ■ dual_sim - Has dual sim support or not
    ■ fc - Front Camera megapixels
    ■ four_g - Has 4G or not
    ■ int_memory - Internal Memory in Gigabytes
    ■ m_dep - Mobile Depth in cm
    ■ mobile_wt - Weight of mobile phone
    ■ n_cores - Number of cores of the processor
    ■ pc - Primary Camera megapixels
    ■ px_height - Pixel Resolution Height
    ■ px_width - Pixel Resolution Width
    ■ ram - Random Access Memory in Megabytes
    ■ sc_h - Screen Height of mobile in cm
    ■ sc_w - Screen Width of mobile in cm
    ■ talk_time - longest time that a single battery charge will last when you are
    ■ three_g - Has 3G or not
    ■ touch_screen - Has touch screen or not
    ■ wifi - Has wifi or not
    ■ price_range - This is the target variable with the value of:
    ● 0 (low cost)
    ● 1 (medium cost)
    ● 2 (high cost)
    ● 3 (very high cost)


### Python Project
 ## DataSet: Devices specifications:
  ○ Train Data: train_data.csv
  ○ Test Data: test_data.csv


### Install the Required Dependencies:
   pip install -r requirements.txt
  ### requirements.txt file:
    ■ numpy==1.21.0
    ■ pandas==1.3.0
    ■ scikit-learn==0.24.2
    ■ flask==2.0.1
    ■ requests==2.25.1

## Run the Python Service:
python main.py

### Testing
## To test the prediction for 10 devices from the test dataset, you can use tools like Postman or cURL to send requests to the [ http://127.0.0.1:5000/predict/ ] endpoint. Here are ten example devices you can use for testing:
  ## Testing use Postman 
  ## Body (  ### JSON ) :
## Device 1:
{ "battery_power": 842, "blue": 0, "clock_speed": 2.2, "dual_sim": 1, "fc": 1, "four_g": 0, "int_memory": 7, "m_dep": 0.6, "mobile_wt": 188, "n_cores": 2, "pc": 2, "px_height": 20, "px_width": 756, "ram": 2549, "sc_h": 9, "sc_w": 7, "talk_time": 19, "three_g": 0, "touch_screen": 0, "wifi": 1 } 
## Device 2:
{ "battery_power": 1021, "blue": 1, "clock_speed": 0.5, "dual_sim": 1, "fc": 0, "four_g": 1, "int_memory": 53, "m_dep": 0.7, "mobile_wt": 136, "n_cores": 3, "pc": 6, "px_height": 905, "px_width": 1988, "ram": 2631, "sc_h": 17, "sc_w": 3, "talk_time": 7, "three_g": 0, "touch_screen": 1, "wifi": 0 } 
## Device 3:
{ "battery_power": 563, "blue": 1, "clock_speed": 0.5, "dual_sim": 1, "fc": 2, "four_g": 1, "int_memory": 41, "m_dep": 0.9, "mobile_wt": 145, "n_cores": 5, "pc": 6, "px_height": 1263, "px_width": 1716, "ram": 2603, "sc_h": 11, "sc_w": 2, "talk_time": 9, "three_g": 1, "touch_screen": 1, "wifi": 0 } 
## Device 4:
{ "battery_power": 615, "blue": 0, "clock_speed": 2.5, "dual_sim": 0, "fc": 13, "four_g": 1, "int_memory": 10, "m_dep": 0.8, "mobile_wt": 131, "n_cores": 6, "pc": 16, "px_height": 1216, "px_width": 1786, "ram": 2769, "sc_h": 12, "sc_w": 8, "talk_time": 11, "three_g": 1, "touch_screen": 1, "wifi": 1 } 
## Device 5:
{ "battery_power": 1821, "blue": 1, "clock_speed": 1.2, "dual_sim": 0, "fc": 3, "four_g": 0, "int_memory": 44, "m_dep": 0.6, "mobile_wt": 140, "n_cores": 8, "pc": 9, "px_height": 1208, "px_width": 1920, "ram": 1411, "sc_h": 19, "sc_w": 10, "talk_time": 15, "three_g": 1, "touch_screen": 0, "wifi": 1 } 
## Device 6:
{ "battery_power": 1859, "blue": 0, "clock_speed": 0.5, "dual_sim": 1, "fc": 0, "four_g": 1, "int_memory": 22, "m_dep": 0.7, "mobile_wt": 150, "n_cores": 4, "pc": 0, "px_height": 100, "px_width": 1960, "ram": 513, "sc_h": 16, "sc_w": 8, "talk_time": 5, "three_g": 1, "touch_screen": 0, "wifi": 1 } 
## Device 7:
{ "battery_power": 1821, "blue": 1, "clock_speed": 1.2, "dual_sim": 0, "fc": 3, "four_g": 0, "int_memory": 44, "m_dep": 0.6, "mobile_wt": 140, "n_cores": 8, "pc": 9, "px_height": 1208, "px_width": 1920, "ram": 1411, "sc_h": 19, "sc_w": 10, "talk_time": 15, "three_g": 1, "touch_screen": 0, "wifi": 1 } 
## Device 8:
{ "battery_power": 1969, "blue": 0, "clock_speed": 2.0, "dual_sim": 1, "fc": 1, "four_g": 1, "int_memory": 39, "m_dep": 0.8, "mobile_wt": 122, "n_cores": 7, "pc": 18, "px_height": 1137, "px_width": 1719, "ram": 390, "sc_h": 5, "sc_w": 2, "talk_time": 20, "three_g": 1, "touch_screen": 1, "wifi": 0 } 
## Device 9:
{ "battery_power": 1821, "blue": 1, "clock_speed": 1.2, "dual_sim": 0, "fc": 3, "four_g": 0, "int_memory": 44, "m_dep": 0.6, "mobile_wt": 140, "n_cores": 8, "pc": 9, "px_height": 1208, "px_width": 1920, "ram": 1411, "sc_h": 19, "sc_w": 10, "talk_time": 15, "three_g": 1, "touch_screen": 0, "wifi": 1 } 
## Device 10:
{ "battery_power": 1969, "blue": 0, "clock_speed": 2.0, "dual_sim": 1, "fc": 1, "four_g": 1, "int_memory": 39, "m_dep": 0.8, "mobile_wt": 122, "n_cores": 7, "pc": 18, "px_height": 1137, "px_width": 1719, "ram": 390, "sc_h": 5, "sc_w": 2, "talk_time": 20, "three_g": 1, "touch_screen": 1, "wifi": 0 }


#### Note
## I didn’t use Spring Boot before, so I used resources from the internet and AI to help with this project. I also tested the API endpoints without Spring Boot using Postman, focusing only on predicting the price.
