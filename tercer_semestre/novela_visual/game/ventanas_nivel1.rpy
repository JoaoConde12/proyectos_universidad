# Ventanas del juego

# Ventana al ingresar al panel de la central nuclear
screen panel:    

    add "panel control.jpg"

    text "Turbinas de Generación\nEléctrica":
        text_align 0.5
        xpos 74
        ypos 60
        color "#000"
        size 24

    imagebutton:
        idle "boton rojo.png"
        xpos 49 
        ypos 108

    imagebutton:
        idle "boton rojo.png"
        xpos 49
        ypos 258

    imagebutton:
        idle "palanca_on.png"
        hover "hover_palanca_on.png"
        xpos 210 
        ypos 141
        action Show("palanca_minigame")

    text "Sistema de Ventilación":
        text_align 0.5
        xpos 80
        ypos 415
        color "#000"
        size 24

    imagebutton:
        idle "ventilacion_dañada.png"
        hover "ventilacion_dañada_hover.png"
        xpos 33
        ypos 400
        action If(palanca_off, false = Show("alerta_turbinas"))

    text "Nivel de agua":
        text_align 0.5
        xpos 559
        ypos 67
        color "#000"
        size 24

    bar:
        bar_vertical True
        value StaticValue(85, 100)
        left_bar "tanque_agua_vacia.png"
        right_bar "tanque_agua_caliente.png"
        xysize(140, 250)
        xpos 445
        ypos 116

    imagebutton:
        idle "desfogar_agua.png"
        hover "hover_desfogar_agua.png"
        xpos 634
        ypos 171
        action If(palanca_off, false = Show("alerta_turbinas"))

    imagebutton:
        idle "enviar_agua.png"
        hover "hover_enviar_agua.png"
        xpos 634
        ypos 255
        action If(palanca_off, false = Show("alerta_turbinas"))

    text "Temperatura\nde agua":
        text_align 0.5
        xpos 452
        ypos 400
        color "#000"
        size 24

    bar:
        bar_vertical True
        value StaticValue(100, 100)
        left_bar "termometro_vacio.png"
        right_bar "termometro_mal.png" 
        xysize(75, 200)
        xpos 485
        ypos 492

    text "Nivel de\nenergía (Mwe)":
        text_align 0.5
        xpos 653
        ypos 400
        color "#000"
        size 24

    imagebutton:
        idle "energia_full.png"
        xpos 664
        ypos 492

    text "Reactor":
        text_align 0.5
        xpos 1020
        ypos 116
        color "#000"
        size 24

    imagebutton:
        idle "boton_reactor1.png"
        hover "hover_boton_reactor1.png"
        xpos 966
        ypos 166
        action If(palanca_off, false = Show("alerta_turbinas"))

    text "Detener Sistema":
        text_align 0.5
        xpos 969
        ypos 392
        color "#000"
        size 24

    imagebutton:
        idle "boton_detener.png"
        hover "hover_boton_detener.png"
        xpos 966
        ypos 449
        action If(palanca_off, false = Show("alerta_turbinas"))

        

# Ventanas de alertas
screen alerta_turbinas:

    key ["K_SPACE", "mousedown_1"] action Hide("alerta_turbinas")

    frame:
        xalign 0.5 yalign 0.5
        padding(10, 10)
        vbox:
            text "Primero debes desactivar las\nturbinas de generación eléctrica" size 30 text_align 0.5

screen alerta_ventilacion:

    key ["K_SPACE", "mousedown_1"] action Hide("alerta_ventilacion")

    frame:
        xalign 0.5 yalign 0.5
        padding(10, 10)
        vbox:
            text "Primero debes ventilar\nel contenido radioactivo" size 30 text_align 0.5

screen alerta_desfogar_agua:

    key ["K_SPACE", "mousedown_1"] action Hide("alerta_desfogar_agua")

    frame:
        xalign 0.5 yalign 0.5
        padding(10, 10)
        vbox:
            text "Primero debes desfogar el\nagua caliente del sistema" size 30 text_align 0.5

screen alerta_enviar_agua:

    key ["K_SPACE", "mousedown_1"] action Hide("alerta_enviar_agua")

    frame:
        xalign 0.5 yalign 0.5
        padding(10, 10)
        vbox:
            text "Primero debes enviar\nagua fría al sistema" size 30 text_align 0.5

screen alerta_detener_reactor:

    key ["K_SPACE", "mousedown_1"] action Hide("alerta_detener_reactor")

    frame:
        xalign 0.5 yalign 0.5
        padding(10, 10)
        vbox:
            text "Primero debes apagar el reactor" size 30 text_align 0.5


