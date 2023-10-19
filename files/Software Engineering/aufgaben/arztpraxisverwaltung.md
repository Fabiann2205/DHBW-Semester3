# Arztpraxisverwaltung

## Lastenheft

### erstellt von Jeremias Essert und Fabian Specht

Das Arztpraxisverwaltungsprogramm soll den Austausch von Patientendaten unter verschiedenen Arztpraxen ermöglichen.

1. Zielbestimmung
    - Das Hauptziel ist eine Verwaltungssoftware für Arztpraxen.
    - Es sollen auf einfache Weise Patienten und deren zugehörigen Elemente (zugehöriger Arzt, Arzthelfer(innen),
      Termine, Untersuchungen, Diagnose, Rezepte, Medikamente, Verbrauchsmaterial usw.) angelegt, gesucht, gelöscht, im-
      und exportiert werden können
    - Die Software übergibt die Patientendaten, die an einer Praxis erfasst wird auch an die anderen Arztpraxen, sodass
      ein Austausch der Daten über ein Peer-2-Peer-Netzwerk (über VPN) im Hintergrund geschieht
    - Jeden Patienten können einen oder mehrere Ärzte/Arzthelfer zugeordnet werden
    - Sicherstellung der Einhaltung rechtlicher Vorschriften im Gesundheitswesen.

2. Produkteinsatz (Anwendungsbereich):
    - Das Produkt wird in Arztpraxen verschiedener Fachrichtungen eingesetzt.
    - Damit sind keine Kliniken gemeint, da diese meist spezielle, andere Anforderungen haben.

3. Zielgruppen, Benutzerrollen und Verantwortlichkeiten
    - Systemadministrator: Verantwortlich für die Systemverwaltung und Benutzerverwaltung.
    - Ärzte: Verantwortlich für die medizinischen Aspekte und Diagnosen.
    - Arzthelfer(innen): Verantwortlich für die Terminplanung und Patientenbetreuung.
    - Sekretär: Benutzen das System zur Dateneingabe und -abruf. Sie Können für Patienten die Terminvereinbarung
      übernehmen und bekommen ebenfalls die jeweiligen zugehörigen Elemente der Patienten angezeigt
    - Patienten: können über das Portal eine Terminvereinbarung durchführen und bekommen Untersuchungsergebnissen
      angezeigt. Rezepte werden in analoger Form zur Verfügung gestellt.
    - Alle Benutzer haben Zugriffsrechte basierend auf ihren Verantwortlichkeiten und Kenntnissen.

4. Zusammenspiel mit anderen Systemen:
    - Integration mit Laborsystemen für Untersuchungsergebnisse.
    - Anbindung an Abrechnungssysteme für Rechnungsstellung.
    - Anbindung an andere Arztpraxen mit derselben Software, um Patientendaten austauschen zu können.
    - Abhängigkeit von einer stabilen Internetverbindung für den direkten Datenaustausch (kein Server) und andere
      externe Dienste.

5. Verfügbarkeitsbetrachtungen
    - Das Produkt sollte rund um die Uhr verfügbar sein.
    - Wartungsarbeiten und Upgrades sollen zur Systemlaufzeit ohne Unterbrechung des aktiven Betriebs installiert und
      durchgeführt werden können.

6. Produktfunktionen (Basisfunktionalität, Objekte und Relationen):
    - `/LF10/` Terminverwaltung und -planung.
    - `/LF20/` Verwaltung von Patientendaten.
    - `/LF30/` Erstellung von Diagnosen und Verschreibung von Rezepten.
    - `/LF40/` Lagerverwaltung für Verbrauchsmaterialien.
    - `/LF50/` Zugriffsrechte und Benutzerverwaltung.
    - `/LF60/` Tool zum direkten Versenden und Empfangen von Patientendaten (das auch in regelmäßigen Abständen im
      Hintergrund ausgeführt wird).
    - `/LF70/` Sicheres Chattool zur Kommunikation zwischen den Praxen.

7. Produktdaten:
    - `/LD10/` Patientendaten (Name, Geburtsdatum, Kontaktinformationen).
    - `/LD20/` Termininformationen (Datum, Uhrzeit, Art der Untersuchung, behandelnder Arzt, Patient).
    - `/LD30/` Diagnosen und Behandlungsverläufe.
    - `/LD40/` Lagerbestand von Verbrauchsmaterialien.
    - `/LD50/` Patientendaten, die von anderen Systemen empfangen werden.
    - `/LD60/` Chatverläufe des Chattools werden auf den Systemen direkt gespeichert.
    - `/LD70/` Informationen über die Peer-to-Peer Verbindungen und den verwendeten VPN.

8. Nichtfunktionale Anforderungen (Produktleistungen):
    - `Sicherheitsaspekte:` Datenschutz und Zugriffskontrolle.
    - `Geschwindigkeit:` Schnelle Antwortzeiten für Benutzeranfragen.
    - `Benutzerfreundlichkeit:` Intuitive Benutzeroberfläche.
    - `Datenmengen:` Skalierbarkeit zur Bewältigung wachsender Datenvolumina.
    - `Stabilität:` Da das Produkt rund um die Uhr verfügbar sein soll, muss das System auf stabilen Rechnern
      installiert werden. Dazu muss auch eine Anbindung an ein stabiles Netzwerk erfolgen.
    - `Netzwerk:` Das Netzwerk muss stabil sein, um einen möglichst direkten und sicheren Datenaustausch zu ermöglichen,
      da davon Leben abhängen können.

9. Benutzungsoberfläche:
    - Benutzerfreundliche Oberfläche mit klarem Layout.
    - Menüstrukturen für schnelle Navigation.
    - Hilfefunktionen und kontextsensitive Unterstützung.
    - Barrierefreiheit: Unterstützung von behinderten Benutzern.

10. Qualitätsanforderungen:

| Produktqualität | sehr gut | gut | normal | nicht relevant |
|-----------------|----------|-----|--------|----------------|
| Funktionalität  | x        |     |        |                |
| Zuverlässigkeit | x        |     |        |                |
| Effizienz       |          |     | x      |                |
| Benutzbarkeit   |          | x   |        |                |
| Wartbarkeit     | x        |     |        |                |
| Übertragbarkeit |          | x   |        |                |

11. Ergänzungen:
    - Datensicherung und -wiederherstellungsfunktionen.
    - Plattformunabhängigkeit, da das Produkt auf verschiedenen Betriebssystemen laufen muss.
    - Durchführung von Penetrationstests zur Sicherstellung der Datensicherheit.
    - Einhaltung der Datenschutzrichtlinien und gesetzlichen Vorschriften im Gesundheitswesen.
    - Absicherung des Netzwerkverkehrs.
    - Anbindung an externe Gesundheitssysteme, wie zum Beispiel die Systeme der Krankenkassen.
    - Einrichtungstool zum einfachen Aufsetzen der Software.