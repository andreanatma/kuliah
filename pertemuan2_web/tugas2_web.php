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

        echo '<table border="1" cellpadding="10" cellspacing="0">';
        echo '<tr>
                <th>KOTA</th>
                <th>LANDMARK</th>
                <th>TARIF</th>
              </tr>';

        foreach ($data as $row) {
            echo '<tr>';
            echo '<td>' . strtoupper($row["kota"]) . '</td>';
            echo '<td>' . strtoupper($row["landmark"]) . '</td>';
            echo '<td>' . strtoupper($row["tarif"]) . '</td>';
            echo '</tr>';
        }

        echo '</table>';
    }
}
