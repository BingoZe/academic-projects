<?php
//model/cidade.php

class Cidade {
    private $codcid;
    private $nomecid;
    private $uf;
    private $conn;
    
    //constructor
    function __construct (){
        $this->connectBD();
    }
    
    //definindo getters & setters
    public function getCodCid(){
        return $this->codcid;
    }
    
    public function setCodCid ($codcid){
        $this->codcid=$codcid;
    }

    public function getNomeCid(){
        return $this->nomecid;
    }
    
    public function setNomeCid($nomecid){
        $this->nomecid=$nomecid;
    }

    
    public function getUF(){
        return $this->uf;
    }
    
    public function setUF($uf){
        $this->uf=$uf;
    }
  //implementando metodo de abstracao do BD
 
    private function connectaBD(){        
        $server = "localhost";
        $user = "root";
        $pass = "root";
        $mydb = "vendas";
        
        $this->conn = new mysqli($server, $user,$pass,$mydb);
        
        if($this->conn->connect_error){
            die("Conexao falhou: ".$conn->connect_error);
        }
    }
    //implementando CRUD
    public function create() {
        $sql = "INSERT INTO cidade(NOMECID,UF) VALUES (' ".$this->getNomeCid()."','.$this->getUF().')";
        $this->conn->query($sql);        
    }
 
    public function update(){
        $sql = "UPDATE cidade SET NOMECID='".$this->getNomeCid()."',UF='".$this->getUF()."' WHERE "
                . "CODCID=".$this->getCodCid();
        $this->conn->query($sql);       
        
    }
 
    public function delete(){
        $sql = "DELETE FROM cidade WHERE CODCID=".$this->getCodCid();
        $this->conn->query($sql);
    }
    
    public function read(){
        $sql = "SELECT * FROM cidade";
        $returnValue = array();
        
        $result = $this->conn->query($sql);
        
        if($result != null){
            while($row = $result->fetch_array(MYSQLI_ASSOC)){
                if(!empty($row)){
                    array_push($returnValue,$row);
                }
            }
        }
        
        return $returnValue;
    }



}
?>

