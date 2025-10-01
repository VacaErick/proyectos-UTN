<?php
$nombre = $_POST['txt_nom'];
$apellidoPat = $_POST['txt_apePat'];
$apellidoMat = $_POST['txt_apeMat'];
$edad = $_POST['txt_edad'];
echo 'El nombre ingresado es: ';
echo $nombre.'<br>';
echo 'El apellido paterno ingresado es: ';
echo $apellidoPat.'<br>';
echo 'El apellido materno ingresado es: ';
echo $apellidoMat.'<br>';
echo 'La edad ingresada es: ';
echo $edad.'<br>';
?>