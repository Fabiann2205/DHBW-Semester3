# Pseudocode Ampel

## Skript

```
BEGINN Ampelschaltung
    WENN Ampel IST grün
        DANN fahren
    ODER-WENN Ampel IST rot
        DANN stoppen
        WENN Grünpfeil IST vorhanden UND Verkehr von links IST frei
            DANN fahren
    ODER-WENN Ampel IST gelb
        WENN Bremsweg IST ausreichend
            DANN stoppen
        ODER-WENN Bremsweg IST NICHT ausreichend
            DANN fahren
        ENDE-WENN
    ENDE-WENN
ENDE Ampelschaltung
```