# Aufgabe 10 Altklausur

Beschreiben Sie was auf Netzwerkebene alles geschehen muss, damit eine Webseite (z.B. dhbwkarlsruhe.de) in einem Browser
eines Netzwerkgerätes angezeigt werden kann. Das Netzwerkgerät befindet sich hinter einem NAT Gateway. Das Gateway und
das Netzwerkgerät sind frisch initalisiert, DNS und ARP Cache sind leer! In der Beschreibung sollen folgende Themen
behandelt werden: Adressierung Ethernet und IP, ARP, NAT und DNS? (10 Punkte)

Das Netzwerkgerät und das Nat Gateway haben beide eine eindeutige MAC Adresse und IP. Als Erstes muss die IP Adresse des
Ziel Servers mit einer DNS Anfrage ermittelt werden. Um das zu machen, wird auch die MAC Adresse des NAT Servers
benötigt. Dazu wird eine ARP Anfrage ins Netzwerk gesendet, auf die der NAT Server mit seiner eigenen MAC Adresse
antwortet, die das Netzwerkgerät in seinem ARP Cache speichert. Im nächsten Schritt wird eine DNS Anfrage an einen DNS
Server gesendet, der dann die IP zurück an das Netzwerkgerät gibt (im DNS Cache gespeichert).

Im letzten Schritt wird dann die eigentliche Anfrage gesendet. Dazu sendet das Netzwerkgerät an die MAC Adresse des Nat
Gateways eine Anfrage, in der die Ziel IP der Server ist und die Quell IP die IP des Netzwerkgeräts. Der Nat Server
schreibt dann die Qell Adresse auf sich selbst um (und merkt sich den Port, um die Antwort an das richtige Gerät zu
leiten). Diese Anfrage geht dann an den eigentlichen Server. Der Server antwortet dann mit der öffentlichen Ziel Adresse
des Nat Gateways. Das NAT Gateway erkennt die Anfrage (durch den gespeicherten Port) und schreibt die Ziel Adresse des
Pakets wieder auf das Netzwerkgerät um. Dadurch hat das Netzwerkgerät jetzt die Anfrage an die Seite gesendet und eine
Antwort erhalten.
