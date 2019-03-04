# ELTEKinderGarden

Készítsünk programot, amellyel szimulálni tudjuk a következő feladatot. 

Egy óvodában óvónéninek kell gyerekekkel foglalkozni úgy, hogy probléma nélkül teljes az idő. 
Négyféle tevékenységre lehet az óvodásokat rávenni: ének, labdázás, rajz,tánc. 
Az egyes gyerekek eltérően reagálnak az egyes tevékenységekre, és ennek megfelelően változik az elégedettségük. 
Ha egy gyerek elégedettsége nullára csökken, akkor nyafogni kezd, és ha 3 vagy több gyerek nyafog egyszerre, akkor az
óvónéni már nem tudja a rendet fenntartani. 

A gyerekeket három csoportra lehet osztani annak alapján, hogy miként reagálnak az egyes tevékenységekre:

• Eleven: 
Labdázás esetén az elégedettsége három lesz, 
tánc esetén nem változik, 
ének és rajz esetén eggyel csökken.

• Zenekedvelő: 
Ének esetén az elégedettsége négy lesz, 
tánc esetén nem változik,
labdázás és rajz esetén eggyel csökken.

• Kényelmes: 
Rajz esetén az elégedettsége négy lesz, 
ének esetén nem változik,
tánc esetén eggyel, 
labdázás esetén kettővel csökken.

A szimuláció adatait egy szövegfájl tartalmazza a következő formátumban. 
Első sorban a tevékenységek jönnek sorban, számmal azonosítva: 1 – ének, 2 – labdázás, 3 – rajz, 4 – tánc. 
Ezután soronként adottak az egyes gyerekek adatai. 
A sor első eleme a gyerek viselkedési módja, ezt követi a gyerek neve, végül a gyerek kezdeti elégedettsége szerepel a sorban.
A program kérje be a fájl nevét, majd adja meg, hogy rendben telt-e a vizsgált időszak. 
Ehhez valósítsuk meg a gyerekeket reprezentáló osztályokat, amelyek egy absztrakt gyerek osztály leszármazottai.

Egy lehetséges bemenet:
1 2 4 3 1 3

Eleven Ede 1,
Kenyelmes Kati 4,
Zenekedvelo Zsuzsa 2,
Eleven Emese 2,
Eleven Emil 3,
Kenyelmes Karcsi 1,
Zenekedvelo Zoli 3

