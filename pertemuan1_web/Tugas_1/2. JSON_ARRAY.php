<?php
// JSON string
$jsonString = '{
    "nama": "Andrean Atma",
    "umur": 22,
    "kota": "Semarang",
    "universitas": "Universitas Semarang",
    "program_studi": "Teknik Informatika",
    "mata_kuliah": "Rekayasa Web"
}';

// Decode JSON ke array
$dataArray = json_decode($jsonString, true);

// Membuat kalimat gabungan
$output = "JSON to Array_"
    . $dataArray['nama'] . "_"
    . $dataArray['umur'] . " tahun_"
    . $dataArray['kota'] . "_"
    . $dataArray['universitas'] . "_"
    . "Program studi " . $dataArray['program_studi'] . "_"
    . "Mata Kuliah " . $dataArray['mata_kuliah'];

// Tampilkan hasil
echo $output;
