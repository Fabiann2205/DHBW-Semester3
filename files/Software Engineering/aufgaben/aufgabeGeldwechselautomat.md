# Aufgabe Geldwechselautomat

```
BEGINN Geldwechselautomat
FALLS Eingabe IST
    10: RUFE 10 auf
    5: RUFE 5 auf
    2: RUFE 2 auf
ENDE-FALLS
ENDE Geldwechselautomat

BEGINN 10
    Gebe 5 DM aus
    RUFE 5 auf
ENDE 10

BEGINN 5
    WIEDERHOLE von 1 bis 2
        Gebe 2 DM aus
    ENDE-WIEDERHOLE
    Gebe 1 DM aus
ENDE 5

BEGINN 2
    WIEDERHOLE von 1 bis 2
        Gebe 1 DM aus
    ENDE-WIEDERHOLE
ENDE 2
```