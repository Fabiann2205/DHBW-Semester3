# Zusammenfassung Numerik

## Einleitung

#### Zusammenfassung

- Numerik ist die Implementation von Algorithmen. Im Allgemeinen werden in den Algorithmen die Ergebnisse nur
  angenähert, aber so weit, dass diese praktikabel sind.
- Fehlerarten:
    - Eingabefehler: Eingaben sind fehlerhafte Messwerte (Messfehler, etc) oder Ergebnisse aus vorangegangenen
      fehlerhaften Berechnungen
    - Rundungsfehler: Rundungen in oder vor dem Algorithmus
        - Computer kann in Variablen Gleitkommazahlen nur bis gewisser Länge darstellen. Um das zu vermeiden, kann man
          mehr Speicher pro Variable verwenden oder bessere Algorithmen (Seite 3)
        - Änderung der Reihenfolge der Berechnungen in einem Algorithmus kann das Ergebnis ändern (aber nur in der
          Numerik → andere Zwischenschritte mit vl weniger Nachkommastellen und deswegen weniger Rundungsfehlern)
        - Beispiel ist die Berechnung von √2 - 1,42 = fast 0 in Numerik, da nicht alle Stellen von √2 gespeichert werden
          können → schlecht konditionierte Matrix geht mit hoher Fehlerverstärkung einher → falsche Ergebnisse (Seite
          4, Mitte)
    - Verfahrensfehler: Abstand der Ergebnisse des exakten und angenäherten, numerischen Algorithmus
        - bessere Algorithmen (effizienter) können Ergebnisse verbessern (zum Beispiel bei numerischen Integrieren:
          anstelle Riemann die Simpson Regel verwenden; Pivotisierung beim Gauß-Algorithmus; QR-Zerlegung beim
          Least-Square-Problem)
- Kondition und Stabilität eines Algorithmus: Gegeben sind eine exakte Funktion und ein angenäherter Algorithmus. Auch
  gibt es genaue und gerundete Eingaben:
    - f(gerundete Eingabe) - f(exakte Eingabe) = Kondition
    - Alg(gerundete Eingabe) - f(exakte Eingabe) = Stabilität
    - beide addiert
    - Stabilität: Kleine Fehler in den Eingaben oder Rundungsfehler wirken sich nicht so stark auf das Ergebnis aus,
      also wie stark schwankt der numerische Algorithmus bei Störung?
    - Kondition: Probleme mit guter Kondition (es geht um die Aufgabenstellung), also wie stark schwankt das Problem
      (die exakte Funktion) bei Störung (fehlerhaften Eingaben)?
- Konditionszahl berechnen:
    - |Ableitung(f(x)) * x/f(x)| => f(x) ist das analytische Problem
    - <a href="https://de.wikipedia.org/wiki/Korrekt_gestelltes_Problem">Wichtig in Wikipedia</a>
- Kondition einer Matrix: (A = Matrix)
    - für singuläre Matrizen: K(A) = unendlich
    - für reguläre Matrizen: K(A) = Norm der Matrix * Norm der Inverse der Matrix

!!!MATRIX SACHEN NOCH ANSCHAUEN SEITE 6, 7

- Erstellen eines numerischen Programms:
  <img src="bilder/Einleitung-Erstellen-eines-numerischen-Programmes.jpg">
  <img src="bilder/Einleitung-Beispiel-Erstellen-eines-numerischen-Programmes.jpg">

#### Mögliche Aufgaben

- Wann werden Integrale in der Numerik verwendet? (heißt Annäherung an exakte Funktion)
    - Wenn die Funktion nur als Wertetabelle gegeben ist
    - Wenn die Funktion nicht analytisch notierbar ist (mit elementaren Funktionen wie sin, ...)
    - Wenn der Ausdruck für die analytische Funktion zu kompliziert ist
    - Wenn es sich um Oberflächenintegrale oder Raumintegrale handelt
- Pseudocode schreiben, der den Flächeninhalt/bestimmtes Integral berechnen kann (mit Riemann, Trapez oder Simspon,
  siehe Seite 2 oder Kapitel Numerisches Integrieren)
