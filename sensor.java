#include <HCSR04.h>

const byte triggerPin = 9;
const byte echoPin = 10;

int blueLEDPin = 11;
int whiteLEDPin = 12; 
int redLEDPin = 13;

UltraSonicDistanceSensor distanceSensor (triggerPin, echoPin);

void setup() {
  Serial.begin(9600); //initialize serial connection
}

void loop() {
  float distance = distanceSensor.measureDistanceCm();
  Serial.println(distance);
  delay(250);
  
  if (distance < 20){
    digitalWrite(blueLEDPin, HIGH);
    digitalWrite(whiteLEDPin, HIGH);
    digitalWrite(redLEDPin, HIGH);
  } else {
    digitalWrite(blueLEDPin, LOW);
    digitalWrite(whiteLEDPin, LOW);
    digitalWrite(redLEDPin, LOW);
  }
}
