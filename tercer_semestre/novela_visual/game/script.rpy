# Personajes del juego 
define unkonwn = Character("...")
define ivan = Character("Ivan Petrovich")
define leo = Character("Leo Volkov")
define gerente = Character("Gerente Petrov")
define voz = Character("Voz del parlante")
define desconocido = Character("Desconocido")
define cientifico = Character("Cientifico")
define narrador = Character("Narrador")
    
# Imágenes
image gerenteIMG = "gerente.png"
image cientificoIMG = "cientifico.png"
image zombies = "grupo_zombies.png"


# El juego comienza aquí.
label start:

    

    # Escoger que prototipo jugar (nivel 1 o nivel 2)
    menu:
        
        "Escoge el nivel que deseas jugar"

        # Nivel con una intración con botones
        "Nivel 1":
            $seleccionar_nivel1 = True
            jump nivel0

        # Nivel con una interacción con opciones
        "Nivel 2":
            $seleccionar_nivel1 = False
            jump nivel0


# Ventana de la sala de control
label nivel0:

    unkonwn "Este parecía un día cualquiera en mi trabajo"
    unkonwn "Pero todo cambió drásticamente en un abrir y cerrar de ojos"

    scene bg_nieve
    with fade

    unkonwn "Mientras caminaba por las extensas llanuras de las estepas siberianas"
    unkonwn "Apreciando el paisaje cubierto de nieve por el invierno"
    unkonwn "Noté como cerca de unos arboles, la nieve se tiñó de color rojo debido a la sangre"

    scene sangre_nieve
    with dissolve

    unkonwn "Pensé que podría ser de algún animal muerto cazado por alguien"
    unkonwn "Ya que a lo lejos observé que había un venado"
    unkonwn "Sin saber que era un aviso de lo que vendría más tarde"

    scene bg_nieve
    with dissolve

    ivan "Por si no me conoces, soy Ivan Petrovich, hace unos 3 meses logré entré a trabajar a una central nuclear"
    ivan "Para mí fue un alivio poder conseguir este trabajo después de estar 1 año desempleado, especialmente porque el salario que me ofrecieron es muy bueno"
    ivan "A lo mejor, si alguien viera mí paga semanal, podría pensar que soy alguna especia de gerente en la central nuclear "
    ivan "Pero para ser sincero tan solo soy un empleado en el área de limpieza"
    ivan "La razón de mi buen sueldo, es debido a que la central nuclear se encuentra alejada de toda la civilización"
    ivan "Me toma 2 horas de caminata llegar a la central nuclear, debido a que ningún bus tiene una ruta hasta este lugar"

    scene central_nuclear
    with dissolve

    ivan "A pesar de ser nuevo en este empleo, la verdad me he podido adaptar con relativa facilidad"
    ivan "Si bien mis compañeros suelen ser un poco fríos cuando trato de entablar una conversación con ellos"
    ivan "Todos suelen ser muy solidarios cuando necesito ayuda con algo que desconozco"
    ivan "Por ejemplo, antes de entrar a tiempo completo a trabajar, estuve una semana a prueba para determinar si era apto para este empleo"
    ivan "En esa semana tuve que superar algunas pruebas físicas y también acerca de cómo funciona, de forma básica, la central nuclear"
    ivan "Por ejemplo, en caso de tener que abandonar la central por una posible explosión debo poder trazar rápidamente una ruta de escape"
    ivan "También me enseñaron otro tipo de cosas como: primeros auxilios, apagar el sistema de reacción de la central nuclear, supervivencia en el bosque, etc"
    ivan "Pero para ser sincero, dudo mucho que en algún momento tenga que usar alguno de esos conocimientos"
    ivan "Así que muchas de las cosas que me enseñaron esa primera semana, no las recuerdo del todo bien"
    
    scene interior_central_nuclear
    with dissolve

    ivan "Al entrar a la central nuclear, todo parecía estar normal"
    ivan "Pero mientras me dirigía al salón donde se encuentran todos los artefactos de limpieza"
    ivan "Apareció uno de los encargados y bloqueó el paso en mi camino"

    show gerenteIMG at center
    with moveinright

    gerente "Hola Ivan, por casualidad, ¿Leo no se ha comunicado contigo?"
    ivan "No, ¿sucede algo?"
    gerente "Sí, aún no ha llegado y es muy raro. Sobretodo porque ayer me prometió ayudarme a reparar una puerta a primera hora de hoy día"
    gerente "Ya sabes, el es muy bueno en cosas de carpintería"
    gerente "Bueno, si lo llegas a ver le dices que lo espero en mi despacho"
    ivan "Entendido Sr. Petrov"

    hide gerenteIMG
    with moveoutleft
    
    ivan "Vaya, eso sí es muy extraño, Leo por lo general suele ser de las primeras personas en llegar a la central"
    ivan "Me pregunto si se enfermó o tuvo algún accidente al venir"

    show cuarto_limpieza
    with dissolve

    ivan "Al entrar al cuarto de limpieza, se notó que Leo no había llegado"
    ivan "Por lo general el suele ordenar todo al llegar, para que se no sea más fácil encontrar los materiales"
    ivan "Realmente espero que no le haya ocurrido nada grave"
    ivan "Como aún faltaban unos 15 minutos para empezar con mi jornada laboral"
    ivan "Decidí acercarme a la ventana y apreciar el bello paisaje que se tiene desde esta habitación"

    show paisaje_nieve_ventana
    with dissolve

    ivan "Mientras me perdía en mis vacíos pensamientos"
    ivan "A lo lejos empecé a notar como si algo se acercara"
    ivan "La verdad me extrañó muchísimo eso ya que nadie suele visitar este lugar"

    show zombies_acercandose
    with dissolve

    ivan "Mientras más se acercaba me di cuenta que parecía como si una horda de personas vienera a este lugar"
    ivan "Era muy extraño, parecía como si fueran zombies"

    show paisaje_nieve_ventana
    with dissolve

    ivan "Empecé a asustarme así que me decidí en notificar a mis superiores"

    show interior_central_nuclear2
    with dissolve

    ivan "Al salir, me di cuenta que no había nadie en su puesto"
    ivan "Y de repente sonó una alarma y la central se tiñó de color rojo"

    show alerta_roja
    with dissolve

    voz "Advertencia, código rojo, se ha detectado una horda de zombies dirigirse hacia la central nuclear"
    voz "Para precautelar la seguridad de la central y sus empleados, se ha decido bloquear todas las entrad..."
    voz "..."
    ivan "Que extraño, ¿ocurrió algo?"
    desconocido "Corran chicos, los zombies han logrado entr..."

    show encerrar_central_nuclear
    with dissolve

    ivan "Corrí inmediatamente a una sala para refugiarme"
    ivan "Entré a una, cerré la puerta y Al buscar que poder mover para bloquear la entrada"
    ivan "Una persona empezó a dar golpes a la puerta pidiendo que lo deje entrar"

    show puerta_abierta
    with hpunch

    desconocido "¡AYUDA, DÉJAME ENTRAR!"
    ivan "Abrí la puerta y apareció un científico de la central"

    show cientificoIMG:
        xpos 540
        ypos 286
    with zoomin

    cientifico "Escucha bien lo que te voy a decir, la central nuclear va a explotar, no tenemos mucho tiempo"
    cientifico "Atrás tuyo hay un panel de control, en él hay un sistema para desactivar el funcionamiento de la central"
    cientifico "Tenemos que evitar la explosión a toda costa, no solo por nuestras vidas"
    cientifico "En caso de que explote y sobreviva algún zombie, es posible que mute y se convierta en un ser más peligroso"
    cientifico "Yo te ayudar..."

    hide cientificoIMG
    with zoomout

    ivan "El científico fue arrastrado por unos zombies mientras otros entraron a por mi"

    show zombies:
        xpos 335
        ypos 258
    with zoominout

    ivan "Me di media vuelta y corrí a la sala del panel de control"

    show sala_control
    with fade

    ivan "Bueno, tengo que desactivar esto rápido antes de que explote"

    call screen sala_control

    # Saltar al nivel que se seleccinó al inicio del juego


# Pantallas

# Pantalla de la sala de control
screen sala_control:

    add "sala_control.png"

    imagebutton:
        idle "seleccionar_panel_idle.png"
        hover "seleccionar_panel_hover.png"
        xpos 664 
        ypos 193
        action If(seleccionar_nivel1, true = [Jump("nivel1")], false = [Jump("nivel2")])


# Pantalla de final feliz
label final_feliz:

    show final feliz
    with dissolve

    ivan "Y así fue el día en como salvé a toda la población de que ocurra una catástrofe mayor"
    ivan "Al final fui compensado frente a toda la población por la alcaldía"

    return

# Pantalla de final triste
label explotar_central:
    
    show explosion
    with dissolve

    narrador "Y así fue como no se pudo evitar la explosión nuclear y los zombies sobrevivientes lograron mutar"
    narrador "Aniquilaron a toda la población del país y poco a poco se fueron expandiendo por el mundo"    

    return