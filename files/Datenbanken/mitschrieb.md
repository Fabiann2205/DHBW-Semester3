# Datenbanken

## Vorlesung 12.10.2023

### Informationen

- Ulrich Ehrhardt
- eh@infokom.info
- 0175/7232052

### Klassifikation von Daten

- Stammdaten: unveränderlich über längeren Zeitraum, Identifizierung
- Änderungsdaten: abwicklungsorientierte Daten, lösen fallweise Änderung von Stammdaten aus
- Bestandsdaten: permanente Änderung, betriebliche Mengen- und Wertestruktur
- Bewegungsdaten: abwicklungsorientierte Daten, lösen Änderung von Bestandsdaten aus (durch betriebliche
  Leistungsprozesse)

- Unstrukturierte Daten: kein festes Format, benötigt Intelligenz zur Verarbeitung
- Semistrukturierte Daten: vorgegebene Anordnung, jedoch nicht verbindlich
- Strukturierte Daten: fest vorgegebene Anordnung, wird systemseitig überwacht (Semantik muss beschrieben werden)

<img src="bilder/DBMS.png" alt="Datenbankmanagementsystem">

### Datenbank Vorteile:

- Vermeidung von Redundanz
- Verhinderung von Inkonsistenz
- Datensicherheit
- Integritätssicherung
- Datenschutz, besonders seit der DSGVO
- Synchronisation im Mehrbenutzerbetrieb

### Alte Datenmodelle (NICHT KA)

- Hierarchisches Datenmodell
- Netzwerkorientiertes Datenmodell
- Relationales Datenmodell (später wichtig)
- Objektorientiertes Datenmodell
- Objektrelationales Datenmodell
- Deduktives Datenmodell
- Semantisches Datenmodell (wichtig)

### Betrachtungsebene beim Datenbankentwurf

<img src="bilder/3EbenenArchitektur.png" alt="3 Ebenen Architektur">

- Konzeptionelles Modell: Kapitel 2
- logisches Datenbankschema: Kapitel 3
- 