int redLightPin = 12;
int greenLightPin = 13;
int delayTime = 500;
int brightness = 0;
void setup() {
  // put your setup code here, to run once:
  pinMode(redLightPin, OUTPUT);
  pinMode(greenLightPin, OUTPUT);
}

void loop() {
  brightness += 1;
  analogWrite(greenLightPin, brightness);
  delay(5);
}
