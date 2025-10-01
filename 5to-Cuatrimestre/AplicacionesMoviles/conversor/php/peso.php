<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $peso = floatval($_POST['peso']);
    $de_unidad = $_POST['de_unidad'];
    $a_unidad = $_POST['a_unidad'];

    switch ($de_unidad) {
        case 'kg':
            $en_kg = $peso;
            break;
        case 'g':
            $en_kg = $peso / 1000;
            break;
        case 'lb':
            $en_kg = $peso * 0.453592;
            break;
        case 'oz':
            $en_kg = $peso * 0.0283495;
            break;
    }

    switch ($a_unidad) {
        case 'kg':
            $resultado = $en_kg;
            break;
        case 'g':
            $resultado = $en_kg * 1000;
            break;
        case 'lb':
            $resultado = $en_kg / 0.453592;
            break;
        case 'oz':
            $resultado = $en_kg / 0.0283495;
            break;
    }
    
    header("Location: resultado.php?valor=" . $peso . "&de=" . $de_unidad . "&a=" . $a_unidad . "&resultado=" . $resultado . "&tipo=peso");
    exit();
} else {
    header("Location: ../html/peso.html");
    exit();
}
