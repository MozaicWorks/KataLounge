use strict;
use warnings;

my $nr_bits = 5;
my $adjacent;
my $mask;
my $shift_left_bits;
my $bad;
my $count_non_adjacent = 0;

# first we need to know the range of integers having $nr_bits
my $last = 2**$nr_bits-1;

for (my $i = 0; $i<=$last; $i++) {
    # two adjacent bits means 3(11) shifted to the left
    $adjacent = 3;
    $shift_left_bits = 0;
    $bad = 0;
    while(1) {
        $mask = $adjacent << $shift_left_bits;
        last if ($mask > $last);
        $shift_left_bits++;
        if (($mask & $i) == $mask) {
            $bad = 1;
            last;
        }
    }
    $count_non_adjacent++ if (!$bad);
}
print "$nr_bits bits binary numbers with non adjacent 1 bits: $count_non_adjacent\n";
