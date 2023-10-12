# Würfelspiel Pseudocode

```
BEGINN Würfelspiel

    WIEDERHOLE bis ein Spieler alle Felder ausgefüllt hat
        Rufe Würfeln auf
        
        Wiederholen bis Ein Ergebnis gespeichert werden konnte 
                    ODER maximal 4 mal
            Rufe Auswertung auf
            Rufe Speichern auf
        ENDE-WIEDERHOLEN
        
        WENN kein Ergebnis gespeichert
            Addiere in die Liste zu anderen Ergebnissen hinzu
    
    ENDE-WIEDERHOLE
    Lese alle Listen der einzelnen Spieler und addiere alle Punktzahlen
    Spieler mit max Punktzahl gewinnt.
ENDE Würfelspiel

// Es wird maximal 3 mal gewürfelt.
BEGINN Würfeln
    WIEDERHOLE von 1 bis max 3
        würfeln
    ENDE-WIEDERHOLE
ENDE Würfeln

BEGINN Speichern
    WENN Ergebnispunktzahl NICHT vorhanden in Liste
        DANN Schreibe in Liste für gegebene Punktzahl
    SONST Rufe Auswertung aus
ENDE Speichern

BEGINN Auswertung
    WENN 3 Würfel haben die selbe Agenzahl
        DANN WENN 2 andere Würfel haben selbe Augenzahl
                DANN 60
             SONST 20
    ODER-WENN 4 Würfel haben die selbe Augenzahl
        DANN 50
    ODER-WENN 5 Würfel haben die selbe Augenzahl
        DANN 100
    ENDE-WENN
ENDE Auswertung
```