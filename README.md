Materiale relativo al corso di Ingegneria dei Sistemi Software dell'Anno Accademico 2024-2025 (Ingegneria Informatica M - Alma Mater Studiorum, Università di Bologna)

<h2 id="Fase1">Fase 1</h2>  

### Dagli oggetti ai microservizi (in Java)
 * [conwaygui0](conwaygui0): contiene la core business logic. Inizialmente il primo progetto dell'applicazione, rifattorizzata poi per un'adeguata separazione delle classi (Single Responsibility Principle)
 * [conwaygui](conwaygui): evoluzione del progetto con controller SpringBoot e GUI, ingloba il precedente
 * **Relazione finale fase 1** - [Fase1ISS25-BacchelliValentina.pdf](https://github.com/VBacchelli/ISS2025/blob/main/Fase1ISS2025-BacchelliValentina.pdf)

### Dagli oggetti agli attori 
* [conwaylifeactors](conwaylifeactors): una prima analisi del problema delle celle come attori
* [rasp2025ledalone](rasp2025ledalone): progettazione di un attore che controlli l'accensione e spegnimento di un led connesso a un Raspberry Pi
* [sonarled2025](sonarled2025): progetto con un led e un sonar collegati a un Raspberry e controllati da attori. Se la distanza rilevata dal sonar è inferione a un valore prefissato LIMIT si deve accendere il Led
