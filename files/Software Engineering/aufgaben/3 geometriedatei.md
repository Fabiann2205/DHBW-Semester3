# Aufgabe 3 Geometrie Datei

Lösung:

geometrie datei = "/START_DESC;" + {KOMMENTAR | DEKLARATION} + "/END_DESC";

KOMMENTAR = "/==" + { WORT } + "==!/"

DEKLARATION = REFERENZ + "=" + ELEMENT + ";"

REFERENZ = "#" + ZAHL

ELEMENT = KREIS | PUNKT | LINIE

KREIS = "KREIS(" + REFERENZ + "," + REFERENZ + "," + REFERENZ + ");"

LINIE = "LINIE(" + REFERENZ + "," + REFERENZ + ");"

PUNKT = "PUNKT(" + INTEGER + "," + INTEGER + ");"

INTEGER = {ZAHL} | ZAHL

ZAHL = 0 {B} 9

WORT = { BUCHSTABE } | BUCHSTABE

BUCHSTABE = A{B}Z