# Ventana del minijuego de la palanca
screen palanca_minigame:
    
    key ["K_SPACE", "mousedown_1"] action If(palanca_off, true = [Hide("palanca_minigame"), Jump("nivel1_avance1")], false = Function(check_slider_safe_zone))

    image "panel_control_minigame.jpg"

    if not palanca_off:

        frame:
            background "#fff"
            padding (5, 5)
            align (0.5, 0.3)
            text "Intentos: [intentos_bajar_palanca]" size 40 color"#000"

        frame:
            background None
            align (0.5, 0.4)
            xysize slider_bar_size
            image "slider-bar-1.png" at half_size
            add slider_SM

        image "boton_rojo_zoom.png" xpos 135 ypos 329
        image "palanca_on_zoom.png" xpos 635 ypos 441
        
    else:

        frame:
            background "#fff"
            padding (5, 5)
            align (0.5, 0.3)
            text "Intentos: [intentos_bajar_palanca]" size 40 color"#000"

        frame:
            background None
            align (0.5, 0.4)
            xysize slider_bar_size
            image "slider-bar-1.png" at half_size
            add slider_SM

        image "boton_rojo_zoom.png" xpos 135 ypos 329
        image "palanca_on_zoom.png" xpos 635 ypos 441

        key ["K_SPACE", "mousedown_1"] action [Jump("nivel1_avance1"), Hide("palanca_minigame")]

        frame:
            xalign 0.5 yalign 0.5
            padding(10, 10)
            vbox:
                text "Detuvista las turbinas\n de generación eléctrica\n\n Da click o espacio para continuar" size 30 text_align 0.5


# Ventana cuando se logra bajar la palanca para detener las turbinas
screen panel_avance1:

    add "panel control.jpg"

    text "Turbinas de Generación\nEléctrica":
        text_align 0.5
        xpos 74
        ypos 60
        color "#000"
        size 24

    imagebutton:
        idle "boton verde.png"
        xpos 49 
        ypos 108

    imagebutton:
        idle "boton verde.png"
        xpos 49
        ypos 258

    imagebutton:
        idle "palanca off.png"
        xpos 199 
        ypos 127

    text "Sistema de Ventilación":
        text_align 0.5
        xpos 80
        ypos 415
        color "#000"
        size 24

    imagebutton:
        idle "ventilacion_dañada.png"
        hover "ventilacion_dañada_hover.png"
        xpos 33
        ypos 399
        action Show("pasar_parte2")

    text "Nivel de agua":
        text_align 0.5
        xpos 559
        ypos 67
        color "#000"
        size 24

    bar:
        bar_vertical True
        value StaticValue(85, 100)
        left_bar "tanque_agua_vacia.png"
        right_bar "tanque_agua_caliente.png"
        xysize(140, 250)
        xpos 445
        ypos 116

    imagebutton:
        idle "desfogar_agua.png"
        hover "hover_desfogar_agua.png"
        xpos 634
        ypos 171
        action If(ventilacion_danyada, true = Show("alerta_ventilacion"))

    imagebutton:
        idle "enviar_agua.png"
        hover "hover_enviar_agua.png"
        xpos 634
        ypos 255
        action If(ventilacion_danyada, true = Show("alerta_ventilacion"))

    text "Temperatura\nde agua":
        text_align 0.5
        xpos 452
        ypos 400
        color "#000"
        size 24

    bar:
        bar_vertical True
        value StaticValue(100, 100)
        left_bar "termometro_vacio.png"
        right_bar "termometro_mal.png" 
        xysize(75, 200)
        xpos 485
        ypos 492

    imagebutton:
        idle "energia_full.png"
        xpos 664
        ypos 492

    text "Nivel de\nenergía (Mwe)":
        text_align 0.5
        xpos 653
        ypos 400
        color "#000"
        size 24

    text "Reactor":
        text_align 0.5
        xpos 1020
        ypos 116
        color "#000"
        size 24

    imagebutton:
        idle "boton_reactor1.png"
        hover "hover_boton_reactor1.png"
        xpos 966
        ypos 166
        action If(ventilacion_danyada, true = Show("alerta_ventilacion"))

    text "Detener Sistema":
        text_align 0.5
        xpos 969
        ypos 392
        color "#000"
        size 24

    imagebutton:
        idle "boton_detener.png"
        hover "hover_boton_detener.png"
        xpos 966
        ypos 449
        action If(ventilacion_danyada, true = Show("alerta_ventilacion"))


