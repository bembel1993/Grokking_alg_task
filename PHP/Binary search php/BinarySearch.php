<?php

function binary_search($arr, $item)
{
    $low = 0;
    $high = count($arr) - 1;

    while($low <= $high)
    {
        $mid = (int)(($low + $high) / 2);
        $guess = $arr[$mid];
        if($guess == $item)
        {
            return array($mid, $guess);
        } elseif($guess > $item){
            $high = $mid - 1;
        } else {
            $low = $mid + 1;
        }
    }
    return "None"; 
}

$my_list = [1, 3, 5, 7, 9];

print_r(binary_search($my_list, 3));
print_r(binary_search($my_list, -1));

?>