//Importación de librerías
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <windows.h>


//Creación de estructura de Agenda
typedef struct Agenda Agenda;
struct Agenda
{
	int ID;
	char nombre[100];
	char telefono[100];
	char email[100];
};


//Importación de funciones
void gotoxy(int x,int y);
void dibujarCuadro(int x1,int y1,int x2,int y2);
void regresar();


int main()
{	
	system("COLOR e0"); //Darle color a la terminal
	
	//Declaración de variables
	int opcion_usuario;
	int leer_contacto;
	int borrar_contacto;
	int editar_contacto;
	int comparar;
	int contador = 0;
	char nuevo_nombre[50];
	char nuevo_telefono[50];
	char nuevo_email[50];
	
	//Plantilla de la agenda
	Agenda contactos[] = {
		{ 1, "-", "-", "-" },
		{ 2, "-", "-", "-" },
		{ 3, "-", "-", "-" },
		{ 4, "-", "-", "-" },
		{ 5, "-", "-", "-" },
		{ 6, "-", "-", "-" },
		{ 7, "-", "-", "-" },
		{ 8, "-", "-", "-" },
		{ 9, "-", "-", "-" },
		{ 10, "-", "-", "-" },
	};
	
	do //Bucle Do-while para iniciar el programa
	{ 
		//Bucle For para saber cuántos contactos hay registrados
		for (int i = 0; i < 10; i++){
			
			comparar = strcmp(contactos[i].nombre, "-");
			
			if (comparar != 1) {
				contador += 1;
			}
		}
		
		//Líneas y cuadros para encapsular la agenda
		dibujarCuadro(1, 0, 118, 80);
		dibujarCuadro(3, 1, 116, 3);
		
		//Impresión del menú de opciones
		gotoxy(39,2); printf("Bienvenido a tu agenda personal (%i contactos)\n\n", 10 - contador);
		printf("\t1. Listar contactos\n");
		printf("\t2. Crear un contacto\n");
		printf("\t3. Leer contacto\n");
		printf("\t4. Editar un contacto\n");
		printf("\t5. Borrar un contacto\n");
		printf("\t6. Salir del programa\n");
		printf("\n\tEscoge una opción: ");
		scanf("%i", &opcion_usuario);
		printf("\n");
		
		
		switch (opcion_usuario)
		{	
		case 1:
			//Bucle for para listar los contactos
			for (int i = 0; i < 10; i++){
				printf("\tID: %i\n", contactos[i].ID);
				printf("\tNombre: %s\n\n", contactos[i].nombre);
			}
			regresar();
			break;
			
			
		case 2:
			if (contador > 0){ //Condición para saber si la agenda está llena
				
				//Bucle for para agregar un nuevo contacto
				for (int i = 0; i < 10; i++){
					
					//Comparación para saber si el contacto está vacío
					comparar = strcmp(contactos[i].nombre, "-");
					
					if (comparar != 1) {
						//Ingreso de datos para registrar nuevo contacto
						gets(nuevo_nombre);
						printf("\tInserta el nombre: ");
						gets(nuevo_nombre);
						printf("\tInserta el telefono: ");
						gets(nuevo_telefono);
						printf("\tInserta el email: ");
						gets(nuevo_email);
						printf("\n");
						
						strcpy(contactos[i].nombre, nuevo_nombre);
						strcpy(contactos[i].telefono, nuevo_telefono);
						strcpy(contactos[i].email, nuevo_email);
						printf("\tContacto añadido exitósamente\n\n");
						break;
					}
				}
				regresar();
				break;
			}
			else{
				//Impresión en caso de que la agenda esté llena
				printf("\tAgenda llena\n\n");
				regresar();
				break;
			}
			
			
		case 3:
				//Ingreso de dato para saber que contacto se va a leer
				do //Bucle do-while para controlar que se inserte un contacto dentro del rango
				{
					printf("\t¿Qué contacto deseas leer? (Inserta el ID): ");
					scanf("%i", &leer_contacto);
					
					if (leer_contacto < 1 || leer_contacto > 10){
						printf("\n\tContacto fuera de rango\n\n");
					}
					
				} while(leer_contacto < 1 || leer_contacto > 10);
				
				leer_contacto -= 1;
				
				//Impresión de datos del contacto escogido
				printf("\n\tID: %i\n", contactos[leer_contacto].ID);
				printf("\tNombre: %s\n", contactos[leer_contacto].nombre);
				printf("\tTeléfono: %s\n", contactos[leer_contacto].telefono);
				printf("\tEmail: %s\n\n", contactos[leer_contacto].email);
				
				regresar();
				break;
				
				
		case 4:
			//Ingreso de dato para saber que contacto se va a editar
			do //Bucle do-while para controlar que se inserte un contacto dentro del rango 
			{
				printf("\t¿Qué contacto deseas editar? (Inserta el ID): ");
				scanf("%i", &editar_contacto);
				
				if (editar_contacto < 1 || editar_contacto > 10){
					printf("\n\tContacto fuera de rango\n\n");
				}
				
			} while(editar_contacto < 1 || editar_contacto > 10);
			
			editar_contacto -= 1;
			
			//Comparación para saber si el contacto está vacío
			comparar = strcmp(contactos[editar_contacto].nombre, "-");
			
			//Ingreso de nuevos datos para el contacto que se quiere editar
			if (comparar == 1) {
				gets(nuevo_nombre);
				printf("\n\tInserta el nombre: ");
				gets(nuevo_nombre);
				printf("\tInserta el telefono: ");
				gets(nuevo_telefono);
				printf("\tInserta el email: ");
				gets(nuevo_email);
				printf("\n");
				
				strcpy(contactos[editar_contacto].nombre, nuevo_nombre);
				strcpy(contactos[editar_contacto].telefono, nuevo_telefono);
				strcpy(contactos[editar_contacto].email, nuevo_email);
				printf("\tContacto editado exitósamente\n\n");
				regresar();
				break;
			}
			//Impresión en caso de que el contacto esté vacío
			else{
				printf("\n\tEl contacto se encuentra vacío\n\n");
				regresar();
				break;
			}
			
			
		case 5:
				//Ingreso de dato para saber que contacto se va a borrar
				do //Bucle do-while para controlar que se inserte un contacto dentro del rango
				{
					printf("\t¿Qué contacto deseas borrar? (Inserta el ID): ");
					scanf("%i", &borrar_contacto);
					
					if (borrar_contacto < 1 || borrar_contacto > 10){
						printf("\n\tContacto fuera de rango\n\n");
					}
					
				} while(borrar_contacto < 1 || borrar_contacto > 10);
				
				borrar_contacto -= 1;
				
				//Comparación para saber si el contacto está vacío
				comparar = strcmp(contactos[borrar_contacto].nombre, "-");
				
				//Si hay un contacto registado, este se borra
				if (comparar == 1) {
					strcpy(contactos[borrar_contacto].nombre, "-");
					strcpy(contactos[borrar_contacto].telefono, "-");
					strcpy(contactos[borrar_contacto].email, "-");
					printf("\n\tContacto borrado exitósamente\n\n");
					regresar();
					break;
				}
				//Impresión en caso de que el contacto esté vacío
				else{
					printf("\n\tEl contacto ya se encuentra vacío\n\n");
					regresar();
					break;
				}
				
				
		case 6:
					//Despedida y agradecimiento por usar la Agenda
					printf("\tGracias por usar la agenda, vuelve pronto!\n\n\n");
					break;
					
					
		default:
			//En caso de insertar una opción incorrecta
			printf("\tOpción no válida. Escoja otra vez\n\n");
			regresar();
		}
		
		//Reseteo del contador en cada iteración del Do-while
		contador = 0;
		
	} while(opcion_usuario != 6);
	
	return 0;
}


