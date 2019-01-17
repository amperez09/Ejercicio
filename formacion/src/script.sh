#!/bin/sh
echo "Iniciando descarga ... \n"
wget http://samplecsvs.s3.amazonaws.com/Sacramentorealestatetransactions.csv
echo "Modificando archivo ...\n"
python edit.py  #Edita el archivo para su correcta lectura
echo "\n\nNumero de lineas...\n"
wc -l Sacramentorealestatetransactions.csv 
echo "\n\nPrimeras 10 lineas ...\n"
head Sacramentorealestatetransactions.csv
echo "\n\nUltimas 10 lineas ...\n"
tail Sacramentorealestatetransactions.csv
echo "\n\nFiltrado Multi-Family...\n"
grep Multi-Family Sacramentorealestatetransactions.csv
echo "\n\nTerminó ..."
