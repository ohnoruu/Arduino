#include "Button.h"

int redLEDPin = 13; 
int whiteLEDPin = 12;
int greenLEDPin = 11;
Button btn = Button(2);
int delayTime = 500;

bool isFlickering = false; //tracks if LEDs should flicker 
int toggleState = 0; //tracks which LED is on (0 = red, 1 = white, 2 = green)

void setup() {
  // put your setup code here, to run once:
  pinMode(redLEDPin, OUTPUT);
  pinMode(whiteLEDPin, OUTPUT);
  digitalWrite(redLEDPin, LOW);
  digitalWrite(whiteLEDPin, LOW);
  digitalWrite(greenLEDPin, LOW);
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
    digitalWrite(greenLEDPin, LOW);
  }

  if (isFlickering) {
    if (toggleState == 0) {
      digitalWrite(redLEDPin, HIGH);
      digitalWrite(whiteLEDPin, LOW);
      digitalWrite(greenLEDPin, LOW);
    }
    if (toggleState == 1) {
      digitalWrite(redLEDPin, LOW);
      digitalWrite(whiteLEDPin, HIGH);
      digitalWrite(greenLEDPin, LOW);
    }
    if (toggleState == 2) {
      digitalWrite(redLEDPin, LOW);
      digitalWrite(whiteLEDPin, LOW);
      digitalWrite(greenLEDPin, HIGH);
    }
    toggleState = (toggleState+1)%3;
    delay(delayTime);
  }
}
