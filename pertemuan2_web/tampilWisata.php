<?php
function curl($url)
{
    $ch = curl_init();
    curl_setopt($ch, CURLOPT_URL, $url);
    curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);
    $output = curl_exec($ch);

    if (curl_errno($ch)) {
        echo "cURL Error: " . curl_error($ch);
        curl_close($ch);
        return false;
    }

    curl_close($ch);
    return $output;
}

$send = curl("http://localhost:8081/rekayasaweb/pertemuan2_web/getWisata.php.php");

if ($send) {
    $data = json_decode($send, true);

    if (is_array($data)) {
        foreach ($data as $row) {
            echo $row["id_wisata"] . "<br/>";
            echo $row["kota"] . "<br/>";
            echo $row["landmark"] . "<br/>";
            echo $row["tarif"] . "<br/><hr/>";
        }
    }
}