//Función para ubicar el cursor en una posición determinada de la pantalla 
void gotoxy(int x,int y)
{
	HANDLE hcon;   
	hcon = GetStdHandle(STD_OUTPUT_HANDLE);
	COORD dwPos;
	dwPos.X = x;
	dwPos.Y= y;
	SetConsoleCursorPosition(hcon,dwPos);
}

//Función que dibujar cuadro
void dibujarCuadro(int x1,int y1,int x2,int y2)
{
	int i;
	
	for (i=x1;i<x2;i++)
	{
		gotoxy(i,y1); printf("\304"); //linea horizontal superior
		gotoxy(i,y2); printf("\304"); //linea horizontal inferior
	}
	
	for (i=y1;i<y2;i++)
	{
		gotoxy(x1,i); printf("\263"); //linea vertical izquierda
		gotoxy(x2,i); printf("\263"); //linea vertical derecha
	}
	//Esquinas
	gotoxy(x1,y1); printf("\332");
	gotoxy(x1,y2); printf("\300");
	gotoxy(x2,y1); printf("\277");
	gotoxy(x2,y2); printf("\331");
}

//Función para regresar al menú de opciones
void regresar()
{
	//Declaración de variables
	char tecla;
	
	do //Bucle Do-while para inicializar la función
	{
		fflush(stdin); //Línea que permite esperar la respuesta del usuario
		printf("\tPresiona la tecla 'v' para regresar: ");
		scanf("%c", &tecla);
		
		if (tecla == 'v' || tecla == 'V'){
			system("cls"); //Se limpia la consola o terminal
			break;
		}
		
	} while(tecla != 'v' || tecla != 'V');
}
