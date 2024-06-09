import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.ensemble import RandomForestClassifier
from sklearn.metrics import classification_report, confusion_matrix
import joblib
from flask import Flask, request, jsonify



# Initialize Flask app
app = Flask(__name__)

# Load data
train_df = pd.read_csv('train_data.csv')
test_df = pd.read_csv('test_data.csv')

# Print columns to check
print("Train Data Columns: ", train_df.columns)
print("Test Data Columns: ", test_df.columns)




# Data Preparation
# Ensure the columns exist before dropping them
# Drop 'price_range' from features (X) and keep it as target variable (y)
if 'id' in train_df.columns:
    X = train_df.drop(['price_range', 'id'], axis=1)
else:
    X = train_df.drop(['price_range'], axis=1)

y = train_df['price_range']

# Split the data into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Model Training
# Using RandomForestClassifier with 100 trees
model = RandomForestClassifier(n_estimators=100, random_state=42)
model.fit(X_train, y_train)

# Evaluate the model on the test set
y_pred = model.predict(X_test)
print('classification report: \n',classification_report(y_test, y_pred))
print(confusion_matrix(y_test, y_pred))

# Save the model and load 
joblib.dump(model, 'device_price_model.pkl')
model = joblib.load('device_price_model.pkl')



# Flask app
# Define the predict endpoint
@app.route('/predict', methods=['POST'])
def predict():
    # Get the JSON data from the request
    data = request.get_json(force=True)
    # input_data = np.array([data['battery_power'], data['blue'], data['clock_speed'], data['dual_sim'],
    #                        data['fc'], data['four_g'], data['int_memory'], data['m_dep'],
    #                        data['mobile_wt'], data['n_cores'], data['pc'], data['px_height'],
    #                        data['px_width'], data['ram'], data['sc_h'], data['sc_w'],
    #                        data['talk_time'], data['three_g'], data['touch_screen'], data['wifi']]).reshape(1, -20)
    
    
    # Convert JSON data to DataFrame
    input_data = pd.DataFrame([data])
    # Drop 'id' column if it exists
    if 'id' in input_data.columns:
        input_data = input_data.drop('id', axis=1)
    
    
    # Make prediction using the trained model
    prediction = model.predict(input_data)
    # Return the predicted price range as JSON response
    return jsonify({'price_range': int(prediction[0])})


# Run the Flask app
if __name__ == '__main__':
    app.run(debug=True)
