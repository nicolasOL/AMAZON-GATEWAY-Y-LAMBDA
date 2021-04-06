# Laboratorio-AREP
# Escuela Colombiana de Ingeniería Julio Garavito - Arquitecturas Empresarial AREP - AMAZON GATEWAY Y LAMBDA
# AREP
## REQUERIMIENTOS
Diseñe, construya y despliegue los siguientes servicios en un microcontenedor docker desplegado en una instancei a EC2 de AWS. Cada estudiante debe seleccionar para desarrollar dos funciones matemáticas de acuerdo a los dos últimos dígitos de su cédula como se especifica en la lista. Todas las funciones reciben un solo parámetro de tipo "Double" y retornan una prámetro sde tipo "Double".

* convert

Implemente los servicios para responder al método de solicitud HTTP GET. Deben usar el nombre de la función especificado en la lista y el parámetro debe ser pasado en la variable de query con nombre "value".

Ejemplo de una llamado:

https://amazonxxx.x.xxx.x.xxx:{port}/convert?value=3.141592


Salida. El formato de la salida y la respuesta debe ser un JSON con el siguiente formato

{

 "operation": "convert",

 "input":  32,

 "output":  0.0

}

  
  Si deseas usarlo en tu maquina local, es necesario tener:
  
  * Maven 
  * Java 
  * Git
  * Spark  

 ### Como usarlo?
  ## Localmente:
  En primer lugar vamos a descargar el repositorio en nuestra máquina local, y en la carpeta de 
nuestra preferencia. En consola vamos a digitar el siguiente comando para clonar el repositorio.

```
git clone https://github.com/nicolasOL/AMAZON-GATEWAY-Y-LAMBDA/
```

Entremos a el directorio del proyecto

```
cd AMAZON-GATEWAY-Y-LAMBDA
```

Debemos compilar el proyecto, que contiene las clases necesarias para poder correr la app. Por medio de maven vamos a crear todos los compilables **.class**. Desde consola, y ubicados en la carpeta donde se encuentra nuestra configuración de maven.

```
mvn compile
```

Ahora que nuestras clases etan compiladas vamos a ejecutar la clase principal para
ver el código en acción :

```
mvn exec:java -Dexec.mainClass="edu.escuelaing.arem.parcial.parcialWebServer.ParcialWebServer"
```
Los datos del programa se reciben por entrada en el despliegue separados por espacios.
   
## Pruebas   
Para ejecutar las pruebas es necesario ejecutar:
```
mvn test
``` 
Adicionalmente se probo el API con POSTMAN como se observa en el video [aqui](https://github.com/nicolasOL/AMAZON-GATEWAY-Y-LAMBDA/blob/master/Video-funcionamiento.mp4)

 ## Generación de imágenes y contenedores Docker 
 En total el proyecto se compone de una imagen.
 1. Para desplegar el proyecto, se deben clonar los dos repisotorios que contienen la apliación web y el servicio log, en principio, para hacer algunas configuraciones:
   ```
   git clone https://github.com/nicolasOL/AMAZON-GATEWAY-Y-LAMBDA/
   ```
 
 2. Para generar las imágenes y los contenedores de cada servicio se deben ejecutar los siguientes comandos:                                                     
  - En el directorio raíz del servicio web:                                                                                     
    Imagen:
    ```
    docker build --tag laboratorio .
    ```
    Contenedor:
    ```
    docker run -d -p 80:6000 --name laboratorio
    ```                                                 
    Al final se ejecuta la imagen con:
      ```
      docker run -d -p 80:6000 --name laboratorio
      ```

 ## Despliegue AWS EC2
 Accediendo al siguiente link se puede tener acceso a la aplicación web:                                                       
 http://ec2-3-95-200-234.compute-1.amazonaws.com/convert
 y usando 
 ```
http://ec2-3-95-200-234.compute-1.amazonaws.com/convert?value=XXXXXXXXXXX
``` 

 ## Despliegue API GATEWAY
 Accediendo al siguiente link se puede tener acceso a la aplicación web:                                                       
 https://gbg4cgsje4.execute-api.us-east-1.amazonaws.com/v1
 y usando 
 ```
https://gbg4cgsje4.execute-api.us-east-1.amazonaws.com/v1?value=XXXXXXXXXXX
``` 

 ## Video funcionamiento
 Accediendo al siguiente link se puede observar el funcionamiento de los servicios:
 https://github.com/nicolasOL/AMAZON-GATEWAY-Y-LAMBDA/blob/master/Video-funcionamiento.mp4

## Documentacion
  
Para encontrar toda la documentación relacionada puedes hacer click [aqui](https://github.com/nicolasOL/AMAZON-GATEWAY-Y-LAMBDA/tree/master/docs)
  
  ## Author
  
  Nicolas Ortega Limas
  
  ## License
  
  This project is licensed under the GNU General Public License v3.0 - see the [LICENSE](https://github.com/nicolasOL/AMAZON-GATEWAY-Y-LAMBDA/blob/master/LICENSE.txt)
