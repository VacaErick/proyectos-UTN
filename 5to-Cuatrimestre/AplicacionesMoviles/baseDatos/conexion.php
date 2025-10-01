<?php

$server = "localhost";
$user = "root";
$pass = "";
$db = "tienda";
$conexion = mysqli_connect($server, $user, $pass, $db);
if ($conexion->connect_errno) {
    die("conexion fallida" . $conexion->connect_errno);
} else {
    echo "EL REGISTRO FUE EXITOSO ";
}
?>
<?php
if (isset($_POST['registro'])) {
    $nombre = $_POST['nombre'];
    $precio = $_POST['precio'];
    $descripcion = $_POST['descripcion'];

    $insertarproducto = "INSERT INTO producto VALUES(' ','$nombre', '$precio','$descripcion')";
    $ejecutarInsertar = mysqli_query($conexion, $insertarproducto);
}
