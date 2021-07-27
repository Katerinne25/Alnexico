#include <stdio.h>
#include <string.h>


int EsPClave(char medio[]){
    char PClave[20][18] = {"reflector","fuentedeagua","id","cadena",
                           "psi","lumen","estado","pausa","instruccion",
                           "comando","asignacion","funcion","ejecutar_funcion",
                           "condicional","mientras","imprimir",
                           "flotante", "cadena", "entero", "booleano"};
    int i, flag = 0;
    for(i = 0; i < 20; ++i){
        if(strcmp(PClave[i], medio) == 0){
            flag = 1;
            break;
        }
    }
    return flag;
    }

 int main(){

    FILE *archivo;
holaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
    archivo = fopen("C:\\Users\\Luis\\Documents\\Programacion y Git\\TareaLenguajes1\\Analizador Lexico\\doc.txt","r");
    if(archivo == NULL){
        puts("No se pudo leer el archivo");
    }else{
        puts("Se puedo arreglar");
    }

    return 0;
}