# Ventana de notificación de avanace a la parte 2
screen pasar_parte2:  

    key ["K_SPACE", "mousedown_1"] action [Jump("nivel1_avance2"), Hide("pasar_parte2")]

    frame:
        xalign 0.5 yalign 0.5
        padding(10, 10)
        vbox:
            text "Has desactivado el sistema de ventilación\n\n Da click o espacio para continuar" size 30 text_align 0.5


# Ventana para cuando se requiere desfogar el agua caliente
screen panel_avance2:

    add "panel control.jpg"

    text "Turbinas de Generación\nEléctrica":
        text_align 0.5
        xpos 74
        ypos 60
        color "#000"
        size 24

    imagebutton:
        idle "boton verde.png"
        xpos 49 
        ypos 108

    imagebutton:
        idle "boton verde.png"
        xpos 49
        ypos 258

    imagebutton:
        idle "palanca off.png"
        xpos 199 
        ypos 127

    text "Sistema de Ventilación":
        text_align 0.5
        xpos 80
        ypos 415
        color "#000"
        size 24

    imagebutton:
        idle "ventilacion.png"
        xpos 33
        ypos 399

    text "Nivel de agua":
        text_align 0.5
        xpos 559
        ypos 67
        color "#000"
        size 24

    bar:
        bar_vertical True
        value StaticValue(nivel_agua, 100)
        left_bar "tanque_agua_vacia.png"
        right_bar "tanque_agua_caliente.png"
        xysize(140, 250)
        xpos 445
        ypos 116

    imagebutton:
        idle "enviar_agua.png"
        hover "hover_enviar_agua.png"
        xpos 634
        ypos 255
        action If(agua_desfogada, false = Show("alerta_desfogar_agua"))

    text "Temperatura\nde agua":
        text_align 0.5
        xpos 452
        ypos 400
        color "#000"
        size 24

    imagebutton:
        idle "energia_full.png"
        xpos 664
        ypos 492

    text "Nivel de\nenergía (Mwe)":
        text_align 0.5
        xpos 653
        ypos 400
        color "#000"
        size 24

    text "Reactor":
        text_align 0.5
        xpos 1020
        ypos 116
        color "#000"
        size 24

    imagebutton:
        idle "boton_reactor1.png"
        hover "hover_boton_reactor1.png"
        xpos 966
        ypos 166
        action If(agua_desfogada, false = Show("alerta_desfogar_agua"))

    text "Detener Sistema":
        text_align 0.5
        xpos 969
        ypos 392
        color "#000"
        size 24

    imagebutton:
        idle "boton_detener.png"
        hover "hover_boton_detener.png"
        xpos 966
        ypos 449
        action If(agua_desfogada, false = Show("alerta_desfogar_agua"))

    if nivel_agua > 40:

        imagebutton:
            idle "desfogar_agua.png"
            hover "hover_desfogar_agua.png"
            xpos 634
            ypos 171
            action Function(reducir_agua)

        bar:
            bar_vertical True
            value StaticValue(temperatura_termometro, 100)
            left_bar "termometro_vacio.png"
            right_bar "termometro_mal.png" 
            xysize(75, 200)
            xpos 485
            ypos 492

        key ["K_SPACE", "mousedown_1"] action None
    
    else:

        imagebutton:
            idle "desfogar_agua.png"
            hover "hover_desfogar_agua.png"
            xpos 634
            ypos 171
        
        bar:
            bar_vertical True
            value StaticValue(temperatura_termometro, 100)
            left_bar "termometro_vacio.png"
            right_bar "termometro_mal.png" 
            xysize(75, 200)
            xpos 485
            ypos 492
        
        key ["K_SPACE", "mousedown_1"] action [Jump("nivel1_avance3")]

        frame:
            xalign 0.5 yalign 0.5
            padding(10, 10)
            vbox:
                text "Has desfogado toda el agua caliente\n\n Da click o espacio para continuar" size 30 text_align 0.5


