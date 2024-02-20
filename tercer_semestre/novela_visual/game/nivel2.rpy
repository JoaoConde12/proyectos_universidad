# Código del juego del nivel 2
init:
    python:

        vidas_jugador = 4

        def restar_vidas():
            
            global vidas_jugador

            if vidas_jugador > 0:
                vidas_jugador -= 1
                renpy.restart_interaction() 
            else:
                renpy.jump("explotar_central")


label nivel2:

    scene central_nuclear_1

    menu:
        
        "Escoge la acción que debes hacer"

        "Desfogar el agua caliente":
            call screen alerta_error1

        "Apagar el reactor":
            call screen alerta_error1

        "Desactivar las turbinas de generación eléctrica":
            call screen alerta_opcion_correcta1

        "Desactivar el sistema de ventilación":
            call screen alerta_error1


    
label nivel2_avance1:

    scene central_nuclear_2
    with dissolve

    menu:
        
        "Escoge la acción que debes hacer"

        "Desactivar el sistema de ventilación":
            call screen alerta_opcion_correcta2

        "Apagar el sistema de la central":
            call screen alerta_error2

        "Enviar agua fría al sistema":
            call screen alerta_error2

        "Desfogar el agua caliente":
            call screen alerta_error2


label nivel2_avance2:

    scene central_nuclear_3
    with dissolve

    menu:
        
        "Escoge la acción que debes hacer"

        "Apagar el reactor":
            call screen alerta_error3

        "Apagar el sistema de la central":
            call screen alerta_error3

        "Enviar agua fría al sistema":
            call screen alerta_error3

        "Desfogar el agua caliente":
            call screen alerta_opcion_correcta3


label nivel2_avance3:

    scene central_nuclear_4
    with dissolve

    menu:
        
        "Escoge la acción que debes hacer"

        "Apagar el reactor":
            call screen alerta_error4

        "Enviar agua fría al sistema":
            call screen alerta_opcion_correcta4

        "Apagar el sistema de la central":
            call screen alerta_error4


label nivel2_avance4:

    scene central_nuclear_5
    with dissolve

    menu:
        
        "Escoge la acción que debes hacer"

        "Apagar el reactor":
            call screen alerta_opcion_correcta5

        "Apagar el sistema de la central":
            call screen alerta_error5


label nivel2_avance5:

    scene central_nuclear_6
    with dissolve

    menu:
        
        "Escoge la acción que debes hacer"

        "Apagar el sistema de la central":
            call screen alerta_opcion_correcta6

        "Esperar 10 segundos":
            call screen alerta_error6


