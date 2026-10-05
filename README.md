# Softwareentwicklung I - Prof. Dr. Ullrich Hafner

Prof. Dr. Ullrich Hafner <ullrich.hafner@hm.edu>

## KaraLight

Für die ersten Aufgabenblätter nutzen wir KaraLight.
KaraLight ist eine Variante von [JavaKara](https://www.swisseduc.ch/informatik/karatojava/), die der Kollege Bastian Katz in Java Swing umgesetzt hat.
Dadurch erhalten wir einen einfachen Einstieg in die Programmierung mit Java.
Der Marienkäfer Kara wird direkt in Java programmiert.
Die Welt von JavaKara ist identisch mit der Welt von Kara.
Man sieht also sofort, was die Programme machen.

![KaraLight](etc/kara.jpg)

### Öffnen der Projekte

Zum Editieren und Starten Ihrer Programme müssen Sie immer ein von mir vorgefertigtes Projekt in der Entwicklungsumgebung IntelliJ öffnen.
Das Projekt wurde für Sie automatisch in Ihrem persönlichen GitLab Account der Hochschule hinterlegt.

Nach dem Start der Entwicklungsumgebung haben Sie die Möglichkeit, Ihr Projekt direkt zu importieren:
Mit der Aktion **Clone Repository** (im Startup-Wizard) oder dem Menüpunkt **File->New->Project from Version Control...** lässt sich das GitLab Projekt automatisch in IntelliJ öffnen und bearbeiten.
IntelliJ kümmert sich ab dann automatisch über die Verbindung zu GitLab.
Kopieren Sie dazu Ihren Repository Link in das Feld **Repository URL->URL** und bestätigen Sie den Import mit **Clone**.
Beachten Sie, dass Sie sich beim Import über HTTPS authentifizieren müssen.
Dazu müssen Sie ein Personal-Access-Token in GitLab erzeugen, die Authentifizierung via Browser funktioniert **nicht**.
Das Access-Token können Sie einfach über den IntelliJ Dialog erzeugen, der dann die passende Einstellungsseite auf GitLab aufruft.
Denken Sie daran, als Laufzeit für das Token mindestens das Semesterende anzugeben.

Wenn Sie das Projekt in IntelliJ geöffnet haben, finden Sie im Hauptordner dieses README.
Die Aufgabenstellung zu jeder Abgabe befindet sich tiefer im Verzeichnisbaum unter dem Ordner `src/main/asciidoc/`.
Eine Abgabe besteht i.A. aus mehreren Aufgaben.
Jede Aufgabe müssen Sie in einer eigenen Datei (d.h. Java Klasse) lösen.
Diese Klassen sind fortlaufend nummeriert und beginnen mit `Assignment01`.
Die Dateien sind bereits für Sie angelegt, sodass Sie direkt mit dem Programmieren starten können.

### Lösen und Starten der Aufgaben

Technische gesehen, muss jede Aufgabe für KaraLight in einer eigenen Klasse gelöst werden, z.B. `Assignment01` (befindet sich in der Datei `Assignment01.java`).
Diese Klasse hat bereits einen von mir vorgegebenen Rumpf, d.h. Sie können direkt
mit Ihrer Lösung in der vordefinierten `main` Methode starten.
Diese `main`  Methode muss immer bestehen bleiben, sie ist der jeweilige Ausgangspunkt für KaraLight.
Diese Methode können Sie in der Entwicklungsumgebung starten, indem Sie den grünen **Run** Button drücken.

In dieser `main` Methode wird direkt in Java programmiert, zusätzlich können Sie die folgenden Befehle verwenden, um Kara zu steuern:

* `move()` — Kara bewegt sich einen Schritt nach vorn.
  Das geht nur, wenn vor Kara kein Baum ist!
  Wenn vor Kara ein Pilz ist, schiebt Kara den Pilz eine Position weiter.
  (Das setzt wiederum voraus, dass der Platz vor dem Pilz frei ist.)
* `turnRight()` bzw. `turnLeft()` — Kara dreht sich nach rechts bzw. links.
* `pickLeaf()` — Kara nimmt ein Blatt auf.
  Das geht nur, wenn eins da ist!
* `putLeaf()` — Kara legt ein Blatt ab.
  Das geht nur, wenn keins da ist!
* `say(...)` — Kara gibt einen Text in einem Fenster aus.
* `askNumber(...)` — Kara fragt nach einer Zahl, die den Ablauf des Programms variabel gestaltet.

Zusätzlich stehen Ihnen die folgenden Abfragen zur Verfügung:

* `isMushroomInFront()` — liefert `true`, wenn vor Kara ein Pilz steht
* `isTreeInFront()` — liefert `true`, wenn vor Kara ein Baum steht
* `isTreeLeft()` — liefert `true`, wenn links von Kara ein Baum steht
* `isTreeRight()` — liefert `true`, wenn rechts von Kara ein Baum steht
* `isOnLeaf()` — liefert `true`, wenn Kara auf einem Blatt steht

## Entwicklungsrichtlinien

Neben den Programmierfertigkeiten ist auch das Schreiben von sauberem Code ([Clean Code](https://clean-code-developer.de)) ein wichtiges Lernziel für dieses Semester.
Im Praktikum verwenden wir deshalb von mir vorgegebene [Kodierungsrichtlinien](https://github.com/uhafner/codingstyle), die auf dem Java Standard aufbauen, und lediglich an einigen Stellen präziser gefasst sind.
Diese Richtlinien umfassen die Benennung von Variablen und Methoden und die korrekte Verwendung von typischen Java Konstrukten.
Die Formatierung des Quelltextes wird ebenso überprüft.
Damit Sie als Anfänger selbst möglichst wenig Aufwand mit der korrekten Formatierung haben, wird diese durch das Tool [Spotless](https://github.com/diffplug/spotless) automatisiert durchgeführt.

Diese Kodierungsrichtlinien werden bei der Abnahme mit überprüft und gehen in die automatisierte Bewertung ein.
Sie können testen, ob Ihr Quelltext sich an die Regeln hält, indem Sie meiner Autograding Anleitung folgen.
Dort ist beschrieben, wie Sie das Einhalten dieser Konventionen angezeigt bekommen.

Sie können die Einhaltung der Konventionen und Qualitätsstandards jederzeit lokal überprüfen, indem Sie den Befehl `./mvnw verify` (bzw. `mvnw.cmd verify` unter Windows) im Hauptverzeichnis des Projekts ausführen. Dabei werden die automatisierten Prüfungen und Tests ausgeführt, sodass eventuelle Abweichungen schnell und zuverlässig aufgedeckt werden.

Sollten Formatierungsfehler vorliegen, müssen Sie diese nicht mühsam von Hand korrigieren: Mit dem Aufruf `./mvnw spotless:apply` (bzw. `mvnw.cmd spotless:apply` unter Windows) wird der gesamte Quellcode vollautomatisch nach den vorgegebenen Richtlinien formatiert, was den manuellen Aufwand minimiert und konsistente Ergebnisse sicherstellt.

## Entwicklungsumgebung

Für die praktischen Aufgaben wird ein Rechner mit folgenden Programmen benötigt:

* **IntelliJ IDEA Ultimate 2026.2.x**:
  Die Entwicklungsumgebung kann über die [IntelliJ Homepage](https://www.jetbrains.com/de-de/idea/) heruntergeladen werden.
  Die [Lizenz](https://www.jetbrains.com/community/education/#students) gibt es für Studierende kostenlos.
  Sinnvolle Plugins innerhalb dieser Entwicklungsumgebung sind u.a. CheckStyle, PMD, Palantir Java Format, sowie AsciiDoc und PlantUml (siehe meine [Installationsliste](https://github.com/uhafner/warnings-ng-plugin-devenv/blob/main/My-IntelliJ-Plugins.txt)).
  Aktuell ist auf meinem Rechner die Version `2026.2.3` installiert.
* **Java Development Kit 25 (LTS)**:
  Die aktuelle Version des LTS Release 25 kann unter [Eclipse Temurin](https://adoptium.net/de/temurin) heruntergeladen werden.
  Alternativ lässt sich die passende Version auch innerhalb der Entwicklungsumgebung IntelliJ IDEA Ultimate installieren.
  Achtung, die Java Runtime Edition (JRE) reicht nicht!
  Laden Sie auch keine älteren oder neueren Major Versionen herunter, da sonst evtl. die Programme nicht korrekt funktionieren.
  Aktuell ist auf meinem Rechner die Version `25.0.4.1` installiert.
* **Git 2.x**:
  Hier ist die Versionsnummer nicht so entscheidend, da wir in diesem Semester keine speziellen Möglichkeiten nutzen.
  Aktuell ist auf meinem Rechner die Version `2.55.0` installiert.
  Unter Windows folgen Sie am besten der Installationsanleitung von [Git](https://git-scm.com/download/win). macOS und Linux-Systeme haben die Software bereits vorinstalliert.

Wenn Sie mir der Installation Probleme haben, kommen Sie damit — falls möglich — ins Praktikum, sodass wir die Installation gemeinsam durchführen können.

### Tipp für macOS User

Unter macOS ist die Installation der Tools für viele FK07 Veranstaltungen deutlich einfacher, wenn Sie den Paketmanager [Homebrew](https://brew.sh) installieren.

Danach können Sie Softwarekomponenten wie das JDK 25 (Temurin) über einen einfachen Befehl in der Console (Terminal) installieren:

```shell
brew install temurin@25
```

Auch Maven und Git lassen sich so installieren:

```shell
brew install git maven
```

Aktualisieren der Pakete wird dann über das folgende Kommando erreicht, so sind immer alle Pakete auf dem neuesten Stand:

```shell
brew upgrade
```