screen panel_avance3:

    add "panel control.jpg"

    text "Turbinas de Generación\nEléctrica":
        text_align 0.5
        xpos 74
        ypos 60
        color "#000"
        size 24

    imagebutton:
        idle "boton verde.png"
        xpos 49 
        ypos 108

    imagebutton:
        idle "boton verde.png"
        xpos 49
        ypos 258

    imagebutton:
        idle "palanca off.png"
        xpos 199 
        ypos 127

    text "Sistema de Ventilación":
        text_align 0.5
        xpos 80
        ypos 415
        color "#000"
        size 24

    imagebutton:
        idle "ventilacion.png"
        xpos 33
        ypos 399

    text "Nivel de agua":
        text_align 0.5
        xpos 559
        ypos 67
        color "#000"
        size 24

    bar:
        bar_vertical True
        value StaticValue(nivel_agua, 100)
        left_bar "tanque_agua_vacia.png"
        right_bar "tanque_agua_fria.png"
        xysize(140, 250)
        xpos 445
        ypos 116

    imagebutton:
        idle "desfogar_agua.png"
        xpos 634
        ypos 171

    text "Temperatura\nde agua":
        text_align 0.5
        xpos 452
        ypos 400
        color "#000"
        size 24

    imagebutton:
        idle "energia_full.png"
        xpos 664
        ypos 492

    text "Nivel de\nenergía (Mwe)":
        text_align 0.5
        xpos 653
        ypos 400
        color "#000"
        size 24

    text "Reactor":
        text_align 0.5
        xpos 1020
        ypos 116
        color "#000"
        size 24

    imagebutton:
        idle "boton_reactor1.png"
        hover "hover_boton_reactor1.png"
        xpos 966
        ypos 166
        action If(agua_desfogada, true = Show("alerta_enviar_agua"))

    text "Detener Sistema":
        text_align 0.5
        xpos 969
        ypos 392
        color "#000"
        size 24

    imagebutton:
        idle "boton_detener.png"
        hover "hover_boton_detener.png"
        xpos 966
        ypos 449
        action If(agua_desfogada, true = Show("alerta_enviar_agua"))

    if nivel_agua < 100:

        imagebutton:
            idle "enviar_agua.png"
            hover "hover_enviar_agua.png"
            xpos 634
            ypos 255
            action Function(aumentar_agua)

        bar:
            bar_vertical True
            value StaticValue(temperatura_termometro, 100)
            left_bar "termometro_vacio.png"
            right_bar "termometro_bien.png" 
            xysize(75, 200)
            xpos 485
            ypos 492

        key ["K_SPACE", "mousedown_1"] action None
    
    else:

        imagebutton:
            idle "enviar_agua.png"
            hover "hover_enviar_agua.png"
            xpos 634
            ypos 255

        bar:
            bar_vertical True
            value StaticValue(temperatura_termometro, 100)
            left_bar "termometro_vacio.png"
            right_bar "termometro_bien.png" 
            xysize(75, 200)
            xpos 485
            ypos 492
        
        key ["K_SPACE", "mousedown_1"] action [Jump("nivel1_avance4")]

        frame:
            xalign 0.5 yalign 0.5
            padding(10, 10)
            vbox:
                text "Has equilibrado la temperatura del reactor\n\n Da click o espacio para continuar" size 30 text_align 0.5


screen panel_avance4:

    add "panel control.jpg"

    text "Turbinas de Generación\nEléctrica":
        text_align 0.5
        xpos 74
        ypos 60
        color "#000"
        size 24

    imagebutton:
        idle "boton verde.png"
        xpos 49 
        ypos 108

    imagebutton:
        idle "boton verde.png"
        xpos 49
        ypos 258

    imagebutton:
        idle "palanca off.png"
        xpos 199 
        ypos 127

    text "Sistema de Ventilación":
        text_align 0.5
        xpos 80
        ypos 415
        color "#000"
        size 24

    imagebutton:
        idle "ventilacion.png"
        xpos 33
        ypos 399

    text "Nivel de agua":
        text_align 0.5
        xpos 559
        ypos 67
        color "#000"
        size 24

    bar:
        bar_vertical True
        value StaticValue(nivel_agua, 100)
        left_bar "tanque_agua_vacia.png"
        right_bar "tanque_agua_fria.png"
        xysize(140, 250)
        xpos 445
        ypos 116

    imagebutton:
        idle "desfogar_agua.png"
        xpos 634
        ypos 171

    text "Temperatura\nde agua":
        text_align 0.5
        xpos 452
        ypos 400
        color "#000"
        size 24

    imagebutton:
        idle "energia_full.png"
        xpos 664
        ypos 492

    text "Nivel de\nenergía (Mwe)":
        text_align 0.5
        xpos 653
        ypos 400
        color "#000"
        size 24

    imagebutton:
        idle "enviar_agua.png"
        xpos 634
        ypos 255

    bar:
        bar_vertical True
        value StaticValue(temperatura_termometro, 100)
        left_bar "termometro_vacio.png"
        right_bar "termometro_bien.png" 
        xysize(75, 200)
        xpos 485
        ypos 492

    text "Reactor":
        text_align 0.5
        xpos 1020
        ypos 116
        color "#000"
        size 24

    imagebutton:
        idle "boton_reactor1.png"
        hover "hover_boton_reactor1.png"
        xpos 966
        ypos 166
        action Show("pasar_parte_final")

    text "Detener Sistema":
        text_align 0.5
        xpos 969
        ypos 392
        color "#000"
        size 24

    imagebutton:
        idle "boton_detener.png"
        hover "hover_boton_detener.png"
        xpos 966
        ypos 449
        action Show("alerta_detener_reactor")

    default timeout = 5.0

    key ["K_SPACE", "mousedown_1"] action None


