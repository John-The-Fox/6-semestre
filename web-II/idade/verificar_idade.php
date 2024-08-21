<?php
//dados
$nome = $_POST['nome'];
$data_nascimento = new DateTime($_POST['data_nascimento']);
//$data_nascimento = new DateTime($data_nascimento);
//calculo
$data = new DateTime();
$idade = $data->diff($data_nascimento);
$idade = $idade->y;
//result
if ($idade >= 18) { 
    echo("$nome pode entrar na festa");
}else {
    echo("$nome não pode entrar ");
}


