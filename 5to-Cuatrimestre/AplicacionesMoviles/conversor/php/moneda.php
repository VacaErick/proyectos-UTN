<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $cantidad = floatval($_POST['cantidad']);
    $de_moneda = $_POST['de_moneda'];
    $a_moneda = $_POST['a_moneda'];

    $tasas = [
        'MXN' => 1,
        'USD' => 0.059,
        'EUR' => 0.054
    ];

    $en_mxn = $cantidad / $tasas[$de_moneda];

    $resultado = $en_mxn * $tasas[$a_moneda];

    header("Location: resultado.php?valor=" . $cantidad . "&de=" . $de_moneda . "&a=" . $a_moneda . "&resultado=" . $resultado . "&tipo=moneda");
    exit();
} else {
    header("Location: ../html/moneda.html");
    exit();
}
