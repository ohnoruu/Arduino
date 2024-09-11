#include "Button.h"

int redLEDPin = 13; 
int whiteLEDPin = 12;
Button btn = Button(2);
int delayTime = 500;

bool isFlickering = false; //tracks if LEDs should flicker 
bool toggleState = false; //tracks which LED is on 

void setup() {
  // put your setup code here, to run once:
  pinMode(redLEDPin, OUTPUT);
  pinMode(whiteLEDPin, OUTPUT);
  digitalWrite(redLEDPin, LOW);
  digitalWrite(whiteLEDPin, LOW);
}

void loop() {
  // put your main code here, to run repeatedly:
  if (btn.pressed()) {
    isFlickering = true; 
  }

  if (btn.released()) {
    isFlickering = false; 
    digitalWrite(redLEDPin, LOW);
    digitalWrite(whiteLEDPin, LOW);
  }

  if (isFlickering) {
    if (toggleState) {
      digitalWrite(redLEDPin, HIGH);
      digitalWrite(whiteLEDPin, LOW);
    } else {
      digitalWrite(redLEDPin, LOW);
      digitalWrite(whiteLEDPin, HIGH);
    }
    toggleState = !toggleState;
    delay(delayTime);
  }
}
