# include "pitches.h"
const int buzzerPin = 8;
int delayTime = 1000;

int melody[] = {
  NOTE_C4, NOTE_G3, NOTE_G3, NOTE_A3, NOTE_G3, 0, NOTE_B3, NOTE_C4
};

int noteDurations[] = {

  4, 8, 8, 4, 4, 4, 4, 4
};

void setup() {
  /*
  pinMode(buzzerPin, OUTPUT);
  */
  for (int thisNote = 0; thisNote < 8; thisNote++){
    int noteDuration = 1000 / noteDurations[thisNote];
    tone(8, melody[thisNote], noteDuration);
    int pauseBetweenNotes = noteDuration * 1.30;
    delay(pauseBetweenNotes);
    noTone(8);
  }
}

void loop() {
  /*
  tone(buzzerPin, 1000);
  delay(delayTime);
  tone(buzzerPin,500);
  delay(delayTime);
  */
}
