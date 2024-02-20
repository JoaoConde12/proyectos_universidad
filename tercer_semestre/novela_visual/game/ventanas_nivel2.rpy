# Ventanas del juego

screen alerta_error1:

    if vidas_jugador > 0:
        key ["K_SPACE", "mousedown_1"] action [Function(restar_vidas), Hide("alerta_error1"), Jump("nivel2")]

        frame:
            xalign 0.5 yalign 0.5
            padding(10, 10)
            vbox:
                text "Escogiste la opción incorrecta,\ndebías desactivar las turbinas\n\nTe quedan: [vidas_jugador] vidas" size 30 text_align 0.5
    else:
        key ["K_SPACE", "mousedown_1"] action [Function(restar_vidas), Hide("alerta_error1"), Jump("nivel2")]

        frame:
            xalign 0.5 yalign 0.5
            padding(10, 10)
            vbox:
                text "Escogiste la opción incorrecta\n\nPerdiste todas tus vidas" size 30 text_align 0.5


screen alerta_opcion_correcta1:

    key ["K_SPACE", "mousedown_1"] action [Hide("alerta_opcion_correcta1"), Jump("nivel2_avance1")]

    frame:
        xalign 0.5 yalign 0.5
        padding(10, 10)
        vbox:
            text "Has seleccionado la opción correcta, sigue\nasí y pronto acabará esta pesadilla" size 30 text_align 0.5


# ------------------------------------------------------------------------------------------------------------
screen alerta_error2:

    if vidas_jugador > 0:
        key ["K_SPACE", "mousedown_1"] action [Function(restar_vidas), Hide("alerta_error2"), Jump("nivel2_avance1")]

        frame:
            xalign 0.5 yalign 0.5
            padding(10, 10)
            vbox:
                text "Escogiste la opción incorrecta, debías\n desactivar el sistema de ventilación\n\nTe quedan: [vidas_jugador] vidas" size 30 text_align 0.5
    else:
        key ["K_SPACE", "mousedown_1"] action [Function(restar_vidas), Hide("alerta_error2"), Jump("nivel2_avance1")]

        frame:
            xalign 0.5 yalign 0.5
            padding(10, 10)
            vbox:
                text "Escogiste la opción incorrecta\n\nPerdiste todas tus vidas" size 30 text_align 0.5


screen alerta_opcion_correcta2:

    key ["K_SPACE", "mousedown_1"] action [Hide("alerta_opcion_correcta2"), Jump("nivel2_avance2")]

    frame:
        xalign 0.5 yalign 0.5
        padding(10, 10)
        vbox:
            text "Has seleccionado la opción correcta, sigue\nasí y pronto acabará esta pesadilla" size 30 text_align 0.5


# ------------------------------------------------------------------------------------------------------------
screen alerta_error3:

    if vidas_jugador > 0:
        key ["K_SPACE", "mousedown_1"] action [Function(restar_vidas), Hide("alerta_error3"), Jump("nivel2_avance2")]

        frame:
            xalign 0.5 yalign 0.5
            padding(10, 10)
            vbox:
                text "Escogiste la opción incorrecta,\ndebías desfogar el agua caliente\n\nTe quedan: [vidas_jugador] vidas" size 30 text_align 0.5
    else:
        key ["K_SPACE", "mousedown_1"] action [Function(restar_vidas), Hide("alerta_error3"), Jump("nivel2_avance2")]

        frame:
            xalign 0.5 yalign 0.5
            padding(10, 10)
            vbox:
                text "Escogiste la opción incorrecta\n\nPerdiste todas tus vidas" size 30 text_align 0.5


screen alerta_opcion_correcta3:

    key ["K_SPACE", "mousedown_1"] action [Hide("alerta_opcion_correcta3"), Jump("nivel2_avance3")]

    frame:
        xalign 0.5 yalign 0.5
        padding(10, 10)
        vbox:
            text "Has seleccionado la opción correcta, sigue\nasí y pronto acabará esta pesadilla" size 30 text_align 0.5


