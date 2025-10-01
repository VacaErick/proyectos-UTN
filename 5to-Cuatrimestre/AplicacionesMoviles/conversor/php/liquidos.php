<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $volumen = floatval($_POST['volumen']);
    $de_unidad = $_POST['de_unidad'];
    $a_unidad = $_POST['a_unidad'];

    switch ($de_unidad) {
        case 'l':
            $en_litros = $volumen;
            break;
        case 'ml':
            $en_litros = $volumen / 1000;
            break;
        case 'gal':
            $en_litros = $volumen * 3.78541;
            break;
        case 'oz':
            $en_litros = $volumen * 0.0295735;
            break;
    }

    switch ($a_unidad) {
        case 'l':
            $resultado = $en_litros;
            break;
        case 'ml':
            $resultado = $en_litros * 1000;
            break;
        case 'gal':
            $resultado = $en_litros / 3.78541;
            break;
        case 'oz':
            $resultado = $en_litros / 0.0295735;
            break;
    }

    header("Location: resultado.php?valor=" . $volumen . "&de=" . $de_unidad . "&a=" . $a_unidad . "&resultado=" . $resultado . "&tipo=liquidos");
    exit();
} else {
    header("Location: ../html/liquidos.html");
    exit();
}