screen pasar_parte_final:  

    key ["K_SPACE", "mousedown_1"] action [Jump("nivel1_avance5"), Hide("pasar_parte_final")]

    frame:
        xalign 0.5 yalign 0.5
        padding(10, 10)
        vbox:
            text "Has apagado el reactor\n\nDa click o espacio para continuar" size 30 text_align 0.5


screen juego_completado:  

    key ["K_SPACE", "mousedown_1"] action [Jump("final_feliz_nivel1"), Hide("juego_completado")]

    frame:
        xalign 0.5 yalign 0.5
        padding(10, 10)
        vbox:
            text "Lograste desactivar el sistema de la central nuclear\n\nDa click o espacio para continuar" size 30 text_align 0.5


screen panel_avance5:

    add "panel control.jpg"

    text "Turbinas de Generación\nEléctrica":
        text_align 0.5
        xpos 74
        ypos 60
        color "#000"
        size 24

    imagebutton:
        idle "boton verde.png"
        xpos 49 
        ypos 108

    imagebutton:
        idle "boton verde.png"
        xpos 49
        ypos 258

    imagebutton:
        idle "palanca off.png"
        xpos 199 
        ypos 127

    text "Sistema de Ventilación":
        text_align 0.5
        xpos 80
        ypos 415
        color "#000"
        size 24

    imagebutton:
        idle "ventilacion.png"
        xpos 33
        ypos 399

    text "Nivel de agua":
        text_align 0.5
        xpos 559
        ypos 67
        color "#000"
        size 24

    bar:
        bar_vertical True
        value StaticValue(nivel_agua, 100)
        left_bar "tanque_agua_vacia.png"
        right_bar "tanque_agua_fria.png"
        xysize(140, 250)
        xpos 445
        ypos 116

    imagebutton:
        idle "desfogar_agua.png"
        xpos 634
        ypos 171

    text "Temperatura\nde agua":
        text_align 0.5
        xpos 452
        ypos 400
        color "#000"
        size 24

    imagebutton:
        idle "energia_zero.png"
        xpos 664
        ypos 492

    text "Nivel de\nenergía (Mwe)":
        text_align 0.5
        xpos 653
        ypos 400
        color "#000"
        size 24

    imagebutton:
        idle "enviar_agua.png"
        xpos 634
        ypos 255

    bar:
        bar_vertical True
        value StaticValue(temperatura_termometro, 100)
        left_bar "termometro_vacio.png"
        right_bar "termometro_bien.png" 
        xysize(75, 200)
        xpos 485
        ypos 492

    text "Reactor":
        text_align 0.5
        xpos 1020
        ypos 116
        color "#000"
        size 24

    imagebutton:
        idle "boton_reactor2.png"
        xpos 966
        ypos 166

    text "Detener Sistema":
        text_align 0.5
        xpos 969
        ypos 392
        color "#000"
        size 24

    imagebutton:
        idle "boton_detener.png"
        hover "hover_boton_detener.png"
        xpos 966
        ypos 449
        action Show("juego_completado")

    key ["K_SPACE", "mousedown_1"] action None


screen final_nivel1:

    add "final feliz.png"

    key ["K_SPACE", "mousedown_1"] action Return()

    frame:
        xalign 0.5 yalign 0.9
        padding(10, 10)
        vbox:
            text "Y así fue el día en como salvé a toda la población de que ocurra una catástrofe mayor\n\nAl final fui compensado frente a toda la población por la alcaldía" size 24 text_align 0.5


screen explosion_nivel1:

    add "explosion.png"

    key ["K_SPACE", "mousedown_1"] action Return()

    frame:
        xalign 0.5 yalign 0.9
        padding(10, 10)
        vbox:
            text "Y así fue como no se pudo evitar la explosión nuclear y los zombies sobrevivientes lograron mutar\n\nAniquilaron a toda la población del país y poco a poco se fueron expandiendo por el mundo" size 24 text_align 0.5