# ------------------------------------------------------------------------------------------------------------
screen alerta_error4:

    if vidas_jugador > 0:
        key ["K_SPACE", "mousedown_1"] action [Function(restar_vidas), Hide("alerta_error4"), Jump("nivel2_avance3")]

        frame:
            xalign 0.5 yalign 0.5
            padding(10, 10)
            vbox:
                text "Escogiste la opción incorrecta,\ndebías enviar agua fría al sistema\n\nTe quedan: [vidas_jugador] vidas" size 30 text_align 0.5
    else:
        key ["K_SPACE", "mousedown_1"] action [Function(restar_vidas), Hide("alerta_error4"), Jump("nivel2_avance3")]

        frame:
            xalign 0.5 yalign 0.5
            padding(10, 10)
            vbox:
                text "Escogiste la opción incorrecta\n\nPerdiste todas tus vidas" size 30 text_align 0.5


screen alerta_opcion_correcta4:

    key ["K_SPACE", "mousedown_1"] action [Hide("alerta_opcion_correcta4"), Jump("nivel2_avance4")]

    frame:
        xalign 0.5 yalign 0.5
        padding(10, 10)
        vbox:
            text "Has seleccionado la opción correcta, sigue\nasí y pronto acabará esta pesadilla" size 30 text_align 0.5


# ------------------------------------------------------------------------------------------------------------
screen alerta_error5:

    if vidas_jugador > 0:
        key ["K_SPACE", "mousedown_1"] action [Function(restar_vidas), Hide("alerta_error5"), Jump("nivel2_avance4")]

        frame:
            xalign 0.5 yalign 0.5
            padding(10, 10)
            vbox:
                text "Escogiste la opción incorrecta,\ndebías apagar el reactor\n\nTe quedan: [vidas_jugador] vidas" size 30 text_align 0.5
    else:
        key ["K_SPACE", "mousedown_1"] action [Function(restar_vidas), Hide("alerta_error5"), Jump("nivel2_avance4")]

        frame:
            xalign 0.5 yalign 0.5
            padding(10, 10)
            vbox:
                text "Escogiste la opción incorrecta\n\nPerdiste todas tus vidas" size 30 text_align 0.5


screen alerta_opcion_correcta5:

    key ["K_SPACE", "mousedown_1"] action [Hide("alerta_opcion_correcta5"), Jump("nivel2_avance5")]

    frame:
        xalign 0.5 yalign 0.5
        padding(10, 10)
        vbox:
            text "Has seleccionado la opción correcta, sigue\nasí y pronto acabará esta pesadilla" size 30 text_align 0.5


# ------------------------------------------------------------------------------------------------------------
screen alerta_error6:

    if vidas_jugador > 0:
        key ["K_SPACE", "mousedown_1"] action [Function(restar_vidas), Hide("alerta_error6"), Jump("nivel2_avance5")]

        frame:
            xalign 0.5 yalign 0.5
            padding(10, 10)
            vbox:
                text "Escogiste la opción incorrecta,\ndebías apagar el sistema\n\nTe quedan: [vidas_jugador] vidas" size 30 text_align 0.5
    else:
        key ["K_SPACE", "mousedown_1"] action [Function(restar_vidas), Hide("alerta_error6"), Jump("nivel2_avance5")]

        frame:
            xalign 0.5 yalign 0.5
            padding(10, 10)
            vbox:
                text "Escogiste la opción incorrecta\n\nPerdiste todas tus vidas" size 30 text_align 0.5


screen alerta_opcion_correcta6:

    key ["K_SPACE", "mousedown_1"] action [Hide("alerta_opcion_correcta6"), Jump("final_feliz")]

    frame:
        xalign 0.5 yalign 0.5
        padding(10, 10)
        vbox:
            text "Has seleccionado la opción correcta\ndesactivaste la central nuclear" size 30 text_align 0.5


