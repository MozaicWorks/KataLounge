use strict;
use warnings;
my $shout;
for (1..100) {
    $shout = '';
    if ($_ % 3 == 0) {
        $shout .= 'Fizz';
    }
    if ($_ % 5 == 0) {
        $shout .= 'Buzz';
    }
    $shout = $_ if ($shout eq '');
    print $shout."\n";
}
