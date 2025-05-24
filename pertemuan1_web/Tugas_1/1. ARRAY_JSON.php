<?php
// Membuat array
$data = array(
    "nama" => "Andrean",
    "umur" => 22,
    "kota" => "Semarang"
);

// Encode array ke format JSON
$jsonData = json_encode($data);

// Menampilkan hasil
echo $jsonData;
