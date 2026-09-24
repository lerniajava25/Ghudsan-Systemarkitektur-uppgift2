# 🏛️ Labbuppgift 2: Dependency Injection (DI)

Denna labbuppgift demonstrerar arkitekturen bakom objekthantering och Dependency Injection i Java. Projektet visar resan från manuell sammansättning, via en egenbyggd reflektions-container, till ett professionellt Enterprise-ramverk (Weld CDI).

---

## 🏎️ Jämförelse av beteende & Arkitektur

Även om alla tre delar levererar samma slutanvändarresultat på skärmen (`Driving: V8 Engine roaring!`), skiljer sig mekanismerna under huven fundamentalt åt:

### 🛠️ Part 1: Manual Injection
* **Konstruktion:** Objekten skapas helt manuellt av utvecklaren med traditionella `new`-nyckelord direkt i källkoden.
* **Beteende:** Konsolen är helt tyst och ren. Endast programmets egna utskrifter syns.
* **Livscykel:** Utvecklaren måste själv hålla koll på alla referenser och instanser i rätt ordning från botten och upp.

### 🔮 Part 2: Mini DI Container
* **Konstruktion:** Sker helt dynamiskt under körning (Runtime). Containern inspekterar klasserna med hjälp av **Java Reflection API**.
* **Beteende:** Konsolen är fortfarande tyst, men klasserna pusslas ihop automatiskt genom att containern läser av konstruktorns parametrar och löser beroenden rekursivt.
* **Livscykel:** Varje anrop till containern bygger upp objektträdet på nytt från toppen och ner.

### 🍃 Part 3: Weld CDI Container
* **Konstruktion:** Helt automatiserad via ett externt Enterprise-ramverk (**Weld SE**). Ramverket skannar av projektets classpath i jakt på konfigurationer.
* **Beteende:** **Röda statusloggar (INFO)** visas i konsolen. Detta är beviset på att Welds inbyggda motor startar, validerar din `beans.xml` och snyggt stänger ner efteråt.
* **Livscykel:** Styrs helt deklarativt med professionella scopes som `@ApplicationScoped`, `@Singleton` och `@Dependent`.

---

## 💡 Slutsats & Insikt
* **Part 1** blir snabbt ohållbart och svårt att skala upp i stora projekt eftersom varje ny komponent kräver manuell kodändring.
* **Part 2** avmystifierar hur DI-ramverk fungerar under huven genom att visa hur reflektion kan automatisera tråkigt kodarbete.
* **Part 3** är den industriella branschstandarden (Inversion of Control) som används i produktion (exempelvis inuti WildFly applikationsserver), där utvecklaren helt kan fokusera på affärslogiken och överlåta arkitekturen till ramverket.
