<?php

require_once 'model_cidade.php';


class cidadeController {
    public function listar(){
        $cidade = newCidade();
        $cidades = $cidades->read();
        
        $_REQUEST["cidades"]=$cidades;
        
        require_once 'view_Cidade.php';
    }
}

?>


