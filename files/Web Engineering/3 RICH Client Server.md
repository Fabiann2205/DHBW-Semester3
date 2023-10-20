# 3. RICH Client: Server

Client vs Server → Client soll Nutzer auf Fehlinformationen hinweisen

<aside>
📌 Webservice

</aside>

Stateless

- Keine Sitzungsinformationen
- Unabhängigkeit von vorherigen Anfragen
- Keine nicht-persistenten Informationen
- Transparentes Caching ausgenommen
- Persistierung in Datenbank oder Dateisystem

Scalable

→ Beliebig viele Instanzen;
Alle Instanzen sind gleich 

Untrusting

Nutzer nicht trauen → Validierung, Isolierung von Eingaben (z.B. SQL)

<aside>
📌 Architekturen

</aside>

![Untitled](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled.png)

Monolith

![Untitled](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%201.png)

- Alle Aspekte der Anwendung in einem Projekt
- Keine Trennung zwischen Fachlichkeiten
- Keine externen Abhängigkeiten zur Laufzeit

Modulith

![Untitled](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%202.png)

- Unterteilung & Auslagerung der Module/Packages
- Module definieren öffentliche Schnittstellen
- Auslagerung in Form von Package, Modul, Projek
- Keine Auslagerung zur Laufzeit
- Zusammengeführt durch Kern

Module zu Services

![Untitled](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%203.png)

- Modulith als Kern
- Auslagerung einzelner Module in Services
- Services haben eigene Datenhaltung

Kern aufräumen → Microservices

![Untitled](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%204.png)

- Module → Services
- Services müssen Daten für Nutzer replizieren

<aside>
📌 Vergleich

</aside>

- Vergleich ausführlich (weniger relevant)
    
    **Initialaufwand**
    
    ![Untitled](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%205.png)
    
    **Wartungsaufwand**
    
    - Einführung neuer Features
    - Entfernung alter Features
    - Behebung von Fehler
    - Aktualisierung der Abhängigkeiten
    - Refactoring
    
    ![Untitled](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%206.png)
    
    **Betriebsaufwand**
    
    - Störungen beheben
    - Instandhaltung
    - Betreiben der Services
    
    ![Untitled](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%207.png)
    
    **Personalaufwand**
    
    - Große Komplexität 
    → mehr Personal
    → mehr Flexxibilität
    
    ![Untitled](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%208.png)
    
    **ABHÄNGIGKEIT**
    
    - Trennung der Fachlichkeiten
    - Freiheit derTechnologien
    
    ![Untitled](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%209.png)
    
    …
    
- Vergleich Fazit
    
    ![Untitled](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%2010.png)
    
    ![Untitled](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%2011.png)
    
    ![Untitled](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%2012.png)
    
    ![Untitled](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%2013.png)
    
    ![Untitled](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%2014.png)
    

<aside>
📌 Umsetzung - Springboot

</aside>

→ Application Framework, Dependency-Injection-Container

Spring baut die Objekte/Anwendung irgendwie zusammen

Spring-Schichten

Frontend

Nimmt Eingaben entgegen

erfolgt durch Controller, API in ReST, GraphQL usw.

Middleware

Validierung,
Businesslogik

Am besten als Interfaces mit Implementierung

Backend

Ansprechen von Services

Speichern in DB

## Frontend

### Methods

GET, POST, PUT, DELETE

![Untitled](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%2015.png)

![Path variables](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%2016.png)

Path variables

![Parameters](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%2017.png)

Parameters

![Bodies](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%2018.png)

Bodies

![Documents](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%2019.png)

Documents

## Middleware

![Service implementation](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%2020.png)

Service implementation

![Conditional](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%2021.png)

Conditional

## Backend → JPA

JPA (Repository) = Arbeiten mit DB
@Entity zur Deklaration eine Entity
@ld zur Markierung des ID-Feldes
@GeneratedVa1ue zur automatischen Generierung

**JPA REPOSITORY:** 

![Untitled](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%2022.png)

![Eigene Query](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%2023.png)

Eigene Query

![Untitled](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%2024.png)

![Untitled](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%2025.png)

![Untitled](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%2026.png)

![Wrapperklasse, die DELETE bspw. entfernt, weil Schnittstelle zu viel kann](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%2027.png)

Wrapperklasse, die DELETE bspw. entfernt, weil Schnittstelle zu viel kann

<aside>
📌 Referenzierung / Dependency-Injection

</aside>

Components

@autowired = spring geht auf die Suche nach Implementierung
Wenn keine/zu viele Implementierung vorhanden → Fehler 

@component = erstelle von dieser Klasse ein Objekt
@RestController, @Service und @Repository → component

Configurations

Indirekte Deklaration von Objekten
Ändern und Erweitern bestehender Objekte

![Untitled](3%20RICH%20Client%20Server%20beb5a4ce720c479a98cad4b304528a65/Untitled%2028.png)

@Configuration
@Bean