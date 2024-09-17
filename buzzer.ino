# include pitches.h
const int buzzerPin = 8;
int delayTime = 1000;
void setup() {
  pinMode(buzzerPin, OUTPUT);
}

void loop() {
  tone(buzzerPin, 1000);
  delay(delayTime);
  tone(buzzerPin,500);
  delay(delayTime);
}
