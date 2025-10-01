<?php
// Obtener los datos de la conversión
$valor_original = isset($_GET['valor']) ? floatval($_GET['valor']) : 0;
$unidad_original = isset($_GET['de']) ? $_GET['de'] : '';
$valor_convertido = isset($_GET['resultado']) ? floatval($_GET['resultado']) : 0;
$unidad_convertida = isset($_GET['a']) ? $_GET['a'] : '';
$tipo = isset($_GET['tipo']) ? $_GET['tipo'] : '';

// Definir títulos según el tipo de conversión
$titulos = [
    'moneda' => 'Conversión de Moneda',
    'grados' => 'Conversión de Temperatura',
    'peso' => 'Conversión de Peso/Masa',
    'liquidos' => 'Conversión de Volumen/Líquidos'
];

$titulo = isset($titulos[$tipo]) ? $titulos[$tipo] : 'Resultado de Conversión';

// Definir formatos de unidades según el tipo
if ($tipo == 'grados') {
    $unidad_original = '°' . $unidad_original;
    $unidad_convertida = '°' . $unidad_convertida;
} elseif ($tipo == 'moneda') {
    // Para moneda, ya tenemos los códigos de moneda (MXN, USD, EUR)
    $unidad_original = $unidad_original;
    $unidad_convertida = $unidad_convertida;
} else {
    // Para peso y líquidos, ya tenemos las abreviaturas correctas
    $unidad_original = $unidad_original;
    $unidad_convertida = $unidad_convertida;
}
?>

<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Resultado de Conversión</title>
    <style>
        body {
            font-family: 'Courier New', Courier, monospace;
            line-height: 1.5;
            color: #333;
            background-color: burlywood;
            margin: 0;
            padding: 20px;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }

        .resultado-container {
            background: beige;
            padding: 30px;
            border-radius: 4px;
            box-shadow: 0 1px 3px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            width: 100%;
            text-align: center;
        }

        h1 {
            margin-top: 0;
            margin-bottom: 20px;
            font-size: 1.5rem;
            color: #333;
        }

        .resultado {
            background: white;
            padding: 20px;
            border-radius: 4px;
            margin: 20px 0;
            border: 1px solid #ddd;
            font-size: 1.2rem;
        }

        .enlaces {
            display: flex;
            justify-content: space-between;
            margin-top: 20px;
        }

        a {
            background-color: olivedrab;
            color: white;
            padding: 10px 15px;
            border-radius: 3px;
            text-decoration: none;
            display: inline-block;
        }

        a:hover {
            background-color: olive;
        }
    </style>
</head>

<body>
    <div class="resultado-container">
        <h1><?php echo $titulo; ?></h1>
        <div class="resultado">
            <?php
            echo number_format($valor_original, 2) . " " . $unidad_original . " = " .
                number_format($valor_convertido, 2) . " " . $unidad_convertida;
            ?>
        </div>
        <div class="enlaces">
            <a href="../html/<?php echo $tipo; ?>.html">Nueva conversión</a>
            <a href="../conversor.html">Volver al inicio</a>
        </div>
    </div>
</body>

</html>