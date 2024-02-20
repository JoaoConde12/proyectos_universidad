# Funciones de python

init:
    python:

        def countdown(st, at, length = 0.0):

            remaining = length - st

            if remaining > 5.0:
                return Text("%.1f" % remaining, color = "fff", size = 24), .1
            elif remaining > 0.0:
                return Text("%.1f" % remaining, color = "f00", size = 24), .1
            else:
                return anim.Blink(Text("0.0", color = "fff", size = 24)), None


        # Función para que se mueve el slider de la barra del minijuego de la palanca

        def slider_update(st):

            global slider_speed
            global random_x

            for sprite in slider_sprites:

                if sprite.type == "slider":
                    if round(sprite.x) < slider_bar_size[0] - slider_size[0] and sprite.direction == "right":
                        sprite.x += slider_speed
                        slider_speed += 0.04

                    elif round(sprite.x) >= slider_bar_size[0] - slider_size[0] and sprite.direction == "right":
                        sprite.direction = "left"
                        slider_speed = 10

                    elif round(sprite.x) > 0 and sprite.direction == "left":
                        sprite.x -= slider_speed
                        slider_speed += 0.04

                    elif round(sprite.x) == 0 and sprite.direction == "left":
                        sprite.direction = "right"
                        slider_speed = 10

                elif sprite.type == "safe-zone":
                    sprite.x = random_x

            if not slider_stop:
                return 0

            else:
                return None


        # Función para que verificar si se ganó en el minijuego de la palanca

        def check_slider_safe_zone():

            global palanca_off
            global intentos_bajar_palanca
            global slider_stop

            for slider in slider_sprites:
                if slider.type == "slider":
                    for safe_zone in slider_sprites:
                        if safe_zone.type == "safe-zone":

                            if safe_zone.x < slider.x < safe_zone.x + safe_zone_size[0]:
                                palanca_off = True
                                slider_stop = True
                                # renpy.play("audio") -----> Añadir audio

                            elif intentos_bajar_palanca > 0:
                                # Añadir audio
                                intentos_bajar_palanca -= 1

                            if intentos_bajar_palanca == 0:
                                renpy.jump("final_explosion_nivel1")
                                slider_stop = True


        # Función para reducir y aumentar el nivel de agua

        def reducir_agua():

            global nivel_agua
            global temperatura_termometro
            global agua_desfogada

            nivel_agua -= 15
            temperatura_termometro -= 34

            if nivel_agua < 50:
                agua_desfogada = True

        def aumentar_agua():

            global nivel_agua
            global temperatura_termometro

            nivel_agua += 25
            temperatura_termometro += 20

    

# Aumentar el tamaño
transform half_size:
    zoom 0.5


# Nivel 1
label nivel1:    

    $slider_SM = SpriteManager(update = slider_update)

    # Variables del slider
    $slider_sprites = []
    $slider_bar_size = (int(1300/2), int(70/2))
    $slider_image = Image("slider.png")
    $slider_transform = Transform(child = slider_image, zoom = 0.5)
    $slider_sprites.append(slider_SM.create(slider_transform))
    $slider_sprites[-1].type = "slider"
    $slider_sprites[-1].direction = "right"
    $slider_size = (int(48/2), int(66/2))
    $slider_speed = 10
    $slider_stop = False

    # Variables de zona de victoria
    $safe_zone_image = Image("safe-zone.png")
    $safe_zone_transform = Transform(child = safe_zone_image, zoom = 0.5)
    $safe_zone_size = (int(149 / 2), int(70 / 2))
    $slider_sprites.append(slider_SM.create(safe_zone_transform))
    $slider_sprites[-1].type = "safe-zone"
    $random_x = renpy.random.randint(0, slider_bar_size[0] - safe_zone_size[0])

    # Variables de la palanca
    $palanca_off = False
    $intentos_bajar_palanca = 2

    call screen panel


# Avance una vez desactivada las turbinas
label nivel1_avance1:

    $ventilacion_danyada = True

    call screen panel_avance1


# Avance una vez desactivada la ventilación
label nivel1_avance2:

    $nivel_agua = 85
    $temperatura_termometro = 100
    $agua_desfogada = False

    call screen panel_avance2


# Avance una vez desfogada el agua caliente
label nivel1_avance3:

    call screen panel_avance3


# Avance una vez desfogada entrada el agua fría
label nivel1_avance4:

    call screen panel_avance4


# Avance una vez desactivado el reactor
label nivel1_avance5:

    call screen panel_avance5


label final_feliz_nivel1:

    call screen final_nivel1

    return


label final_explosion_nivel1:

    call screen explosion_nivel1

    return