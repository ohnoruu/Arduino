int redLightPin = 12;
int greenLightPin = 13;
int delayTime = 500;
void setup() {
  // put your setup code here, to run once:
  pinMode(redLightPin, OUTPUT);
  pinMode(greenLightPin, OUTPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  digitalWrite(redLightPin, LOW);
  digitalWrite(greenLightPin, HIGH);
  delay(delayTime);
  digitalWrite(redLightPin, HIGH);
  digitalWrite(greenLightPin, LOW);
  delay(delayTime);
}
