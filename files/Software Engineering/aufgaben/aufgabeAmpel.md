# Pseudocode Ampel

```
BEGINN Ampelschaltung
    WENN Ampel IST grün
        DANN fahren
    ODER-WENN Ampel IST rot
        DANN stoppen
    ODER-WENN Ampel IST gelb
        WENN Bremsweg IST ausreichend
            DANN stoppen
        ODER-WENN Bremsweg IST NICHT ausreichend
            DANN fahren
        ENDE-WENN
    ENDE-WENN
ENDE Ampelschaltung
```