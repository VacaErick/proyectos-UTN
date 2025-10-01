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

if (isset($_POST['consulta2'])) {
    $codigo = $_POST['codigo'];
    $resultados = mysqli_query($conexion, "select * from producto where codigo = $codigo");
    while ($consulta = mysqli_fetch_array($resultados)) {
        echo
        "
    <table width=\"100%\" border=\"1\">
    <tr>
    <td><b><center>CODIGO</center></b></td>
    <td><b><center>NOMBRE</center></b></td>
    <td><b><center>PRECIO</center></b></td>
    <td><b><center>DESCRIPCION</center></b></td>
    </tr>
    <tr>
    <td><center>" . $consulta['codigo'] . " </center></td>
    <td><center>" . $consulta['nombre'] . " </center></td>
    <td><center>" . $consulta['precio'] . " </center></td>
    <td><center>" . $consulta['descripcion'] . " </center></td>
    </tr>
    </table>
    ";
    }
}
