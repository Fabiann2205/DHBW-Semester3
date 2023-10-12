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

BSP:

| Matrikelnummer | Vorname | Nachname  | PLZ   | Ort | Straße | Fach | Semester |
|----------------|---------|-----------|-------|-----|--------|------|----------|
| 100001         | Anton   | Müller    | 67256 | r   | 4      | INF  | 1        |
| 100002         | Jochen  | Schweizer | 49854 | t   | 5      | WI   | 3        |
| 999999         | Detlef  | k         | 34434 | t   | t      | INF2 | 6        |

Tabelle

- einwertig: jedes entity hat genau einen Wert aus einem Wertebereich (in einem Attribut/Spalte gibt es alle Werte nur
  einmal)

Aufgabe: 