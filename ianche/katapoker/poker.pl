use strict;
use warnings;
use Data::Dumper;
my $pack = "234567891012131415";
my $figure_map = {
        'T' => 10,
        'J' => 12,
        'Q' => 13,
        'K' => 14,
        'A' => 15
    };
while (<DATA>){
    my $hand = arange_hand($_);
    my $x = is_straight($hand);
    print Dumper (is_pair($hand));
    print Dumper (is_two_pairs($hand));
    print Dumper (is_three($hand));
    print Dumper (is_four($hand));
    print Dumper (is_straight_flush($hand));
}
sub is_straight_flush {
    my $hand = shift;
    my $count = 0;
    my $str_flush = 0;
    # is it a straight?
    my $str = is_straight($hand);
    print ref $str;
    if ($str->[0] != 0) {
        # if there is only one color, then it's a straight
        if (scalar (keys %{$hand->{'colors'}}) == 1) {
            return [$str->[0], 0];
        }
    }
    return [0,0]
}
sub is_three {
    my $hand = shift;
    my $count = 0;
    my $three_of = 0;
    foreach my $card (keys %{$hand}) {
        next if ($card =~ /sorted|colors|groups/);
        if (scalar @{$hand->{$card}} == 3){
            $three_of = $card;
            $count++;
            last;
        }
    }
    if ($count == 1) {
        if($three_of !~ /\d/) {
            $three_of = $figure_map->{$three_of};
        }
    }
    return [$three_of, 0];
}
sub is_four {
    my $hand = shift;
    my $count = 0;
    my $four_of = 0;
    foreach my $card (keys %{$hand}) {
        next if ($card =~ /sorted|colors|groups/);
        if (scalar @{$hand->{$card}} == 4){
            $four_of = $card;
            $count++;
            last;
        }
    }
    if ($count == 1) {
        if($four_of !~ /\d/) {
            $four_of = $figure_map->{$four_of};
        }
    }
    return [$four_of, 0];
}
sub is_flush {
    my $hand = shift;
    foreach ($hand->{'colors'}) {
        if ($hand->{'colors'}->{$_} == 5) {
            return [1, $hand->{'sorted'}->[scalar($hand->{'sorted'}) - 1]];
        } else {
            return [0, 0];
        }
    }
}

sub is_two_pairs {
    my $hand = shift;
    my @pairs = ();
    my $rest_sum = 0;
    foreach my $card (keys %{$hand}) {
        next if ($card =~ /sorted|colors|groups/);
        if (scalar @{$hand->{$card}} == 2){
            push @pairs, ($card =~ /\d/) ? $card : $figure_map->{$card};
        }
    }
    if (scalar @pairs == 2) {
        @pairs = sort {$b <=> $a} @pairs;
        my @rest = grep {! /^$pairs[0]$/} @{$hand->{'sorted'}};
        @rest = grep {! /^$pairs[1]$/} @rest;
        map {$rest_sum += $_} @rest;
        return [$pairs[0], $rest_sum];
    } else {
        return [0,0]
    }
}

sub is_pair {
    my $hand = shift;
    my $count = 0;
    my $pair_of = 0;
    my $rest_sum = 0;
    foreach my $card (keys %{$hand}) {
        next if ($card =~ /sorted|colors|groups/);
        print $card."\n";
        if (scalar @{$hand->{$card}} == 2){
            $pair_of = $card;
            $count++;
        }
    }
    if ($count == 1) {
        if($pair_of !~ /\d/) {
            $pair_of = $figure_map->{$pair_of};
        }
        my @rest = grep {! /^$pair_of$/} @{$hand->{'sorted'}};
        map {$rest_sum += $_} @rest;
        return [$pair_of, $rest_sum];
    }  else {
        return [0, 0];
    }
}
sub is_straight {
    my $hand = shift;
    my $cards_raw = join '', @{$hand->{'sorted'}};
    if ($pack =~ /$cards_raw/){
        return [$hand->{'sorted'}->[scalar(@{$hand->{'sorted'}}) - 1], 0];
    } else {
        return [0, 0];
    }
}

sub sort_cards {
    my $hand = shift; 
    my @cards = ();
    foreach (keys %{$hand}) {
        push @cards, ($_ =~ /\d/) ? $_ : $figure_map->{$_};
    }
    @cards = sort {$a <=> $b} @cards;
    return @cards;
}
sub group_colors {
    my $hand = shift;
    my $suites = {};
    foreach my $card (keys %{$hand}) {
        next if ($card =~ /sorted|colors|groups/);
        foreach my $symbol (@{$hand->{$card}}) {
            if(!exists $suites->{$symbol}) {
                $suites->{$symbol} = 1
            } else {
                $suites->{$symbol}++;
            }
        }
    }
    return $suites;
}

sub arange_hand {
    my $cards = shift;
    my $hand = {};
    foreach (split / /, $cards) {
        my ($val, $suite) = split (//, $_);
        if (exists $hand->{$val}) {
            push $hand->{$val}, $suite;
        } else {
            $hand->{$val} = [$suite];
        } 
    }
    $hand->{'sorted'} = [sort_cards($hand)];
    $hand->{'colors'} = group_colors($hand);
    print Dumper $hand;
    return $hand;
}
__DATA__
6D 2D 3D 4D 5D
QD TD JD AD KD
