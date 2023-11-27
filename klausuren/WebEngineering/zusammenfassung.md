# Web Engineering 2

## JS Themen:

- Callbacks
- XML HTTP Request
- Promises
- Async/Await
- Spring

## 1 Ajax in Plain JavaScript (asynchrones JS und XML)

- Daten anzeigen, ohne eine neue HTML-Seite zu laden (DOM-Manipulation)
- Callbacks: übergeben einer Funktion (Callback) an eine andere Funktion, welche den Callback später aufruft/ausführt

| Synchron                                                     | Asynchron                                      |
|--------------------------------------------------------------|------------------------------------------------|
| Ausführung von Code in strikter Reihenfolge                  | keine vorgegebene Reihenfolge                  |
| es muss auf jeden Programmschritt/Aufruf gewartet werden     | muss nicht gewartet werden                     |
| Programmschritte können NICHT gleichzeitig ausgeführt werden | gleichzeitige Ausführung möglich (nicht in JS) |

- Event Loop in Browsern führt Code asynchron aus → JavaScript an sich kann es nicht, aber mithilfe des Browsers ist
  es dann doch möglich
- Daten von Servern abrufen: XML HTTP Request an Server
- Promises: Machen aus Callback wieder "regulären" Rückgabewert, sie versprechen, dass der Wert irgendwann existiert →
  vermeiden Callback Chaos
- Async/Await mit Promises: Async markiert asynchronen Code, mit Await warten wir auf das Ergebnis des Async Codes

## 2 Single Page Application (SPA)

- Eine JavaScript-Web-Applikation, die exakt eine Seite laden muss, um komplett zu funktionieren
- Webseite wird komplett geladen beim ersten Aufruf, dann in der Runtime Daten vom Server abgerufen, welche dann durch
  JS gerendert werden
- Warum?
    - Reduktion übertragender Daten
        - Stylesheets: einmalige Auslieferung
        - JS: ebenfalls repetitiv, auf mehreren Seiten dieselben Funktionen
        - HTML: dynamischer Teil beschränkt auf Informationen, Rest einmalig lieferbar
    - Bessere UX
        - kürzere Antwortzeiten
        - weniger BE Requests nötig und währenddessen nutzbar
        - asynchrones Nachladen der Informationen
    - Weniger Serverresourcen
        - Rendering und Geschäftslogik auf Client
        - Server kümmert sich nur um Daten
    - Session Clientseitig
        - Service kann stateless sein
        - Skalierbarkeit einfacher
        - Loadbalancing einfacher, da Session nicht verschoben werden muss → ist auf Client
    - Hybride Anwendungen auch mobil einsetzbar
        - ähnlich wie Apps
        - keine Doppelentwicklungen
        - React/Flutter...
- Nachteile:
    - erstes Laden langsamer
    - Search Engine Optimization schwerer (Daten werden erst in der Runtime geladen)
        - JS muss ausgeführt werden, oft nicht unterstützt oder benachteiligt → serverseitiges Rendering?
    - Client nicht vertrauenswürdig
        - JS Code könnte manipuliert werden, erneute Validierung nötig (→ dadurch Folgepunkte)
    - duplizierter Code
    - höherer Entwicklungsaufwand
- theoretisch kein Routing nötig, aber um Links zu sharen gibt es Pseudo-Routing

## 3 Rich Client Server

- Webserver:
    - Stateless: kein Zustand, Session, nur Daten
    - Scalable: abhängig von ausschließlich externen Informationen, dynamisches Hoch-/Runterfahren
    - Untrusting: Validierung und Isolierung aller Eingaben, durchgehende Prüfung der Authorisierung
- Architekturen:
    - Aufteilung von Verantwortlichkeiten
    - Abgrenzung einzelner Komponenten
    - Interaktion zwischen Komponenten

| Monolith                                    | Modulith                                                                              | Services                                 | Microservice                                                            |
|---------------------------------------------|---------------------------------------------------------------------------------------|------------------------------------------|-------------------------------------------------------------------------|
| Alle Aspekte der Anwendung in einem Projekt | Unterteilung der ANwendung in Fachlichkeiten (Auslagerung in Modulen/Package/Projekt) | Modulith als Kern                        | Auslagerung jedes Moduls in Services                                    |
| keine Trennung zwischen Fachlichkeiten      | Module definieren öffentliche Schnittstellen                                          | Auslagerung einzelner Module in Services | Expliziter Kern durch implizite Abhängigkeiten zwischen Services erstzt |
| keine externen Abhängigkeiten zur Laufzeit  | Keine Auslagerung zur Laufzeit                                                        | Services haben eigene Datenhaltung (DBs) | Services replizieren Daten in eigener Datenhaltung                      |
|                                             | zusammengeführt durch Kern                                                            |                                          |                                                                         |
| <img src="bilder/monolith.png"/>            | <img src="bilder/modulith.png"/>                                                      | <img src="bilder/services.png"/>         | <img src="bilder/microservices.png"/>                                   |

- Vergleich Architekturen
  <img src="bilder/vergleich_architekturen.png"/>