- kolineare Probleme: haben eine hohe Empfindlichkeit und dadurch eine hohe Fehlerverstärkung. Rundungsfehler können
  schnell entstehen, vermeidbar siehe oben
- Beispielaufgabe zu Konditionszahl in Skript auf Seite 5 unten

## Grundarithmetik

#### Zusammenfassung

- Rechenarten wie +, -, *, /, x^y, exp, log, sin, cos, arctan, √
- Darstellbarer Bereich von [-x max, -x min] U [x min, x max] U [0]
- Darstellbarer Bereich kann durch die oben gegebenen Rechenarten verlassen werden (z. B. mit x*y → Overflow; auch
  Umwandlung von kartesischen in Polarkoordination → Underflow)
- Underflow oder Overflow oft durch Ändern der Reihenfolge der Berechnungen vermeidbar
- relative Maschinengenauigkeit: T = 0,5*b^(1-l) (l = Anzahl der Stellen der Gleitkommaarithmetik) → selbst wenn es
  Rundungen usw gibt, ist der Fehler immer kleiner als T
- Klammern setzen kann auch die Berechnung eines Algorithmus beschleunigen
- Empfindlichkeitsdilemma: Die Wurzeln von Polynomen können sehr empfindlich bezüglich der Polynomkoeffizienten sein:
    - a(z) = 1,3459*z^4 - 4,8839*z^3 + 6,6388*z^2 - 4,0063*z + 0,90556
    - alle Wurzeln (also z1 bis z4) sind stabil, also im Einheitskreis (von 0 bis 1)
    - verändert man bei 6,6388 die vierte Stelle auf 7, also 6,6387 → z1 liegt bei über 1, hat also den Einheitskreis
      verlassen und ist somit instabil und falsch
    - keine E/A Differenzialgleichungen für Differenzialgleichungssimulationen verwenden!

#### Mögliche Aufgaben

- Wie viele Flops braucht man, um die Gleichung zu lösen? (x^2+3)/(x^2+4) ANTWORT: 4 Stück, da x^2 doppel vorkommt
    - andere Gleichung: sin^2(x) + cos^2(x) = 1 ANTWORT: 0 Stück, da die Lösung festgelegt ist und somit keine Rechnung
      benötigt wird
    - und karierte Seite nach Seite 10 im Skript
- Schreibe einen Runtime Test, also wie lang ein Programm zur Ausführung benötigt. Was muss beachtet werden?
    - ANTWORT: Einfach einen Timer laufen lassen. Zum Beachten: man muss den Timer mehrfach laufen lassen, um
      Testungenauigkeiten zu verkleinern (zum Beispiel durch Hintergrundprozesse); auch sollte das Programm nicht zu
      groß gemacht werden, um Verfälschungen durch Festplattenladezeiten zu vermeiden.
- Warum sind in MatLab Schleifen aufwendig?
    - ANTWORT: Weil es eine Interpreter Sprache ist. Das bedeutet, dass die Schleife in jeden Durchlauf neu ausgewertet
      werden muss.
- Programmiere das Horner-Schema! ANSCHAUEN!!!
- Warum sollten die Eigenwerte einer Matrix nicht über die charakteristische Gleichung berechnet werden?
    - ANTWORT: führt auf Polynome, Nullstellensuche ist kompliziert. Stattdessen Q/Z Zerlegung nutzen
- Was ist der Zusammenhang zwischen Wurzeln und Eigenwerten?
    - ANTWORT: Begleitmatrizen aufstellen und Eigenwerte dieser berechnen → QZ-Zerlegung → Wurzeln
- Kontrollfragen aus Skript (auf Seite 12)
    - siehe Lösungen und Notizen auf Seiten 44-48 des Skriptes

## Komplexität von Algorithmen

## Numerisches Differenzieren

## Numerisches Integrieren

- Seite 2 oben interessant

## Numerisches Lösen von Differenzialgleichungen

## Numerisches Lösen nicht linearer Gleichungssysteme

## Numerische Optimierungsverfahren