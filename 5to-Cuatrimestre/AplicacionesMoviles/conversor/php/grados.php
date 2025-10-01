<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $temp = floatval($_POST['temperatura']);
    $de_grado = $_POST['de_grado'];
    $a_grado = $_POST['a_grado'];
    $resultado = 0;

    switch ($de_grado) {
        case 'C':
            $en_celsius = $temp;
            break;
        case 'F':
            $en_celsius = ($temp - 32) * 5 / 9;
            break;
        case 'K':
            $en_celsius = $temp - 273.15;
            break;
    }

    switch ($a_grado) {
        case 'C':
            $resultado = $en_celsius;
            break;
        case 'F':
            $resultado = ($en_celsius * 9 / 5) + 32;
            break;
        case 'K':
            $resultado = $en_celsius + 273.15;
            break;
    }

    header("Location: resultado.php?valor=" . $temp . "&de=" . $de_grado . "&a=" . $a_grado . "&resultado=" . $resultado . "&tipo=grados");
    exit();
} else {
    header("Location: ../html/grados.html");
    exit();
}
