#include "Button.h"

int redLEDPin = 13; 
int whiteLEDPin = 12;
Button btn = Button(2);
int delayTime = 500;

void setup() {
  // put your setup code here, to run once:
  pinMode(redLEDPin, OUTPUT);
  pinMode(whiteLEDPin, OUTPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  if (btn.pressed()) {
    digitalWrite(redLEDPin, HIGH);
    digitalWrite(whiteLEDPin, LOW);
    delay(delayTime);
    digitalWrite(redLEDPin, LOW);
    digitalWrite(whiteLEDPin, HIGH);
    delay(delayTime);
  } else if (btn.released()) {
    digitalWrite(redLEDPin, LOW);
    digitalWrite(whiteLEDPin, LOW);
  }
}
