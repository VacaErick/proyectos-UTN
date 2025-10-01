<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $conversor = $_POST['conversor'];

    switch ($conversor) {
        case 'moneda':
            header("Location: ../html/moneda.html");
            break;
        case 'grados':
            header("Location: ../html/grados.html");
            break;
        case 'peso':
            header("Location: ../html/peso.html");
            break;
        case 'liquidos':
            header("Location: ../html/liquidos.html");
            break;
        default:
            echo "Selección no válida. <a href='../conversor.html'>Volver</a>";
            break;
    }
    exit();
} else {
    header("Location: ../conversor.html");
    exit();
}
