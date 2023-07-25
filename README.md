
# Bowling Game Kata

Kata para práctica de TDD, basada en un juego típico de Bolos.


## Tech Stack

**Client:** JAVA, TEST



## Documentacion

[Documentation] https://github.com/ardalis/kata-catalog


Cada partida (o "línea") de bolos incluye diez turnos (o "cuadros") para el jugador.

En cada cuadro, el jugador tiene hasta dos intentos para derribar los diez bolos.

Si la primera bola de un cuadro derriba los diez bolos, se denomina "strike" y el turno termina. La puntuación del cuadro es diez más el total de los bolos derribados en las dos bolas siguientes.

Si la segunda bola de un cuadro derriba los diez bolos, se denomina "spare" y el turno termina. La puntuación del cuadro es diez más el número de bolos derribados por la siguiente bola.

Si, después de las dos bolas, todavía queda al menos uno de diez bolos en pie, la puntuación de ese cuadro es simplemente el número total de bolos derribados en ese turno.

Si consigues un spare en el último (10º) cuadro, recibes una bola extra. Si consigues un strike en el último (10º) cuadro obtienes dos bolas extras. Estos bonus se realizan como parte del mismo turno. Si una bola extra derriba todos los bolos, el proceso no se repite. Las bolas extras sólo se utilizan para calcular la puntuación del cuadro final.

La puntuación del juego es el total de las puntuaciones de todos los cuadros.

