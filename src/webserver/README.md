# Webserver

Backend der Anwendung. Einstiegspunkt: (index.js)[index.js]

Um die Anwendung starten zu müssen muss eine .env Datei im Ordner liegen oder die entsprechenend Umgebungsvariablen gesetzt sein.

## Node & NPM

Erwartete Node.js Version: `8.9.3`

Erwartete npm Version: `6.1.0`

### Vor dem start:
```bash
npm i
```

Die Datei `template.env` kopieren und die Kopie in `.env` umbenennen. Unter Umständen die Werte in der `.env` anpassen.

### Zum starten:
```bash
npm start
```

oder

```bash
node index.js
```

### Starten der Unittest:
```bash
npm test
```

oder

```bash
mocha
```