- Anforderungen und Teamgröße limitieren jeweils Architekturmöglichkeiten
- Architektur aus Deckung der Architekturmöglichkeiten wählen
- Teamgröße muss sich mit Anforderung decken
- Fazit: Monolith fpr unbekannte Projekte, Modulith für mehr Wartbarkeit, Services für Skalierbarkeit, Microservices für
  Zuverlässigkeit
- Spring-Boot:
    - Application Framework, Dependency-Injection-Container
    - Schichten: Frontend (Nutzeroberfläche), Middleware (implementiert Businesslogik), Backend (Persistente Ebene,
      andere Services)
    - Informationen zum Programmieren in Folien

## 4 Rich Client React

## 5

## 6

## 7

## 8 Authentifizierung

- Zugriffstypen:
    - Discretionary Access Control (DAC):
        - jeder Nutzer kann Rechte für ein Objekt einzeln einstellen
    - Mandatory Access Control (MAC):
        - System gibt Rechte vor, anpassbar, aber System hat mehr Rechte
- Access Control Typen:
    - Identitätsbasiert
    - Rollenbasiert
    - Attributbasiert
- Authentifizierungsfaktoren:
    - Wissen: Passwort, Sicherheitsfragen (Nutzer Schwachstelle, Transportweg des Passworts zu Server unsicher,
      Datenbank Leak)
    - Besitz: Security-Token, Smart Card (Verlust)
    - Inhärenz: Biometrische Verfahren (nicht eindeutig genug, um praxistauglich und sicher zugleich zu sein)
- Authentifizierungsarten:
    - direkt: Daten direkt bei Anwendung, möglicherweise mehr Daten zum Login erforderlich
    - über dritten Anbieter: Daten sind der Anwendung unsichtbar, aber beide müssen dem Drittanbieter vertrauen
- Multifaktor:
    - erhöht Sicherheit enorm
    - 2 unterschiedliche Authentifizierungsfaktoren
    - gängig: OTP/TOTP, SMS, Smart Cards
    - Generierung nicht auf gleichem Gerät wie Login-Gerät
- Probleme in der Praxis:
    - HTTP zustandslos → Zustand nötig → Session
    - Cookies oder URL-Rewriting (beides Vor-/Nachteile)
    - Verteilte Anwendungen (mehrere Instanzen): Nutzer kann bei nicht optimierten Anwendungen Zugriff im Betrieb
      verlieren (bei Instanz Wechsel → Load Balancing)
        - Nutzerbindung an Instanz
        - Sessions werden Instanz übergreifend gespeichert
        - Session Gateway, oder tokenbasiert beim Nutzer
- Formen der Authentifizierungsforms:
    - HTTP Basic Authentication:
        - Browser stellt Formular bereit, Server authentifiziert (username:password), Form nicht editierbar
    - Form based Authentication:
        - Form von Anwendung
        - Anwendung entscheidet über Zugang
        - bessere Fehlerbehandlung
    - Protokolle: SAML, OAuth2 (bei beiden ein Identity Provider, automatischer Login ohne Passwort, SSO Zugriff auf
      Ressourcen, OAuth2 gibt Access und Refreshtokens)
- Authorisation: Zugriff auf Ressourcen
- Authentication: stellt sicher, dass der Nutzer auch wirklich der ist für den er sich ausgibt
- Verschlüsselung: Public (Verschlüsseln) und Private (Entschlüsseln) Key
- Signaturverfahren: Prüft ob Nachricht verändert wurde; Verschlüsselungsverfahren: verhindert Zugriff auf
  Nachrichteninhalt (RSA)
- JSON Web Token:
    - von AUTH0, Libraries vorhanden
    - Token hat 3 Teile: Hash Algorithmus Typ, Payload Daten, Hash aus ersten beiden Teilen + Secret
    - Token Lifecycle: JWT mit Header, Payload von Autorisierungsserver bestückt, Token wird signiert an Client
      gesendet, Client sendet Token an Anwendung, Anwendung prüft Token mithilfe des Secrets

## 9 Security

- Datendiebstahl/-veränderung, Computersabotage/-betrug
- Größere Webanwendungen meist attraktive Ziele
- Nachteile:
    - konkurriert mit Benutzbarkeit
    - höhere Entwicklungskosten
    - komplexere Architektur
    - höherer Ressourcenverbrauch
- Security ist Qualitätsanforderung, je nachdem, wie sicher und wertvoll eigene Daten sind
- viele Arten der Angriffe (genaue Definition auf Folien)
    - Request Manipulation
    - Directory Traversal
    - SQL-Injection
    - Session Hijacking
    - Cross-Site-Scripting
    - Cross-Site-Request-Forgery
    - Man-in-the-Browser/-Middle
    - Phising
    - Denial-of-Service (DDoS)
- Abwehrmaßnahmen:
    - Serverseitige Daten verschlüsseln, validieren und nicht interpretieren
    - HTTPS
    - 2FA
    - Whitelisting statt Blacklisting
    - Minimalprinzip
    - Sicherheitsmaßnamen nicht ausschalten
    - Aktualisieren von Abhängigkeiten
    - Weiterbildung der Nutzer
- Data Mining
 
