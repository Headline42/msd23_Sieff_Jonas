# Exercise 5

## Warum werden Logging Bibliotheken verwendet?
Logging Bibliotheken wie Log4J werden verwendet, um Informationen über den Programmablauf, Fehler und Warnungen strukturiert und übersichtlich festzuhalten. Das erleichtert die Fehlersuche und Nachvollziehbarkeit enorm.

## Loglevel in Log4J
Log4J bietet mehrere Loglevel:
- `ALL`
- `TRACE`
- `DEBUG`
- `INFO`
- `WARN`
- `ERROR`
- `FATAL`

Damit lässt sich steuern, wie detailliert geloggt wird - von sehr ausführlich bis hin zu nur kritischen Fehlern. So behält man die Kontrolle über die Logmenge.

## Konfigurationsmöglichkeiten von Log4J
Konfigurieren lässt sich Log4J flexibel über eine XML-, JSON- oder Properties-Datei. Dort kann man folgende Aspekte festlegen:
- Loglevel
- Ausgabeformat
- Ziele der Logausgabe (Konsole, Datei, Datenbank...)
- und vieles mehr

So passt man das Logging optimal an die Bedürfnisse des Projekts an.